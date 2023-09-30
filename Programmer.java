import java.io.*;
class Employee{
    float salary=40000;
}
class Programmer extends Employee{
    int bonus=10000;
    public static void main(String[] args){
        Programmer p=new Programmer();
        System.out.println("Salary of the programmer is "+p.salary);
        System.out.println("Bonus of the programmer is "+p.bonus);
        float grosssalary=p.salary+p.bonus;
        System.out.println("Gross salary of programmer is "+grosssalary);
    }
}
output
Salary of the programmer is 40000.0
Bonus of the programmer is 10000
Gross salary of programmer is 50000.0
