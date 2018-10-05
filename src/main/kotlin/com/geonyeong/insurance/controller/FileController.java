package com.geonyeong.insurance.controller;

import com.geonyeong.insurance.dto.GuideFileDto;
import com.geonyeong.insurance.entity.GuideFileEntity;
import com.geonyeong.insurance.service.FileService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/file/*")
@AllArgsConstructor
public class FileController {

    private final ResourceLoader resourceLoader;

    private final FileService fileService;

    @GetMapping(value = "/download")
    public ResponseEntity<Object> download(@ModelAttribute GuideFileDto guideFile) throws IOException {

        System.out.println("다운로드");
        final String FILE_PATH = resourceLoader.getResource("classpath:files").getURI().getPath() + "\\";
        GuideFileEntity guideFileEntity = fileService.selectOneFile(guideFile);
        File file;
        InputStreamResource resource;
        try {
            file = new File(FILE_PATH + guideFileEntity.getRoute());
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
