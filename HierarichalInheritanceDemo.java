import java.io.*;
class Animal{
    void eat(){
        System.out.println("Animal can eat");
    }
}
class Dog extends Animal{
    void  bark(){
        System.out.println("Dog can bark");
    }
}
class Cat extends Animal{
    void meow(){
        System.out.println("Cat can makes sound");
    }
}
class HierarichalInheritanmceDemo{
    public static void main(String[] args){
        Dog d=new Dog();
        Cat c=new Cat();
        d.bark();
        c.meow();
        d.eat();
        c.eat();
    }
}

output:
Dog can bark
Cat can makes sound
Animal can eat
Animal can eat
