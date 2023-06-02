package Sorting;

public class InsertionSort {


    public static void main(String[] args) {
        int arr[]={20,45,10,12,5,12};
        System.out.print("\nArray elements before swappping :");
        display(arr);
        insertionSort(arr);
        System.out.print("\n Array elements After swappping  :");
        display(arr);

    }

    public static void display(int arr[]){

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+"\t");
        }
    }


//      public static void Insertsort(int arr[]){
//        for(int i=1; i<arr.length; i++){
//            int j=i-1;
//            int temp=arr[i];
//
//            while(j>=0 && temp < arr[j] ){
//
//                arr[i--]=arr[j];
//                j--;
//                System.out.println("while");
//                display(arr);
//            }
//
//           arr[++j]=temp;
//            System.out.println("inertion");
//            display(arr);
//        }
//
//      }


    public static void insertionSort(int arr []){
        for (int i=0; i<arr.length-1;i++){
            for(int j=i+1; j>0; j--){
                if(arr[j]<arr[j-1]){
                    int temp= arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
                else{
                    break;
                }
            }
        }
    }

}
