package com.company;
import java.util.*;
/**
 * Created by Sheryl on 2/15/2017.
 */
public class BA_comparatorBalance implements Comparator{
    public int compare(Object o1, Object o2) {
        bankAccount b1 = (bankAccount) o1;
        bankAccount b2 = (bankAccount) o2;
        if(b1.balance > b2.balance){
            return 1;
        }
        else if(b1.balance == b2.balance){
            return 0;
        }
        else{
            return -1;
        }
    }
}
