import java.util.*;
public class Main{
    public static void main(String[] args){
    Scanner scn=new Scanner(System.in);

   // int n=scn.nextInt();

    public int bulbSwitch(int n){
      int count=0;
      for (int i=1;i*1<=n;i++){
          System.out.println(i*i);
          count++;
      }
      return count;
    }
    
    int ans=bulbSwitch(78);
    }
}