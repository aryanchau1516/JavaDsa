package Recursion;

public class CountZero {
    public static void main(String[] args) {
        int num=304060;
        int count=0;
        CountZero obj = new CountZero();
    System.out.println(obj.zero(num, count));
    }
    int zero(int num,int count)
    {
        int rem = num%10;
        if (rem==0) {
            count++;
        }
        num=num/10;
        if (num<=0) {
            return count;
        }
        return zero(num, count);
    }
}
