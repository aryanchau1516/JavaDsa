package STRING;



public class reversevowel {

    // static String reverse(String str){
    //     int n=str.length();
    //     char ch[]=str.toCharArray();
    //     int start=0;
    //     int end=str.length()-1;
    //     while (start<end) {
    //         if (isvowel(ch[start])){
    //             start++;
    //          }
    //          if(isvowel(ch[end])){
    //             end--;
    //          }
    //          else{
    //             char temp=ch[start];
    //             ch[start]=ch[end];
    //             ch[end]=temp;
    //             start++;
    //             end--;
    //         }}
    //         return String.valueOf(ch);

    //          }
    //          static boolean  isvowel(char ch){
    //             if(ch=='a'|| ch=='A'|| ch=='E'|| ch=='e'|| ch=='i'|| ch=='I'|| ch=='O'|| ch=='o'|| ch=='u'|| ch=='U'){
    //                 return true;
    //          }
                

    //             return false;
    //          }
    public static void main(String[] args) {
     
    

        String str = "javascript";
        System.out.println(" string : " + str);
        String reversed = reverseVowels(str);
        System.out.println(" reversed  strinmg vowels: " + reversed);
    }

    public static String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (!isVowel(chars[i])) {
                i++;
                continue;
            }
            if (!isVowel(chars[j])) {
                j--;
                continue;
            }
           
            char temp = chars[i];       // swap
            chars[i] = chars[j];
            chars[j] = temp;
            i++;
            j--;
        }
        return  new String(chars);
    }

    public static boolean isVowel(char ch) {
        if(ch=='a'|| ch=='A'|| ch=='E'|| ch=='e'|| ch=='i'|| ch=='I'|| ch=='O'|| ch=='o'|| ch=='u'|| ch=='U'){
        
            return true;
       //return "AEIOUaeiou".indexOf(c) != -1;
    }
        return false;
}
}



// var reverseVowels = function(s) {
//     let i = 0; 
//     let j = s.length-1;
//     let v = ['a', 'e', 'i', 'o','u'];
//     let str2 = s.split(''); // convert string into Array ['H','e','l','l','o']
//     while(i < j) {
    	
//         if(v.includes(s[i].toLowerCase() ) && v.includes(s[j].toLowerCase() )){
//             let t = s[j];
//             str2[j] = s[i];
//             str2[i] = t
//             i++;
//             j--;
  
//             continue;
//         } else {

//             if(v.includes(s[i].toLowerCase()) ){
//                 --j
//                 continue;
//             } 
            
//             if(v.includes(s[j].toLowerCase())) {
//                 ++i;
//                 continue;
//             }
//             ++i;
//             --j;
//         }
//     }
//     console.log(str2.join(''))
    
// };

// reverseVowels('Hello')