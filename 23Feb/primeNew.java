import java.util.*;
public class Main{
    public static void main(String[] args){
    Scanner scn=new Scanner(System.in);
    int num=scn.nextInt();
    int flag=1;

    //for better coding 
    //we know that any number greater than num/2 will not divide num
    //example: let num=10     then numbers:6,7,8,9   will never be able to divide by 10
    //so we were unnecessarily checking more nos.
    // for(int i=2;i<=(num/2);i++){

//also one more approch to reduce the number of checks is
//we can check upto square root of the number
        // for(int i=2;i<=sqrt(num);i++){

        //to find the square root without using sqrt
        for(int i=2;i*i<=num;i++){
        if(num%i==0){
        flag=0;
        break;
        }   
    }
    if(flag==1){
        System.out.println("prime");
    }else
    System.out.println("not prime");

    }
}