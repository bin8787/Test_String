//java Test_String.java
        
import java.util.Scanner;
        
public class Test_String {  
   
  public static void main(String[] args) {
     
    System.out.println(textModifier());
           
  }
     
     
  public static String textModifier() {
        
    Scanner in = new Scanner(System.in);
        
    System.out.println("Input a line:");
    String s1 = in.nextLine();
         
    in.close();     
        
    ///// A.
        
    int i = s1.indexOf("  ");

    while (-1 < i) {  

      if(i < s1.length() - 2) {
        s1 = s1.substring(0, i+1) + s1.substring(i+2);       
      }
      else {        
        s1 = s1.substring(0, i+1);
      }    
 
      i = s1.indexOf("  ");      
    }  
        
    ///// B.
         
    String s2 = "";

    i = s1.indexOf("-");
        
    while (-1 < i) { 
      s2 = s1.substring(i);
      s1 = s1.substring(0, i);
          
      do {  
        s2 = s2.substring(1);
      }  
      while (s2.startsWith("-")); 
           
           
      if(s1 != "" && s2 != "") { 
        s1 = s1.substring(0, i-1) + s2.substring(0, 1) + 
             s1.substring(i-1)    + s2.substring(1);       
      } 
      else {        
        s1 = s1 + s2; 
      }    
         
      i = s1.indexOf("-"); 
          
    }  

    ///// C.
         
    s1 = s1.replace('+', '!'); 
         
    ///// D.
 
    int iSum = -1;

    for (i = 0; i < s1.length(); i++) {  
            
      if('0' <= s1.charAt(i) && s1.charAt(i) <= '9') {  
          
        if(iSum < 0) iSum  = Integer.parseInt(s1.charAt(i) + ""); 
        else         iSum += Integer.parseInt(s1.charAt(i) + "");  
                    
      }        
    }     
        
    s1 = s1.replaceAll("[0-9]", ""); 
       
    if(-1 < iSum) s1 += " " + iSum;  
        
    //   
       
    return s1; 
       
  }  
   
}       

