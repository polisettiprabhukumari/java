import java.io.*;
class Animal{
    void eat(){
        System.out.println("Animal can eat");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Dog can bark");
    }
}
class BabyDog extends Dog{
    void weep(){
        System.out.println("Baby Dog is weeping");
    }
}
class MultiLevelInheritanceDemo{
    public static void main(String[] args){
        BabyDog bd=new BabyDog();
        bd.weep();
        bd.bark();
        bd.eat();
    }
}
output
Baby Dog is weeping
Dog can bark
Animal can eat
