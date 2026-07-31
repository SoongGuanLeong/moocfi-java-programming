import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
    }

    public static int smallest(int[] array){
        int result = array[0];

        for (int number: array) {
            if (result > number) {
                result = number;
            }
        }
        return result;
    }

    public static int indexOfSmallest(int[] array){
        int min = smallest(array);

        for (int i=0; i < array.length; i++) {
            if (min == array[i]) {
                return i;
            }
        }
        return -1;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int[] shrunk = Arrays.copyOfRange(table, startIndex, table.length);

        int newMinIndex = indexOfSmallest(shrunk);

        return newMinIndex + startIndex;
    }

    public static void swap(int[] array, int index1, int index2) {
        int tmp = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
    }

    public static void sort(int[] array) {
        System.out.println(Arrays.toString(array));
        for (int i=0; i < array.length; i++) {
            swap(array, i, indexOfSmallestFrom(array, i));
            System.out.println(Arrays.toString(array));
        }
    }
}
