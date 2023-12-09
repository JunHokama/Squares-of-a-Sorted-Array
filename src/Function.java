import java.util.Arrays;

public class Function {
    public Integer[] squaresOfSortedArray(Integer[] arr){

        for (int i = 0; i < arr.length; i++) {
            arr[i] *= arr[i];
        }

        Arrays.sort(arr);
        return arr;
    }
}
