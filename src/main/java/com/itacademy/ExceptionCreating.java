package com.itacademy;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionCreating extends Exception {

    public ExceptionCreating (String message)
    {
        super(message);
    }

    public static void doSmth (int a)                                               // вариант обработки- throws ExceptionCreating (так себе)
    {
        if (a > 1) {
            try {
                FileReader fileReader = new FileReader("testfile.txt");
                throw new ExceptionCreating("My Exception");
            }
            catch (FileNotFoundException e)
            {
                System.out.println("Такого файла нет");
            }
            catch (ExceptionCreating e) {
                //System.out.println(e.getMessage());
                System.out.println("Обработка исключения");
            }

//            try {
//
//            } catch (FileNotFoundException e) {
//                System.out.println("Такого файла нет :)");
//            }
        }
    }

}
