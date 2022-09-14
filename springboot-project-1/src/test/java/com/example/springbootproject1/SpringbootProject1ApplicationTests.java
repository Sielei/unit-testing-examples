package com.example.springbootproject1;

import com.example.springbootproject1.model.CollegeStudent;
import com.example.springbootproject1.model.StudentGrades;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SpringbootProject1ApplicationTests {

	@Value("${info.school.name}")
	private String schoolName;

	@Value("${info.app.name}")
	private String appName;

	@Value("${info.app.description}")
	private String appDescription;

	@Value("${info.app.version}")
	private String appVersion;

	@Autowired
	private CollegeStudent collegeStudent;

	@Autowired
	private StudentGrades studentGrades;


	@BeforeEach
	public void init(){
		System.out.println("SchoolName: " + schoolName + "\nAppName: " + appName + "\nAppDescription: " + appDescription
				+ "\nAppVersion: " + appVersion);

		studentGrades.setMathGradeResults(new ArrayList<>(
				Arrays.asList(100.0, 85.0, 76.50, 91.75)
		));
		collegeStudent = CollegeStudent.builder()
				.firstname("Java")
				.lastname("Coder")
				.emailAddress("jcoder@java.com")
				.studentGrades(studentGrades)
				.build();

		System.out.println(collegeStudent);
	}

	@Test
	@DisplayName("Test for adding student grades correctly")
	void addsStudentGrades() {
		assertEquals(353.25, studentGrades.addGradeResultsForSingleClass(studentGrades.getMathGradeResults()));
		assertNotEquals(100, studentGrades.addGradeResultsForSingleClass(collegeStudent.getStudentGrades().getMathGradeResults()));
	}

	@Test
	@DisplayName("Test grade comparison")
	void testIsGradeGreater(){
		assertTrue(studentGrades.isGradeGreater(90.0, 76.55));
		assertFalse(studentGrades.isGradeGreater(76.99, 100.0));
	}

	@Test
	@DisplayName("Test for null grades")
	void checkForNullStudentGrades(){
		assertNotNull(studentGrades.checkNull(collegeStudent.getStudentGrades().getMathGradeResults()));
	}

}
