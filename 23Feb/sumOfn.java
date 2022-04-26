import java.util.*;
public class Main{
    public static void main(String[] args){
    Scanner scn=new Scanner(System.in);
    int num=scn.nextInt();
//     int sum=0;
//     for(int i=1;i<=num;i++){
//         sum=sum+i;
        
//     }
// System.out.println(sum);

//or else the better option would have been to directly apply the formula 
//becoz that would help to remove the loop also thus reducing the time complexity

int res=(num*(num+1))/2;
System.out.println(res);

    }
}