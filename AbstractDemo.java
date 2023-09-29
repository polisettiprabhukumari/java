//Java program to demonstrate abstract class
//04/09/2023
//AbstractDemo.java
import java.io.*;
import java.util.*;
abstract class Animal{
    public abstract void AnimalSound();
     void eat(){
        System.out.println("I can eat");
        
    }
}
class Cow extends Animal{
    public void AnimalSound(){
        System.out.println("The cow sounds maa");
    }
}
class AbstractDemo{
    public static void main(String args[]){
        Cow c = new Cow();
        c.AnimalSound();
        c.eat();
    }
}
