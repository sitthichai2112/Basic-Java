package com.company;

import com.sun.istack.internal.Nullable;


public class Main {

//// #1
    //    public static void main(String[] args) {
//        int Basic = Basic1();
//
//        System.out.print(Basic);
//
//    }
//
//    private static int Basic1() {
//        int a = 1;
//        int b = 2;
//
//        return a + b;
//
//    }
//
//    public String getNameIfPresent() {
//
//        String a = "a";
//
//        return a;
//    }

    //// #2 Overload
    public static void sayHello() {

        System.out.println("Hello, JAVA");

    }

    public static void sayHello(String name) {

        System.out.println("Hello, " + name.toString());

    }

    public static void main(String args[]) {

        sayHello();
        sayHello("amplysoft");

    }


}

///// #3  Interface Class Java
interface Interface {
    void sayHello();

    void sayWebsite();
}

class Sample implements Interface {
    public void sayHello() {
        System.out.println("amplysoft");
    }

    public void sayWebsite() {
        System.out.println("www.amplysoft.com");
    }
}

class Program {
    public static void main(String args[]) {
        Sample s = new Sample();
        s.sayHello();
        s.sayWebsite();
    }
}
