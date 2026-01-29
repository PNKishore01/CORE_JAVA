/***
 * Inheritance---
 *  Inheritance is one pillar of Object oriented programming(oops) concept
 *  The class properties and behvaiour (variables and method) is acquiring from one class to another class is known as Inheritance
 *  By using extends keyword , we have extends the base class properties
 *  Base class is known as parent class, sub class is known as child class
 * 
 *  There are five types:
 *  1.Single, 2.Multi_level, 3.Heirarchal, 4.Multiple, 5.Hybird
 *  
 *  Multiple is not supported in classes..
 */

/**
 * Single_Inheritance:- 
 * one base properties and behaviours is acquring to another class is know as Single Inheritance
 */

class One{

    int a = 10;

    public void m1(String s){
        System.out.println("It is from base class: " + s);
    }
}

class SingleInheritance extends One{

    public void m2(String s){
        System.out.println("It is from sub class: " + s);
    }

    public static void main(String[] args){
        SingleInheritance obj = new SingleInheritance();
        System.out.println(obj.a);
        obj.m1("Hello");
        obj.m2("Bye");
    }
}