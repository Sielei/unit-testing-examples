package com.prj.one;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

public class ConditionalTest {

    @Test
    @Disabled("Dont run until issue a certain issue is resolved")
    void basicTest(){}

    @Test
    @DisabledOnOs(OS.MAC)
    void testOnWindowsAndLinux(){}

    @Test
    @EnabledOnOs(OS.WINDOWS)
    void testOnWindowsOnly(){}

    @Test
    @EnabledOnJre(JRE.JAVA_11)
    void testOnJavaEleven(){}

    @Test
    @EnabledForJreRange(min = JRE.JAVA_11)
    void testOnJavaElevenOrHigher(){}

    @Test
    @DisabledForJreRange(min = JRE.JAVA_8, max = JRE.JAVA_11)
    void testNotEnabledForJavaEightToEleven(){}

    @Test
    @EnabledIfSystemProperty(named = "HASH_KEY", matches = "KEY")
    void testIfSystemPropertyIsSet(){}

    @Test
    @EnabledIfEnvironmentVariable(named = "DB_CONNECTION", matches = "*")
    void testIfEnvironmentVariableIsSet(){}

}
