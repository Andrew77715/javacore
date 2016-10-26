package com.Andrew77715.runners.LoopsArraysRunnerHomeWork;
import com.Andrew77715.app.homework.homework4.homework7.LoopsArray;
import java.util.Scanner;

// сделал не так как в задании... скажем так это версия 1.0
public class LoopsArraysRunner {
    public static void main(String[] args) {
        LoopsArray myLoopsArray = new LoopsArray();

        System.out.println("Задача 1: ");
        System.out.println(" Создайте массив из всех чётных чисел от 2 до 20 и выведите элементы массива на экран сначала в строку,\n отделяя один элемент от другого пробелом, \n а затем в столбик: ");
            myLoopsArray.Task1();
        System.out.println("");
        System.out.println("");


        System.out.println("Задача 2: ");
        System.out.println("Создайте массив из всех нечётных чисел от 1 до 99,\n выведите его на экран в строку,\n а затем этот же массив выведите на экран в другую строку,\n но в обратном порядке: \n");
        System.out.println("");
            myLoopsArray.Task2();
        System.out.println("");

        System.out.println("Задача 3: ");
        System.out.println(" Создайте массив из 15 случайных целых чисел из отрезка [0;9].\n Выведите массив на экран.\n Подсчитайте сколько в массиве чётных элементов и выведете это количество на экран на отдельной строке.\n");
        System.out.println("");
            myLoopsArray.Task3();
        System.out.println("");

        System.out.println("Задача 4: ");
        System.out.println(" Создайте массив из 15 случайных целых чисел из отрезка [0;999].\n Выведите массив на экран.\n Выведите минимальное и максимальное значение элементов массива\n");
            myLoopsArray.Task4();
        System.out.println("");

        System.out.println("Задача 5: ");
        System.out.println("Создать двумерный массив из 8 строк по 5 столбцов в каждой из случайных целых чисел из отрезка [10;99].\n Вывести массив на экран.\n");
            myLoopsArray.Task5();
        }
    }

