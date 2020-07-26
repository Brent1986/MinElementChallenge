package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        readIntegers(5);
    }
    public static void readIntegers(int count){
        Scanner scanner = new Scanner(System.in);
        int[] userEntries = new int[count];
        for(int i =0; i<count ; i++){
            System.out.println("Entry #" + (i+1) + " of " + count +":");
            int userEntry = scanner.nextInt();
            scanner.nextLine();
            userEntries[i] = userEntry;
        }
        scanner.close();
        // test
        //System.out.println(Arrays.toString(userEntries));
        findMin(userEntries);
    }
    public static void findMin(int[] userEntries){
        int theMin = 2147483647;
        for(int i =0; i<userEntries.length; i++){
            if(userEntries[i] < theMin ) theMin = userEntries[i];
        }
        System.out.println("The minimum value is " + theMin);
    }
}
