public class removespace {
    // remove the space in given string
static String space(String sp){
    String spacee="";
    for(int i =0;i<sp.length();i++){
        int  as = (int)sp.charAt(i);  // i=0 h=_104 i=1 e =101i=5 =32 i
        
        if(as!=32){
            spacee= spacee+(char)as;   // space="hellojava"

        }
    }
    return spacee;
}

    public static void main(String[] args) {
        String st = "hello java ";
        //space(st);
        System.out.println(space(st));
    }
    
}
 