package Sorting;

public class MergeSort {
    public static void main(String[] args) {
        int[] data = { 2, 6, 3, 34, 11, 83, 7, 1, 5 };

        System.out.println("\nArray Before Sort :");
        printData(data);

        mergeSort(data, 0, data.length - 1);

        System.out.println("\nArray After Sort :");
        printData(data);
    }


    public static void merge(int arr[],int l,int mid, int h){
        int n1=mid-l+1;
        int n2=h-mid;
        int a1[]=new int[n1];
        int a2[]=new int[n2];
        int i=0;
        int j=0;


            for( i=0; i<n1;i++){
                a1[i]=arr[l+i];
            }
            for( j=0; j<n2;j++){
            a2[j]=arr[j+mid+1];
        }

            i=0;j=0;
            int k=l;
            while(i<n1 && j<n2){
                if(a1[i]<a2[j]) {
                    arr[k++] = a1[i++];
                }
                else
                    arr[k++]=a2[j++];
                 }

                while(i<n1){
                arr[k++]=a1[i++];
                }
                while(j<n2){
                arr[k++]=a2[j++];
                }
    }

    public static void mergeSort(int arr[],int l,int h)
    {
        if(l<h){
            int mid=(l+h)/2;
            mergeSort(arr,l,mid);
            mergeSort(arr,mid+1,h);
            merge(arr,l,mid,h);
        }
    }
    private static void printData(int[] data) {
        for (int i = 0; i < data.length; i++)
            System.out.print("  " + data[i]);
    }


}
