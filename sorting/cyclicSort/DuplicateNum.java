package sorting.cyclicSort;

/*
 * if(0,n) then correct = arr[i]
 * if(1,n) then correct = arr[i] -1;
 */
public class DuplicateNum {
    public static void main(String[] args) {
        int[] arr={0,1,3,4,2,2};
       DuplicateNum obj = new DuplicateNum(); 
       System.out.println(obj.duplicate(arr));
    }
    int duplicate(int [] arr){
    int i=0;
  while (i<arr.length) {
    if(arr[i]!=i){   //if(0,n) then here !=i,if(1,n) thebn here i+1
        int correct = arr[i]; //   //if(0,n) then here arr[i],if(1,n) thebn here arr[i]-1
        if(arr[i]!=arr[correct])
        {
            swap(arr,i,correct);
        }
        else{
            return arr[i];
        }
    }
    else{
        i++;
    }
  }
    
    return -1;

}
void swap(int [] arr,int first,int second){
    int temp = arr[first];
    arr[first]=arr[second];
    arr[second]=temp;
}
    }

