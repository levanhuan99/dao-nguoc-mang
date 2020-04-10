package com.codewithme;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       int arr[];
       int size;
       Scanner input=new Scanner(System.in);
       do {
           System.out.println("enter your size: ");
           size=input.nextInt();
           if (size>5)
               System.out.println("to many");

       }while (size>5);

       arr=new int[size];
       int i =0;
       while (i<arr.length){
           System.out.println("enter your element "+(i+1)+",");
           arr[i]=input.nextInt();
           i++;
       }
        System.out.println("your array is not reverse  is: "+Arrays.toString(arr));

       for (int j=0;j<arr.length/2;j++){
           int temp=arr[j];
           arr[j]=arr[arr.length-j-1];
           arr[arr.length-j-1]=temp;
       }
        System.out.println("your new  array is: "+Arrays.toString(arr));


    }
//    public static Arrays reverse( Arrays arr){
//        for (int i=0;i<arr.length;i++){
//
//
//        }
//    }
}
