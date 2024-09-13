package STRING;
public class Stringreverse1 {
    public static void main(String[] args) {
        String str="JavaScript";
        char str1;
        int i,j;
        // String str2 ="";
        // for(int i=0;i<str.length();i++){
        //     if('a'==str.charAt(i)||'i'==str.charAt(i)){
        //         str1=str1+str.charAt(i);
                // if('a'==str.charAt(i)||'i'==str.charAt(i)){
                //     for(int j=str1.length()-1;j<=0;j--){
                //         if('a'==str.charAt(i)||'i'==str.charAt(i)){
                //             str2 = str2+st
                //         }
                //     }
                // }}
           for(i=0;j<=str.length()-1;i++){
            j=str.length()-1-i;
            if (('a'||'e'||'i'||'o'||'u')==str.charAt(i) && ('a'||'e'||'i'||'o'||'u'==str.charAt(j))) {
                
            
            if(str.charAt(i)<str.charAt(j)){
                    str1=str.charAt(i);
                    str.charAt(i)=str.charAt(j);
                    str.charAt(j)=str1;
            }
           }
                
        }
       
    }
}


