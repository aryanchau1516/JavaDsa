package sTRING;
public class atoz {   // complexity n^2 worst case 
    /**
     * @param args
     */
    public static void main(String[] args) {
        String series= "" ;
        System.out.println("a to z alphabets...");
        for(int i=0;i<26;i++){
            char ch = (char)('a'+i);  // here we typecat the ascii value in character ('a'+2)=97+2=99
            System.out.println(ch);
        }
        System.out.println("printing A to Z alphabet...");
        for(int i=0;i<26;i++){
            char ch = (char)('A'+i);  // here we typecat the ascii value in character ('A'+2)=65+2=67
            System.out.println(ch);
            series= series +  (char)('A'+i);  
           // System.out.println(series);
            }
            
            System.out.println(series);
            String s3 ="";
           
            for(int j=series.length()-1;j>=0;j--){
                //int asci1=(int)series.charAt(j);
                 s3 = s3+ series.charAt(j);
               
            }
            System.out.println("a to z in reverse order .");
            System.out.println(s3);
    }

   

    
}
