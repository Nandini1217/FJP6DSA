import java.util.*;
public class Main{
    public static void saysHello(){
        for(int i=1;i<=5;i++){
         System.out.println(i+" hello");
        }
    }

    //another function
    public static int add(int num1,int num2){
    return(num1+num2);
    }

    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        // int num=scn.nextInt();
        saysHello();
        System.out.println(add(15,20));
    }
}