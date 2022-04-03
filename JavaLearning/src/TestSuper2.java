class Animal{  
void eat(){System.out.println("eating...");}  
}  
class Dog extends Animal{  
void eat(){System.out.println("eating bread...");}  
void bark(){System.out.println("barking...");}  
void work(){
eat();
super.eat();  
bark();  
}  
}  
public class TestSuper2{  
public static void main(String args[]){  
Dog d=new Dog();  
d.work();  
}}  
/*
8) How to Compare Two Objects in Java
9) How to Create Object in Java
10) How to Print ASCII Value in Java
1) How to Reverse a Number in Java
2) Java Program to convert Number to Word
3) Automorphic Number Program in Java
4) Peterson Number in Java
5) Sunny Number in Java
*/