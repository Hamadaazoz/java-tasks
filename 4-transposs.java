public class Main {
    /////////////////////////////////////////////////transposs elements of array
    public static void main(String[] args) {
        final int[][] original = new int[][]{
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}};
/////////////////////////////////////////////////print array before transposs
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(original[i][j] + " ");
            }
            System.out.print("\n");
        }
        /////////////////////////////////////////////////print array after transposs
        System.out.print("\n\n matrix transpose:\n");

            for (int i = 0; i <4; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(original[j][i] + " ");
                }
                System.out.print("\n");
            }

}}
