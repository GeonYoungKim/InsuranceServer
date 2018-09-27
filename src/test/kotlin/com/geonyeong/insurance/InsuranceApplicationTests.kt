package com.geonyeong.insurance

import org.junit.Test
import org.junit.Assert.assertThat
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import org.hamcrest.CoreMatchers.equalTo

@RunWith(SpringRunner::class)
@SpringBootTest
class InsuranceApplicationTests {

	@Test
	fun contextLoads() {
		assertThat("good",equalTo("good"))
	}

}
