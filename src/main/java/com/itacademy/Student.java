package com.itacademy;

import java.util.*;

public class Student implements Comparable <Student>  {

    private String name;
    private int age;

    public Student (String name, int age)
    {
        this.name=name;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public static void doSmth ()
    {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Pasha",18));
        students.add(new Student("Angella", 24));
        students.add(new Student("Vera",19));
        System.out.println();
        for (Student student: students )
        {
            System.out.println("Name:"+ student.getName()+ " Age:"+ student.getAge());
        }
        //students.remove(new Student("Vera", 19));
        students.remove(2);
        System.out.println("Кто-то пропал)");
        for (Student student: students )
        {
            System.out.println("Name:"+ student.getName()+ " Age:"+ student.getAge());

        }

        System.out.println();

        HashSet<Student> hashSet= new HashSet<>();
        hashSet.add(new Student("Vlad",58));
        hashSet.add(new Student("Masha", 17));
        hashSet.add(new Student("Nick",29));

        for (Student student: hashSet)
        {
            System.out.println("Student Hash Name:"+ student.getName()+ "," +" Sdudent Hash Age:"+ student.getAge());
        }
        //hashSet.remove(new Student("Nick", 29));
        hashSet.remove(2);
        System.out.println("Кто-то пропал)");
        hashSet.remove(new Student("Nick",29));
       // boolean isRemoved = hashSet.remove(1);
        for (Student student: hashSet )
        {
            System.out.println("Student Hash Name:"+ student.getName()+ "," +" Sdudent Hash Age:"+ student.getAge());
        }
        System.out.println();

        LinkedHashSet<Student> students1 = new LinkedHashSet<>();
        students1.add(new Student("Sofia",51));
        students1.add(new Student("Oleg", 25));
        students1.add(new Student("Vania",32));
        for (Student student: students1)
        {
            System.out.println("Linked Hash Set Student:"+ student.getName()+ ","+ " Linked Hash Set Student Age:"+ student.getAge());
        }
        students1.remove(new Student("Vania", 32));
        System.out.println("Кто-то пропал)");
        for (Student student: students1 )
        {
            System.out.println("Name:"+ student.getName()+ " Age:"+ student.getAge());
        }
        System.out.println();

        Set<Student> studentTreeSet = new TreeSet<>(); // (s1,s2)->s1.getName().compareTo(s2.getName())
        studentTreeSet.add(new Student("Gorgic",54));
        studentTreeSet.add(new Student("Olesia", 26));
        studentTreeSet.add(new Student("Margo",28));
        for (Student student: studentTreeSet)
        {
            System.out.println("Student Tree Set Name:"+ student.getName()+ ","+ " Student Tree Set Age:"+ student.getAge());
        }
        studentTreeSet.remove(2);
        System.out.println("Кто-то пропал)");
        for (Student student: studentTreeSet )
        {
            System.out.println("Name:"+ student.getName()+ " Age:"+ student.getAge());
        }
        System.out.println();

        HashMap <String, Student> studentHashMap = new HashMap<>();
        studentHashMap.put("one", new Student("Bart",23));
        studentHashMap.put("two", new Student("Marge", 33));
        studentHashMap.put("three",new Student("Gomer", 38));
        for (String hashKey: studentHashMap.keySet())
        {
            Student student= studentHashMap.get(hashKey);
            System.out.println("Student Hash Map Name:"+ student.getName()+ ","+ " Student Hash Map Age:"+ student.getAge());
        }
        studentHashMap.remove("two");
        System.out.println("Кто-то пропал)");
        for (String key: studentHashMap.keySet())
        {
            Student student= studentHashMap.get(key);
            System.out.println("Name:"+ student.getName()+ " Age:"+ student.getAge());
        }
    }
    @Override
    public int compareTo (Student stu)
    {
        return this.age - stu.age;
    }
    @Override
    public int hashCode ()
    {
        return 31*name.hashCode()+age;
    }
}