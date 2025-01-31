package Day4;

public class DiagonalElementPrint {
    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 } };
        int row = 0;
        while (row < arr.length) {
            int r = row;
            int c = 0;
            while (r >= 0) {
                System.out.print(arr[r][c] + "");
                r--;
                c++;
            }
            row++;
        }
        int col = 1;
        while (col < arr[0].length) {
            int r = arr.length - 1;
            int c = col;
            while (c < arr[0].length) {
                System.out.print(arr[r][c] + "");
                r--;
                c++;
            }
            col++;
        }
    }
}