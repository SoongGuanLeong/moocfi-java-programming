public class Program {

    public static void main(String[] args) {
        // Test your method here
    }

    public static String arrayAsString(int[][] array) {
        StringBuilder result = new StringBuilder();

        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col ++) {
                result.append(array[row][col]);
            }
            result.append("\n");
        }

        return result.toString();
    }

}
