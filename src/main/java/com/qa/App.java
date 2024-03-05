package com.qa;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println(sayHello());
        System.out.println(sayHelloToSomeone("| | | | ___| | | ___   \ \      / /__  _ __| | __| | |"));
        System.out.println(sayHelloToSomeone("| |_| |/ _ \ | |/ _ \   \ \ /\ / / _  | |__| |/ _ | |"));
        System.out.println(sayHelloToSomeone("|  _  |  __/ | | (_) |   \ V  V / (_) | |  | | (_| |_|"));
        System.out.println(sayHelloToSomeone("|_| |_|\___|_|_|\___/     \_/\_/ \___/|_|  |_|\____"));
        System.out.println(sayGoodbye());
    }

    public static String sayHello(){
        return "Hello World!";
    }

    public static String sayGoodbye(){
        return "Goodbye World!";
    }

    public static String sayHelloToSomeone(String name){
        return "Hello " + name ;
    }
}
