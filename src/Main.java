import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] arr = {-4, -1, 0, 3, 10};
        Function function = new Function();

        Integer[] sortedSquaredArr = function.squaresOfSortedArray(arr);

        System.out.println(Arrays.toString(sortedSquaredArr));
    }
}