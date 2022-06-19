import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws Exception{ 
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int n=Integer.parseInt(br.readLine());
    int[] a=new int[n];
    for(int i=0;i<n;i++){
        a[i]=Integer.parseInt(br.readLine());
    }
    reverse(a);
    display(a);
    }

    public static void reverse(int[] a){
        int low=0;
        int high=a.length-1;
        while(low<=high){
            int ele=a[low];
            a[low]=a[high];
            a[high]=ele;

            low++;
            high--;
        }
    }

    public static void display(int[] a){
        StringBuilder sb=new StringBuilder();
        for(int val:a){
            sb.append(val + " ");
        }
        System.out.println(sb);
    }
}