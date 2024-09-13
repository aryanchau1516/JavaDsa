package ARRALIST;

import java.util.ArrayList;

public class al1 {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        list.add(56);
        list.add(46);
        list.add(36);
        list.add(6);
        list.add(5);
        System.out.println(list);// it use to print the value of array list : [56, 46, 36, 6, 5]
        System.out.println(list.get(3));   // it gives the value at index no 3 : 6
    }
    
}
