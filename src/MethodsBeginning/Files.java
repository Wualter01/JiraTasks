package MethodsBeginning;

import java.io.File;
import java.io.FileWriter;
import java.io.IOError;
import java.io.IOException;

public class Files {
    public static void main(String[] args) throws IOException {
        String a="Hello world";
        StringBuffer sb=new StringBuffer(a);
        System.out.println(sb.reverse());

        /*
        File file1=new File ( pathname: " /Users/sevginhekimogLu/Desktop/javafiles/hello.pdf"); file1.createNewFile();
        didnt work for me but this is the syntax. above is another way to do string reverse you have a packet in your
        computer with methods to solve problems
         */
    }
}
