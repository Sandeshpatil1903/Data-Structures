package Hashing;

import java.util.Scanner;

public class OpenChaining {

    public static void print(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.println("arr["+i+"] " +arr[i]);
        }
    }
//    public static int hashingd(int n,int size){
//          int z=n%size;
//
//          return z;
//    }


//    public static int hashingm(int n, int size){
//          float x=0.758f;
//          float sum=x*n;
//          int y=(int)Math.floor(sum);
//        System.out.println("y="+y);
//          return y%size;
//    }

    public static int hashingR(int n,int size){
        int count1=0;
        int base=16;
        int pro=1;
        int sum=0;
        while(n>0){
            int x=n%10;
            int count=count1;
            while(count>0){
                pro*=base;
                count--;
            }
            count1++;
            sum+=x*pro;
            System.out.println(sum);
            n=n/10;
        }
        int y=sum%size;
        System.out.println(y);
         return y;
    }
    public static void insert(int arr[]){
        Scanner sc= new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter the array "+(i+1)+" element");
            int n=sc.nextInt();
           //int ind= hashingm(n,arr.length);
            int ind= hashingR(n,arr.length);
           if(arr[ind]==0){
               arr[ind]=n;
           }
           else {
               System.out.println("Already value present at index: "+ind);
           }
        }
        print(arr);
    }




    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of hash table");
        int size=sc.nextInt();
        int arr[]=new int[size];
        insert(arr);


    }
}
