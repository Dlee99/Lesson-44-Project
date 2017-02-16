package com.company;
import java.util.*;
import java.text.*;

public class Main {

    public static void main(String[] args) {
        NumberFormat formatter = NumberFormat.getNumberInstance();
        formatter.setMinimumFractionDigits(2);
        formatter.setMaximumFractionDigits(2);
        String name;
        int j;
        bankAccount ba[] = new bankAccount[5];
        //1 Comparator comp = null;
        for (j = 0; j < ba.length; j++) {
            Scanner kbReader = new Scanner(System.in);
            System.out.println("Please enter the name to whom the account belongs.");
            name = kbReader.nextLine();
            System.out.println("Please enter the amount of the deposit.");
            double amount = kbReader.nextDouble();
            System.out.println("");
            ba[j] = new bankAccount(name, amount);
            //1 comp = new BA_comparatorBalance();
        }
        //1 Arrays.sort(ba, comp);
        //2 bubbleSortBalance(ba);
        //3 bubbleSortAlphabet(ba);
        for (j = 0; j < ba.length; j++) {
            System.out.println(ba[j].name + ">>>" + ba[j].balance);
        }
    }
    public static void bubbleSortBalance(bankAccount[] a) {
        int size = a.length;
        for (int u = 0; u < size; u++) {
            for (int i = 0; i < size - 1; i++) {
                if (a[i].compareToBalance(a[i + 1]) == 1) {
                    bankAccount temp = a[i + 1];
                    a[i + 1] = a[i];
                    a[i] = temp;
                }
            }
        }
    }
    public static void bubbleSortAlphabet(bankAccount[] a) {
        int size = a.length;
        for (int u = 0; u < size; u++) {
            for (int i = 0; i < size - 1; i++) {
                if (a[i].compareToAlphabet(a[i + 1]) >= 0) {
                    bankAccount temp = a[i + 1];
                    a[i + 1] = a[i];
                    a[i] = temp;
                }
            }
        }
    }

}

