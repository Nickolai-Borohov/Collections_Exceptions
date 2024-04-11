package com.itacademy;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.TreeSet;
/**
 * Hello world!
 *
 */


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
//      try {
//          ExceptionCreating.doSmth(4);
//      }
//      catch (ExceptionCreating e)
//      {
//          System.out.println("Обработка исключения");
//      }
//      catch (FileNotFoundException e)
//      {
//          System.out.println("File not found");
//      }
        ExceptionCreating.doSmth(4);
        Student.doSmth();
    }

}

