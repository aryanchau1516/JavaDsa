package ARRAYS;
public class arrneg {

    /*
     * here we take a array and sum of the even num and negative num
     * if sum of negative greater than sum of even num 
     * then  we return false    else return true........
     */
   public static void main(String[] args) {
   // um(){
        int [] arr2 = new int[]{12,-56,-7,9,8};
        int sump=0,sumn=0;
        for(int i=0;i<arr2.length;i++){
            if(arr2[i]<0){
                sumn=sumn+arr2[i];
                // sumn=-1*(sumn);
            }
            else{
                if(arr2[i]%2==0){
                    sump=sump+arr2[i];
                }
            }
             }
             sumn=-1*(sumn);
             System.out.println(sumn);
             System.out.println(sump);
        if(sumn>sump){
            System.out.println("false");
        }
        else{

        System.out.println("true");
        }
    
   }
}
