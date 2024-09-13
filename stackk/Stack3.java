import java.util.*;

public class Stack3 {
  /*
   * stack...push operation
   * .......pop operation.
   * .......search poeratio
   * .......middele element operation
   * .......middele delete operatio
   */
  
  public int NULL;
  int top=NULL;
  int size=50;

   
   public int[] array = new int[size];
  

  
    public void push(int element)
   { 
      top++;
     array[top]=element;
   
    }
   
   public boolean isEmpty(){
    if(top==0){

    
     return true;
    }
    return false;
   }
   public  void pop(){
    if(isEmpty())
    {
        System.out.println("array is underflow");
    }
    else{
       int popele;
       popele =array[top];
       top--;
      // size--;
      System.out.println("popped elementr :"+popele);
     
    }
   }
   
   public  void show(){
    if(isEmpty())
    {
        System.out.println("stck is empty");
    }
    else{
      
        for(int i=top;i>0;i--)
        {
            System.out.println(array[i]);
        }
    }
   }
   public void serach(int element)
   { int c=0;
      for(int i=0;i<=top;i++)
      { 
        if(array[i]==element)
        {
          System.out.println("search element find at location at:"+i);
          c++;
        }
       
      }
      if (c==0) {
        System.out.println("element is not present in the stack");
        }
   }
   public void mid()
   {
   // System.out.println("val of top"+top);
  // double mid=Math.ceilDiv(top,2);
   int mid = (int) Math.ceil((double)top / 2);
  //  float x = 3.05;
    //double y =  mid;
   //System.out.println(y);
    System.out.println(mid);
   System.out.println(" middele element in the stack :"+array[(int)mid]);
   }
   public void middel()
   {
  //  double mid=Math.ceilDiv(top,2);
    int mid = (int) Math.ceil((double)top / 2);
    int m=(int)mid;
    for(int i=m;m<top;m++)
    {
      array[m]=array[m+1];
    }
    top--;
   }
    public static void main(String[] args) {
       Stack3 obj= new Stack3();
       obj. push(4);
       obj.push(6);
       obj.push(46);
       obj. push(45);
        obj.push(48);
      //   obj.push(49);
      //   obj.push(50);
      //   obj.push(51);
      //   obj.push(52);
        // obj.serach(47);
       // obj.isEmpty();
        // obj.mid();
        obj.middel();
      //   obj.push(4);
      // obj.show();
      // obj.isEmpty();
     //obj.pop();
       obj.show();
     
        
    }
    
}
