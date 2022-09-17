package com.example.springbootproject1;

import com.example.springbootproject1.model.CollegeStudent;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

@SpringBootApplication
public class SpringbootProject1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootProject1Application.class, args);
	}

//	@Bean("collegeStudent")
//	@Scope(value = "prototype")
//	CollegeStudent getCollegeStudent(){
//		return new CollegeStudent();
//	}
}
