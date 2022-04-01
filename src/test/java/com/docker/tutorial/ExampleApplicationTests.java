package com.docker.tutorial;

import lombok.AllArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.Arrays;


@AllArgsConstructor
class ExampleApplicationTests {

    public static int getTotalNumberOfLettersOfNamesLongerThanFive(String... names) {
        return Arrays.stream(names)
                .filter(s -> s.length() > 4)
                .mapToInt(String::length)
                .reduce(0, Integer::sum);
    }

    @Test
    public void test() {

        var getTotalNumberOfLettersOfNamesLongerThanFive = getTotalNumberOfLettersOfNamesLongerThanFive("Alexandru", "Alexandru");

        System.out.println(getTotalNumberOfLettersOfNamesLongerThanFive);
    }

    @Test
    public void testBcrypt() {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        System.out.println(encoder.encode("pass"));
    }


}
