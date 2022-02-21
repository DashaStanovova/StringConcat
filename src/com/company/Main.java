package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int[] array = {3,6,1,23};
        for (int i=0;i<array.length;i++){
            if (i==0){
                System.out.println(array[i]+" is first, "+array[i+1]+" is after "+array[i]);
            }
            if (i==array.length-1){
                System.out.println(array[i]+" is last");
            }
            if(i!=0 &&i != array.length-1){
                System.out.println(array[i]+" is after "+array[i-1]+", and before "+array[i+1]);
            }
        }
    }
}
