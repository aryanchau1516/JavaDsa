class arr{
    public static void main(String[] args) {
        int [] arr1= new int[]{1,2,3,4,5,6,7,8,9};
int sum=0;
        for(int i=0;i<arr1.length;i++){
          //  System.out.println(arr1[i]);
            if(arr1[i]%2==0){
                System.out.println(arr1[i]);
    sum= sum+arr1[i];
        }}
        System.out.println("sum of the array:"+sum);
    
    }
}