package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Zadanie 2 i 3
        Scanner sc = new Scanner(System.in);
        System.out.println("Wprowadź pierwszą liczbę: ");
        int first = Integer.parseInt(sc.nextLine());
        System.out.println("Wprowadź drugą liczbę: ");
        int second = Integer.parseInt(sc.nextLine());
        System.out.println("Wprowadź trzecią liczbę: ");
        int third = Integer.parseInt(sc.nextLine());

        int[] unsortedArr = new int[]{first, second, third};
        int a = getMin(unsortedArr);
        int c = getMax(unsortedArr);

        System.out.println("Największa wartość: " + c);
        System.out.println("Najmniejsza wartość: " + a);

        //Zadanie 4
        int index = 10;
        while(index > 0)
        {
            System.out.println("Hello World!");
            index--;
        }

        //Zadanie 5
        for(int i = 1;i <= 10;i++){
            for(int j = 1;j <= 10;j++){
                System.out.print(i * j + " ");
            }
            System.out.print("\n");
        }

        //Zadanie 6
        System.out.print("\n");
        System.out.print("Unsorted: ");
        int[] arr = createRandom(10);
        Arrays.sort(arr);
        System.out.print("\n");
        System.out.print("Sorted: ");
        System.out.println(Arrays.toString(arr));

        //Zadanie 7
        System.out.print("\n");
        System.out.print("Podaj liczbę: ");
        int n = Integer.parseInt(sc.nextLine());

        while(n > 5 || n % 2 == 0)
        {
            System.out.print("Liczba jest mniejsza niż 5 lub jest parzysta!");
            System.out.print("Wprowadź liczbę jeszcze raz: ");
            n = Integer.parseInt(sc.nextLine());
        }

        for(int i = 1;i <= n;i++)
        {
            System.out.print("");
        }

    }

    public static int getMin(int[] inputArray){
        int minValue = inputArray[0];
        for(int i=1;i<inputArray.length;i++){
            if(inputArray[i] < minValue){
                minValue = inputArray[i];
            }
        }
        return minValue;
    }

    public static int getMax(int[] inputArray){
        int maxValue = inputArray[0];
        for(int i=1;i < inputArray.length;i++){
            if(inputArray[i] > maxValue){
                maxValue = inputArray[i];
            }
        }
        return maxValue;
    }

    public static int[] createRandom(int n) {
        Random rd = new Random();
        int[] array = new int[n];
        int min = 100;
        int max = 1000;

        for (int i = 0; i < array.length; i++) {
            array[i] = rd.nextInt(max-min+1) + min;
            System.out.print(array[i] +" ");
        }
        return array;
    }
}
