package com.company;


/**
 * Created by Sheryl on 2/15/2017.
 */
public class bankAccount {
    public bankAccount(String nm, double amt) {
        name = nm;
        balance = amt;
    }
    public int compareToBalance(Object otherObject) {
        bankAccount otherAccount = (bankAccount) otherObject;
        int retValue;
        if (balance < otherAccount.balance) {
            retValue = -1;
        } else {
            if (balance > otherAccount.balance) {
                retValue = 1;
            } else {
                retValue = 0;
            }
        }
        return retValue;
    }
    public int compareToAlphabet(Object otherObject){
        bankAccount otherAccount = (bankAccount) otherObject;
        return this.name.compareTo(otherAccount.name);
    }
    public void deposit(double dp) {
        balance = balance + dp;
    }

    public void withdraw(double wd) {
        balance = balance - wd;
    }

    public String name;
    public double balance;

}

