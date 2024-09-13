
//reverse a sentence ........ my name is aryan
                              //ym eman sinayra


import java.util.Scanner;

public class Stack5 {
        public int NULL;
        int top= NULL;
        int size = 50;
        char[] arr= new char[size];
        String[] arr2= new String[size];
        
        void push(char c)
        {
            top++;
            arr[top]=c;
        }
        void push2(String str)
        {
            top++;
            arr2[top]=str;
        }
      public boolean isEmpty()
     {
        if (top==0) {
            return true;
            
        }
        return false;
     }
     public char peek()
     { 
         if (isEmpty()) {
         return 0;
     }
    else{  
        char p = arr[top];
         return p;
    }
   }
        char pop(){
            if (isEmpty()) {
                System.out.println("stack is empty");
                 }
                 else{
                    char c=arr[top];
                    top--;
                    return c;
                 }
            return 0;
            
        }
        void show1()
        {
            for(int i=top;i>0;i--)
            {
                System.out.print(arr[i]);
            }
          //  return 0;
        }
        void show2()
        {
            for(int i=top;i>0;i--)
            {
                System.out.print(arr2[i]);
            }
          //  return 0;
        }
       
    //@SuppressWarnings("null")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Stack5 stk = new Stack5();
        Stack5 stk2 = new Stack5();
        for(int i=0;i<s.length();i++){
          
            stk.push(s.charAt(i));
        }
      

       String str="";
       char w=0;
        while (!stk.isEmpty()) {
            char c =stk.pop();
            if(c==' ')
            {
                stk2.push2(str);
            
            str="";
            continue;
            }
            str=  str+String.valueOf(c);
            
        }
        stk2.push2(str);
        stk2.show2();
    }
    
}      
    
        
    
