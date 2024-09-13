public class alternetorder {
    public static void main(String[] args) {
        int a[]={1,2,8,6,8};
        for(int i=0;i<a.length;i=i+2){
            //if(i%2==0){
                System.out.println(a[i]);
           // }
        }
    }
    
}
//Given two positive integers A and B, find GCD of A and B.
//Input: A = 3, B = 6
//Output: 3
//Explanation: GCD of 3 and 6 is 3
// 18 24       gcd <= 18
// 12 20
// gcd = 1

// i=2  (A%2 ==0 && B%2==0) gcd = 2
// i=
// 3  (A%2 ==0 && B%2==0)
// 4  (A%4 ==0 && B%4==0)  gcd =4
// 5  (A%5 ==0 && B%5==0) 
// 6 

// int gcd=1;
// int i = 2;
// while(i<12){
//     if(A%i ==0 AND B%i==0) {
//         gcd = i
//     }
//     i++
//}




