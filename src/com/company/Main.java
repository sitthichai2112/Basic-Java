package com.company;

import com.sun.istack.internal.Nullable;


//public class Main {

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
//    public static void sayHello() {
//
//        System.out.println("Hello, JAVA");
//
//    }
//
//    public static void sayHello(String name) {
//
//        System.out.println("Hello, " + name.toString());
//
//    }
//
//    public static void main(String args[]) {
//
//        sayHello();
//        sayHello("amplysoft");
//
//    }
//
//
//}

///// #3  Interface Class Java การสืบทอดที่สามาีถมีแค่ชื่อ เมดธอด
//interface Interface {
//    void sayHello();
//
//    void sayWebsite();
//}
//
//class Sample implements Interface {
//    public void sayHello() {
//        System.out.println("amplysoft");
//    }
//
//    public void sayWebsite() {
//        System.out.println("www.amplysoft.com");
//    }
//}
//
//class Program {
//    public static void main(String args[]) {
//        Sample s = new Sample();
//        s.sayHello();
//        s.sayWebsite();
//    }
//}


//// #4 Abstract class การสืบทอดที่สามาีถมีแค่ชื่อหรือการทำงานใน เมดธอด
//abstract class Abstract {
//    public void sayHello(){
//        System.out.println( "amplysoft" );
//    }
//    abstract void sayWebsite();
//}
//
//class Sample extends Abstract  {
//    public void sayWebsite(){
//        System.out.println("www.amplysoft.com");
//    }
//}
//
//class Program {
//    public static void main(String args[]){
//        Sample s = new Sample();
//        s.sayHello();
//        s.sayWebsite();
//    }
//}


/// #5 Inheritance การสืบทอด

//class Inheritance {
//    public static void getName() {
//        System.out.println("amplysoft");
//    }
//
//    public static void getWebSite() {
//        System.out.println("www.amplysoft.com");
//    }
//}
//
//class Child extends Inheritance {
//    public static void main(String args[]) {
//        getName();
//        getWebSite();
//    }
//}

///#6 Override Methodd การสรา้งชื่อ  method  เดิม แต่การทำงานใหม่  ในคลาสลูก

class Override {
    public static void getWebSite(String name) {
        System.out.println(name);
    }
}

class Program extends Override {
    public static void getWebSite(String name) {
        System.out.println("124" + name);
    }

    public static void main(String args[]) {
        getWebSite("www.amplysoft.com");
    }
}