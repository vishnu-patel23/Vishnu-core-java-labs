package com.deloitte.lab09.ex04;
/*
 * Exercise 4: Write a class with main method to demonstrate instance creation
 *  using method reference. (Hint: Create any simple class with attributes and getters and setters)
 */

class Person {
 private String name;
 private int age;

 public Person(String name, int age) {
     this.name = name;
     this.age = age;
 }

 public String getName() {
     return name;
 }

 public void setName(String name) {
     this.name = name;
 }

 public int getAge() {
     return age;
 }

 public void setAge(int age) {
     this.age = age;
 }

 @Override
 public String toString() {
     return "Person{name='" + name + "', age=" + age + '}';
 }
}
@FunctionalInterface
interface PersonFactory {
 Person create(String name, int age);
}

public class App {

 public static void main(String[] args) {
     PersonFactory personFactory = Person::new;
     Person person = personFactory.create("Rom", 30);
     System.out.println(person);
 }
}
