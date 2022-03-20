package com.docker.tutorial;

import lombok.AllArgsConstructor;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;


@AllArgsConstructor
class ExampleApplicationTests {

    private Map<String, String> map = new HashMap<>();

    @Test
    public void test() {
        System.out.println("here ");
    }
}
