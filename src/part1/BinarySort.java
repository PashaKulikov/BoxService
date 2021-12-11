package part1;

public class BinarySort {
    public int binarySort (int[] sortedArray, int key) {
        int index = 0;
        int low = 0;
        int high = sortedArray.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (sortedArray[mid] < key) {
                low = mid + 1;
            } else if (sortedArray[mid] > key) {
                high = mid - 1;
            } else if (sortedArray[mid] == key) {
                index = mid + 1;
                break;
            }

        }

        return index;
    }

    public static void main(String[] args) {

        int [] list = {1, 4, 14, 33, 56, 234, 555,4433};


        BinarySort sort = new BinarySort();
       int a =  sort.binarySort(list,88);
        System.out.println(a);

    }

}
