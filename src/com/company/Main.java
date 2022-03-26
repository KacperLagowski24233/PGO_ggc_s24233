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
        boolean inputValid;
        int n;

        System.out.println("Podaj liczbę która jest niepatzysta i większa od 5: ");

        do{
            Scanner scan = new Scanner(System.in);
            n = scan.nextInt();
            System.out.println("Podana liczba nie jest prawidłowa");

            if((n > 5) && (n%2!=0))
            {
                inputValid = true;
            }
            else
            {
                inputValid = false;
            }
        }
        while(inputValid == false);

        GenerateImage(n);
    }

    static void GenerateImage(int number)
    {
        for (int i = 0; i < number; i++)
        {
            System.out.print(" * ");
        }
        System.out.println();
        for (int i = 0; i < number - 2; i++)
        {
            System.out.print(" * ");
            for (int j = 0; j < number - 2; j++)
            {
                if(i==j)
                {
                    System.out.print(" * ");
                }
                else
                {
                    System.out.print("   ");
                }
            }
            System.out.println(" * ");
        }
        for (int i = 0; i < number; i++)
        {
            System.out.print(" * ");
        }
        System.out.println();
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
