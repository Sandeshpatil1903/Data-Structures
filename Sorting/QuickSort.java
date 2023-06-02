package Sorting;

public class QuickSort {

    public static void main(String[] args) {

        int[] data = { 2, 6, 3, 34, 11, 83, 7, 1, 5 };

        System.out.println("\nArray Before Sort :");
        printData(data);

        QuickSort(data, 0, data.length - 1);

        System.out.println("\nArray After Sort :");
        printData(data);
    }

    public static  int partition(int arr[], int l, int h){
        int pivot=arr[h];
        int j=h-1;
        int i=0;
        while(i<=j){
            if(arr[i]>pivot){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j--;
            }
            else{
                i++;
            }
        }
        arr[h]=arr[j+1];
        arr[j+1]=pivot;
        return j+1;
    }
       public  static void QuickSort(int arr[],int l,int h){
        if(l<h){
            int p=partition(arr, l,h);

            QuickSort(arr, l,p-1);
            QuickSort(arr, p+1, h);
        }
       }


    private static void printData(int[] data) {
        for (int i = 0; i < data.length; i++)
            System.out.print("  " + data[i]);
    }


}
