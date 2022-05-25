import java.util.*;
public class Main{
    public static void main(String[] args){
    int arr[]=new int[5];

    System.out.println(arr);    //address is stored
    // System.out.println(arr[0]);   //default values are stored
    // System.out.println(arr[1]);
    // System.out.println(arr[2]);
    // System.out.println(arr[3]);
    // System.out.println(arr[4]);
    // System.out.println(arr[5]);

    //setting the values
    arr[0]=3;
    arr[1]=-3;
    arr[4]=5;
    arr[2]=9;
    System.out.println(arr[0]);  
    System.out.println(arr[1]);
    System.out.println(arr[2]);
    System.out.println(arr[3]);
    System.out.println(arr[4]);

   //to find length of array
   System.out.println("length is "+arr.length);

   for(int i=0;i<arr.length;i++){
       System.out.println(arr[i]+" ");
   }

   //for each loop
   for(int val:arr){
       System.out.println(val);
   }
    }
}