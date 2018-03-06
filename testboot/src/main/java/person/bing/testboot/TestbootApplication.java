package person.bing.testboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
@MapperScan("person.bing.testboot.user.dao.java")
public class TestbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestbootApplication.class, args);
	}
	@RequestMapping(value = "/",produces = "text/plain;charset=UTF-8")
	String test(){
		System.out.println("success");
		return "success";
	}
}
