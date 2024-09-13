import java.util.Scanner;

public class perfect {
    public static void main(String[] args) {
        // Scanner sc= new Scanner((System.in));
        // int[] num = sc.nextInt();
        int arr[]={1,2,5,2,1};
        int i=0;
        int j=arr.length-1;
        boolean b=true;
        for(i=0;i<arr.length/2;i++){
            if(arr[i]==arr[j]){
            }
            else{
                b=false;
                break;
            }
            j--;
        }
        System.out.println(b);
    }
    
}
