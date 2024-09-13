package sTRING;
import java.util.Scanner;

public class reverse_word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();      // "my name ""
        String[] Words=str.split(" ");  // str. split is use to convert the enterd string in array in nindex 0 and seperate them to the (" ") space ....... my=0,name=1  .. create indexing
        String revString="";
        for(int i=0;i<Words.length;i++)    // words.length=2  ....(my,name)
        {
            String word=Words[i];   //  word==0 =my,   1 =name
            String revword="";
            for(int j=word.length()-1;j>=0;j--)
            {
                revword=revword+word.charAt(j);
            }
          revString=revString+revword+" ";
        }
        System.out.println(revString);
       
    }
    
}
