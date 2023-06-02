package Sorting;

public class BubbleSort {


    public static void main(String[] args) {
        int arr[]={20,45,10,12,5,12};
        System.out.print("\nArray elements before swappping :");
        display(arr);
        bubbleSort(arr);
        System.out.print("\nArray elements After swappping :");
        display(arr);

    }

    public static void display(int arr[]){

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+"\t");
        }
    }


    public static void bubbleSort(int arr[]){
        for(int i=0; i<arr.length-1; i++){

            for(int p=0; p<arr.length-1-i; p++){
                if(arr[p]>arr[p+1]){
                    int temp=arr[p];
                    arr[p]=arr[p+1];
                    arr[p+1]=temp;
                }
            }
        }
    }
}
