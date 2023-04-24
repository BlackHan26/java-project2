package com.example.javaproject22;
import java.io.IOException;

import java.io.InputStreamReader;
public class JavaInput {
    public void readAchar() throws IOException {
        InputStreamReader is=new InputStreamReader(System.in);
        System.out.println(is.read());
    }
    public void readTwoChars() throws IOException {
        InputStreamReader is=new InputStreamReader(System.in);
        int asciiCode1=is.read();
        int asciicode2=is.read();

        System.out.println(asciiCode1);
        System.out.println(asciicode2);
    }
}
