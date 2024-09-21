package ARRALIST;

import java.util.ArrayList;
import java.util.Scanner;

public class twodarrlist {
    public static void main(String[] args) {
        ArrayList <ArrayList <Integer>> list  = new ArrayList<>();  // syntax of the 2d arrayList
        Scanner sc  = new Scanner(System.in);
        System.out.println("enter thevalue in arraylisrt :");
        for(int i=0;i<4;i++)  //  [[2, 5, 3], [3, 5, 2], [4, 6, 1], []] = here 4 represnt 4 box arraylist 
        {
            list.add(new ArrayList<>());  // initialization inside the arraylist

        }
        for(int i=0;i<3;i++) {
        for(int j=0;j<3;j++)                   // like arr[4][3]  array
        {
            list.get(j).add(sc.nextInt());
        }
    }
        System.out.println(list);
    

    }
}
