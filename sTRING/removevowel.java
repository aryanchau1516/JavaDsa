package STRING;

public class removevowel {
    static String remove(String str){
        String ch= "";
        char[] ch1= str.toCharArray();  
        for(int i=0;i<str.length();i++){
           
             if(ch1[i]!='a'|| ch1[i]!='A'|| ch1[i]!='E'|| ch1[i]!='e'|| ch1[i]!='i'|| ch1[i]!='I'|| ch1[i]!='O'|| ch1[i]!='o'|| ch1[i]!='u'|| ch1[i]!='U'){
                ch=ch+ch1[i];
        }
        // else{
        //     ch=ch+ch1[i];
        // }
       
    }
    return ch;
    }
    public static void main(String[] args) {
        String str= "javascript";
      // remove( str);
       System.out.println(remove(str));
    
}
}
