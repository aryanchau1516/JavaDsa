package STRING;
public class lowerst {
    public static void main(String[] args) {
        String s = "Ab";
        // A - Z (65-91)
        String upp = "";
        // for(int i =0;i<s.length();i++){
        //     int ascii = s.charAt(i);
        //    //A
        //     IF 65<= ascii <=91:
        //         upp = upp + (char) (32+ascii)
        //         //upp  = 'a' + 'b' //'abc'
            
        //     ELSE 
        //         upp = upp + s[i];
           
        for(int i =0;i<s.length();i++){
               int ascii = (int)s.charAt(i);  //i =1 
            if(65<=ascii&&ascii<=91){
                upp = upp + (char) (32+ascii);
            }
                else{
                    upp=upp+s.charAt(i); //a +b =='ab'
                }
            }
            System.out.println(upp);
        }
}
