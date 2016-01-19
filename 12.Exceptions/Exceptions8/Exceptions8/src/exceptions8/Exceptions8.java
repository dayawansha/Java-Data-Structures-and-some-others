package exceptions8;

import java.io.IOException;

public class Exceptions8 {

  
    void m() throws IOException {
        throw new IOException();
    }

    public static void main(String[] args) {

        Exceptions8 a = new Exceptions8();
        try {
            a.m();
        }
       // System.out.println("out try catch");  ///  try walata pasu aniwa catch paminiya uthuya
        catch (IOException e) {
        }
        
    }
}
