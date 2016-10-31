package com.Andrew77715.runners.LoopsArraysRunnerHomeWork;
import com.Andrew77715.app.homework.homework4.homework7.LoopsArray;
import java.util.Scanner;

    // менюха со switch
public class LoopsArraysRunner{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        LoopsArray myLoopsArray2 = new LoopsArray();
        System.out.println("введи любое число от 1 до 5");
        int a = scanner.nextInt();
        scanner.close();

        switch (a){
            case 1:
                System.out.println("Ты выбрал задачу 1");
                System.out.println(" Создайте массив из всех чётных чисел от 2 до 20 и выведите элементы массива на экран сначала в строку,\n отделяя один элемент от другого пробелом, \n а затем в столбик: ");
                myLoopsArray2.Task1();
                break;
            case 2:
                System.out.println("Ты выбрал задачу 2");
                System.out.println("Создайте массив из всех нечётных чисел от 1 до 99,\n выведите его на экран в строку,\n а затем этот же массив выведите на экран в другую строку,\n но в обратном порядке: \n");
                myLoopsArray2.Task2();
                break;
            case 3:
                System.out.println("Ты выбрал задачу 3");
                System.out.println(" Создайте массив из 15 случайных целых чисел из отрезка [0;9].\n Выведите массив на экран.\n Подсчитайте сколько в массиве чётных элементов и выведете это количество на экран на отдельной строке.\n");
                myLoopsArray2.Task3();
                break;
            case 4:
                System.out.println("Ты выбрал задачу 4");
                System.out.println(" Создайте массив из 15 случайных целых чисел из отрезка [0;999].\n Выведите массив на экран.\n Выведите минимальное и максимальное значение элементов массива\n");
                myLoopsArray2.Task4();
                break;
            case 5:
                System.out.println("Ты выбрал задачу 5");
                System.out.println("Создать двумерный массив из 8 строк по 5 столбцов в каждой из случайных целых чисел из отрезка [10;99].\n Вывести массив на экран.\n");
                myLoopsArray2.Task5();
                break;
            default:
                System.out.println("Ошибка, скорее всего ты ввел неправильное значение!!! Попробуй еще раз, только числа от 1 до 5 :) ");

        }
    }
}


                         //М Е Н Ю Х А с ИФАМИ:
//public class LoopsArraysRunner {
//    public static void main(String args[]) {
//        Scanner scanner = new Scanner(System.in);
//        LoopsArray myLoopsArray = new LoopsArray();
//        System.out.println("введи любое число от 1 до 5");
//        int task1 = 1, task2 = 2, task3 = 3, task4 = 4, task5 = 5;
//        int a = scanner.nextInt();
//        scanner.close();
//
//        if (task1 == a) {
//
//            System.out.println("Ты выбрал задачу 1");
//            System.out.println(" Создайте массив из всех чётных чисел от 2 до 20 и выведите элементы массива на экран сначала в строку,\n отделяя один элемент от другого пробелом, \n а затем в столбик: ");
//            myLoopsArray.Task1();
//        }
//        else if (task2 == a) {
//            System.out.println("Ты выбрал задачу 2");
//            System.out.println("Создайте массив из всех нечётных чисел от 1 до 99,\n выведите его на экран в строку,\n а затем этот же массив выведите на экран в другую строку,\n но в обратном порядке: \n");
//            myLoopsArray.Task2();
//        }
//        else if (task3 == a){
//            System.out.println("Ты выбрал задачу 3");
//            System.out.println(" Создайте массив из 15 случайных целых чисел из отрезка [0;9].\n Выведите массив на экран.\n Подсчитайте сколько в массиве чётных элементов и выведете это количество на экран на отдельной строке.\n");
//            myLoopsArray.Task3();
//        }
//        else if(a == task4){
//            System.out.println("Ты выбрал задачу 4");
//            System.out.println(" Создайте массив из 15 случайных целых чисел из отрезка [0;999].\n Выведите массив на экран.\n Выведите минимальное и максимальное значение элементов массива\n");
//            myLoopsArray.Task4();
//        }
//        else if (a == task5){
//            System.out.println("Ты выбрал задачу 5");
//            System.out.println("Создать двумерный массив из 8 строк по 5 столбцов в каждой из случайных целых чисел из отрезка [10;99].\n Вывести массив на экран.\n");
//            myLoopsArray.Task5();
//        }
//        else {
//            System.out.println("Ошибка, скорее всего ты ввел неправильное значение!!! Попробуй еще раз, только числа от 1 до 5 :) ");
//        }
//
//    }
//}