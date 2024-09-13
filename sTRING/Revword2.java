package STRING;

import java.util.Scanner;

/*
 *  reverse the sentence with complexity 0(n)
 * myn nmae is aryan
   nym eamn si nayra 
 * 
 * 
 */

public class Revword2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String s="";
        String revWord="";
        for(int i=str.length()-1;i>=0;i--)   // reverse the word each cahracter and store in s string
        {
            s=s+str.charAt(i);
            if(str.charAt(i)==' ')   // if character ==' ' space then add in the revword
{
            revWord=s+revWord;   //   eman_    , ym_ +eman_ = ym_eman
            s="";
}

        }
        revWord=s+" "+revWord;
        System.out.println(revWord);
        System.out.println(revWord.length());
    }
    
}
