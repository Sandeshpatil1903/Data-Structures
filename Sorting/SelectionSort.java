package Sorting;

public class SelectionSort {


    public static void main(String[] args) {
        int arr[]={20,45,10,12,5,12};
        System.out.print("\nArray elements before swappping :");
        display(arr);
        selectionSort(arr);
        System.out.print("\n Array elements After swappping  :");
        display(arr);
    }
    public static void display(int arr[]){

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+"\t");
        }
    }

    public static void selectionSort(int arr[]){
        for(int i=0;i<arr.length; i++){
            int min_ind=i;
            for(int j=i+1; j<arr.length;j++) {
                if (arr[j] < arr[min_ind]) {
                    min_ind = j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min_ind];
            arr[min_ind]=temp;
         display(arr);
        }
    }
}
