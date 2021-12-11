package part2;

public class HighSort {
    public int smalLest (int [] arr){
        int smallEvent = arr[0];
        int smalIndex = 0;
        for (int i =0; i < arr.length ; i++){
            if(arr[i] < smallEvent){
                smallEvent = arr[i];
                smalIndex = i;

            }
        }
        return smalIndex;
    }
    int [] selectionSort (int [] arr) {
        int [] arr1 = new int [1];

        {
            arr1[0] = smalLest(arr);

        }
        return arr1;
    }

    public static void main(String[] args) {
        int [] array ={45,1,42,13,4,5,44,4,444};
        HighSort s = new HighSort();

        System.out.println(s.selectionSort(array));
    }
}
