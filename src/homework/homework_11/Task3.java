package homework.homework_11;

public class Task3 {
    public static void main(String[] args) {

        int[] array = {5, 8, 9, 10, 9, 8, 5};

        System.out.println(isPalindrome(array));
    }

    public static boolean isPalindrome(int[] array) {
        if (array == null || array.length == 0) {
            return false;
        }

        int n = array.length;
        for (int i = 0; i < n / 2; i++) {
            if (array[i] != array[n - 1 - i]) {
                return false;
            }
        }


        return true;
    }

}
