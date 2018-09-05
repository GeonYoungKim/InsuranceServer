package com.geonyeong.insurance.controller;

import com.geonyeong.insurance.entity.GuideFileEntity;
import com.geonyeong.insurance.service.FileService;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;
import java.io.File;
import java.io.FileInputStream;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/file/*")
public class FileController {
    @Inject
    private FileService fileService;

    @GetMapping(value = "/download")
    public ResponseEntity<Object> download(@RequestParam("guideId") long guideId, @RequestParam("guideNo") long guideNo, @RequestParam("no") long no) {
        System.out.println("다운로드");

        GuideFileEntity guideFileEntity = fileService.selectOneFile(guideId, guideNo, no);
        File file;
        InputStreamResource resource;
        try {
            file = new File(guideFileEntity.getRoute());
            resource = new InputStreamResource(new FileInputStream(file));
            HttpHeaders headers = new HttpHeaders();
            headers.add("Content-Disposition", String.format("attachment; filename=\"%s\"", file.getName()));
            headers.add("Cache-Control", "no-cache,no-store, must-revalidate");
            headers.add("Pragma", "no-cache");
            headers.add("Expires", "0");
            ResponseEntity<Object> responseEntity = ResponseEntity.ok().headers(headers).contentLength(file.length()).contentType(MediaType.parseMediaType("application/octet-stream")).body(resource);
            return responseEntity;
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<Object>("error occurren", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
