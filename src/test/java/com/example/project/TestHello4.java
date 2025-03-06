package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import java.io.*;

public class TestHello4 {

    
    @Test
    public void testHelloWorld()
    {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));

        // action
        Hello4.main(null);

        // assertion
        assertEquals("Hello world4!", bos.toString());

        // undo the binding in System
        System.setOut(originalOut);
    }


}
