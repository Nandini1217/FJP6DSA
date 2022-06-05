import java.util.*;
public class Main{
    public static void main(String[] args){ 
        Scanner scn = new Scanner(System.in);
  
       // write ur code here
      int t=scn.nextInt();
      for(int i=1;i<=t;i++){
        int n=scn.nextInt();
        boolean flag=true;
      
      for(int j=2;j<n;j++){
        if(n%j==0){
          flag=false;
        }
      }
      if(flag==true){
        System.out.println("prime");
      }
      else{
        System.out.println("not prime");
      }
   }}
  }