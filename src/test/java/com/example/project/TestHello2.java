package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import java.io.*;

public class TestHello2 {

    
    @Test
    public void testHelloWorld()
    {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));

        // action
        Hello2.main(null);

        // assertion
        assertEquals("Hello worl546546d2!", bos.toString());

        // undo the binding in System
        System.setOut(originalOut);
    }


}
