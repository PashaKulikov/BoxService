package part4;
import java.util.Arrays;
public class QuickSort {
    public static void  quickSort(int[] arr, int low, int high) {
        if (arr.length == 0 )
            return ;

        if (low >= high)
            return ;

        int middle = low + (high - low) /2;
        int opora = arr[middle];

        int i = low, j = high;
        while (i <= j) {
            while (arr[i] < opora){
                i++;
            }
            while(arr[j] > opora){
                j--;
            }
            if (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;

            }
        }
        if (low < j)
            quickSort(arr,low,j);
        if (high > i)
            quickSort(arr,i,high);
    }

    public static void main(String[] args) {
        int [] x = {8,6,7,6,4,43,6333,456,-3,77,11};
        System.out.println(Arrays.toString(x));

        int low = 0;
        int high = x.length -1;
        quickSort(x,low,high);
        System.out.println(Arrays.toString(x));
    }
}