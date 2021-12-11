package part4;

public class Sum {
     int sum(int i, int [] n){
        int result;
        if(i ==(n.length-1)){
            return n[i];
        }

        result = n [i]+ sum(i + 1,n);
        return result;
    }
    int maxEl(int max, int []n){

         if (n.length > max) {
             int next = maxEl(max+1, n);
             return Math.max(n[max], next);
         }else{
             return n[0];
         }

    }

    public static void main(String[] args) {
        Sum m = new Sum();
        int [] arr = {9,7,7,5,5,56,63};

        System.out.println(m.sum(0,arr));
        System.out.println(m.maxEl(0,arr));
    }

}
