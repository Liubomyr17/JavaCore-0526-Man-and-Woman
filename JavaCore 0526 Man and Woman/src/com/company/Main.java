package com.company;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Scanner;

/*

0526 Мужчина и женщина
1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name (String), age (int), address (String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате «name + » » + age + » « + address».

Требования:
1. В классе Solution создай public static класс Man.
2. В классе Solution создай public static класс Woman.
3. Класс Man должен содержать переменные: name(String), age(int) и address(String).
4. Класс Woman должен содержать переменные: name(String), age(int) и address(String).
5. У классов Man и Woman должны быть конструкторы, принимающие параметры с типами String, int и String.
6. Конструкторы должны инициализировать переменные класса.
7. В методе main необходимо создать по два объекта каждого типа.
8. Метод main должен выводить созданные объекты на экран в указанном формате.


*/

// public class Solution
public class Main {
    public static void main(String[] args) {
        Man man = new Man("Oleg", 23, "Luna");
        Man man1 = new Man("Senya", 15, "Earth");
        Woman woman = new Woman("Latya", 35, "QWER");
        Woman woman1 = new Woman("Kristina", 23, "Luna");
        System.out.println(man);
        System.out.println(man1);
        System.out.println(woman);
        System.out.println(woman1);
    }
    public static class Man{
        String name;
        int age;
        String address;
        public Man(String name, int age, String address){
            this.name = name;
            this.address = address;
            this.age = age;
        }
        public String toString(){
            return (name + " " + age + " " + address);
        }
    }
    public static class Woman{
        String name;
        int age;
        String address;
        public Woman(String name, int age, String address){
            this.name = name;
            this.address = address;
            this.age = age;
        }
        public String toString(){
            return (name + " " + age + " " + address);
        }
    }
}







