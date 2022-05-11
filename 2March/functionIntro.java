import java.util.*;
public class Main{
    public static void saysHello(){
        for(int i=1;i<=5;i++){
         System.out.println(i+" hello");
        }
    }
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        // int num=scn.nextInt();
        saysHello();
    }
}