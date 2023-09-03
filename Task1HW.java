//1. Реализуйте метод, принимающий в качестве аргументов двумерный массив.
//Метод должен проверить что длина строк и столбцов с одинаковым индексом одинакова, 
//детализировать какие строки со столбцами не требуется.
import java.util.Arrays;

public class Task1HW {
        public static void main (String [] args) {
        int[][] ints1 = {{1, 2, 3, 4}, {4, 5, 6, 1}
//            new int[] {1, 2, 3, 4, 5},
//            new int[] {4, 5, 6, 1}
        };

        compare(ints1);
    }

    public static void compare (int[][] arr1) {

        try {
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i].length != arr1.length) {
                    throw new NullPointerException();
                }
            }
        } catch (NullPointerException e) {
            System.out.println("Column length don't equal row length");
        } finally {
            System.out.println("Ok");
        }
    }
}
