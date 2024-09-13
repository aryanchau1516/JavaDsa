package STRING;
public class upperst {
    public static void main(String[] args) {
        String st ="aDrFEsji";
        System.out.println("string in original :"+st);
        String upp ="";
        for(int i=0;i<st.length();i++){
            int asci=(int)st.charAt(i);
            if(97<=asci&&asci<=122){
                upp=upp+(char)(asci-32);
            }  
        else{
                upp=upp+(char)asci;
        }   
      }
      System.out.println("String in upper case::"+upp);
    }
    
}
