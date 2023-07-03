package org.fasttrackit.tema8;

import org.fasttrackit.tema8.exercise1.Company;
import org.fasttrackit.tema8.exercise1.EmailAdd;
import org.fasttrackit.tema8.exercise1.FacebookAdd;
import org.fasttrackit.tema8.exercise1.PrintAdd;
import org.fasttrackit.tema8.exercise2.*;
import org.fasttrackit.tema8.exercise3.*;
import org.fasttrackit.tema8.exercise4.Student;

public class Main {
    public static void main(String[] args) {

        //ex1
        System.out.println("-----------ex1----------");

        EmailAdd emailAdd = new EmailAdd();
        FacebookAdd facebookAdd = new FacebookAdd();
        PrintAdd printAdd = new PrintAdd();
        Company add = new Company(emailAdd, facebookAdd, printAdd);
        add.publishToEmail("pe e-mail");
        add.publishToFacebook("pe Facebook");
        add.publishToPrint("pe print");

        //ex2
        System.out.println("-----------ex2----------");

        TotalAmount totalAmount = new TotalAmount(1500);
        BRD brdBank = new BRD();
        BT btBank = new BT();
        ING ingBank = new ING();
        BankServer bank = new BankServer(brdBank, btBank, ingBank, totalAmount);
        bank.withdrawFromBRD(1000);
        bank.depositToBRD(350);
        bank.withdrawFromBT(1.5);
        bank.depositToBT(0.5);
        bank.withdrawFromING(449);
        bank.depositToING(700);

        //ex3
        System.out.println("-----------ex3----------");

        Cat cat = new Cat();
        Chicken chicken = new Chicken();
        Dog dog = new Dog();
        Duck duck = new Duck();
        Mouse mouse = new Mouse();

        cat.eat();
        cat.talk();
        cat.walk();

        System.out.println("---------------------");

        chicken.eat();
        chicken.talk();
        chicken.walk();

        System.out.println("---------------------");

        dog.eat();
        dog.talk();
        dog.walk();

        System.out.println("---------------------");

        duck.eat();
        duck.talk();
        duck.walk();

        System.out.println("---------------------");

        mouse.eat();
        mouse.talk();
        mouse.walk();

        //ex4
        System.out.println("-----------ex4----------");
        Student student1 = new Student("Beatrice", 90);
        Student student2 = new Student("Florin", 80);
        Student student3 = new Student("Maya", 85);
        Student student4 = new Student("Octavian", 60);

        student1.getName();
        student1.getGrade();
        System.out.println("---------------------");
        student2.getName();
        student2.getGrade();
        System.out.println("---------------------");
        student3.getName();
        student3.getGrade();
        System.out.println("---------------------");
        student4.getName();
        student4.getGrade();
        System.out.println("---------------------");
        System.out.println("Average note for the students is : " + Student.averageGrade());
    }
}
