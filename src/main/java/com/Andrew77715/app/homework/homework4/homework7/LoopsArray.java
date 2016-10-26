package com.Andrew77715.app.homework.homework4.homework7;
import java.util.Random;


public class LoopsArray {
    public int[] Task1() {
        int[] evenNumbers = new int[10];
        for (int q = 0; q < evenNumbers.length; q++) {
            evenNumbers[q] = (q + 1) * 2;
            System.out.print(evenNumbers[q] + " ");
            System.out.print("");

        }
        return evenNumbers;
    }

    public int[] Task2() {
        int[] oddNumbers = new int[50];
        for (int i = 0; i < oddNumbers.length; i++) {
            oddNumbers[i] = i * 2 + 1;
            System.out.print(oddNumbers[i] + " ");
        }
        System.out.println("");
        System.out.println("а теперь в обратном порядке: ");
        System.out.println("");
        for (int i = 0; i < oddNumbers.length; i++) {

            System.out.print(oddNumbers[oddNumbers.length - 1 - i] + " ");
            System.out.print("");
        }
        return oddNumbers;
    }

    public int[] Task3() {
        int numbersCount = 15;
        int evenNumbersCount = 0;

        int[] numbersArr = new int[numbersCount];

        // Random random = new Random();

        for (int i = 0; i < numbersArr.length; i++) {
            // numbers[i] = random.nextInt(10); // ...тоже самое что строка ниже
            numbersArr[i] = (int) (Math.random() * 9 + 1);
            System.out.print(numbersArr[i] + " ");
            System.out.print("");

            if ((numbersArr[i] % 2 == 0) && (numbersArr[i] != 0)) { //четное число и не равняеться 0
                evenNumbersCount++;

            }
        }
        System.out.println("");
        System.out.println("Количество четных чисел в массиве: " + evenNumbersCount);

        return numbersArr;
        }



    public int[] Task4() {
        int[] mas = new int[15];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 99 + 1);
            System.out.print(mas[i] + " ");
        }
        System.out.println("");
        int maxNumber = mas[0];
        for (int i = 0; i < mas.length; i++) {
            if (maxNumber < mas[i])
                maxNumber = mas[i];
        }
        System.out.println("\n Максимальное значение = " + maxNumber);

        int minNumber = mas[0];
        for (int i = 0; i < mas.length; i++) {
            if (minNumber > mas[i])
                minNumber = mas[i];
        }
        System.out.println("\n Миниимальное значение = " + minNumber);

        return mas;
    }

    public int[][] Task5() {
        int[][] newArr = new int[5][8];
        Random MyRan = new Random();
        for (int i = 0; i < 5; i++)
            for (int j = 0; j < 8; j++)
                newArr[i][j] = MyRan.nextInt(11) + 89;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 8; j++)
                System.out.print(newArr[i][j] + "   ");
            System.out.println();
        }
        return newArr;
    }


}