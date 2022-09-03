package com.prj.one;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
//@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
//@DisplayNameGeneration(DisplayNameGenerator.Simple.class)
//@DisplayNameGeneration(DisplayNameGenerator.IndicativeSentences.class)
//@DisplayNameGeneration(DisplayNameGenerator.Standard.class)
class ProjectOneTest {

    ProjectOne projectOne;

    @BeforeAll
    static void setUpBeforeAllMethods(){
        System.out.println("@BeforeAll all executes once before all methods");
    }

    @AfterAll
    static void tearDownAfterAllMethods(){
        System.out.println("@AfterAll is executed once after all methods");
    }

    @BeforeEach
    void setUpBeforeEachMethod(){
        projectOne = new ProjectOne();
        System.out.println("@BeforeEach executes before each method");
    }

    @AfterEach
    void tearDownAfterEachMethod(){
        System.out.println("@AfterEach executes after each method");
    }



    @Test
    @DisplayName("Test if addition method works correctly")
    void testAddMethodReturnsCorrectValue(){
        //setup
        assertEquals(6, projectOne.add(2, 4), "2 + 4 must be 6");
        assertNotEquals(6, projectOne.add(1, 9), "1 + 9 must not equal 6");
        System.out.println("executing test: testAddMethodReturnsCorrectValue");
    }

    @Test
    @DisplayName("Test if an object is null or not null")
    void testCheckNullMethod() {
        String str1 = null;
        String str2 = "Hello world!!";
        assertNull(projectOne.checkNull(str1), "Object should be null");
        assertNotNull(projectOne.checkNull(str2), "Object should not be null");
        System.out.println("executing test: testCheckNullMethod");
    }

    @Test
    @DisplayName("Test isGreaterThan method")
    void testIsGreaterThanMethod(){
        assertTrue(projectOne.isGreaterThan(12, 5), "12 > 5 must be true");
        assertFalse(projectOne.isGreaterThan(12, 22), "12 > 22 must be false");
    }

    @Test
    @DisplayName("Test if arrays are equal")
    void testArrayEquals(){
        String[] strings = {"My", "name", "is", "Hulk"};
        assertArrayEquals(strings, projectOne.getStrings(), "Arrays must be equal");
    }
}