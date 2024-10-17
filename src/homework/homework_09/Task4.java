package homework.homework_09;

public class Task4 {
    public static void main(String[] args) {

        for (int i = 1; i < 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println("=================================\n");
        int[][] arr = new int[3][4];
        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
            arr[i][j] = i + j;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
