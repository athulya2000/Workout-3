import java.util.Scanner;

public class SearchElement {
    public static boolean search(int array[], int num) throws Exception {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                return true;
            }
        }
        return false;
    }
   public static void sortArray(int array[]) throws Exception {
        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
    public static void main (String[] args){
        try {
            System.out.println("Enter required size of the array");
            Scanner s = new Scanner(System.in);
            int size = s.nextInt();
            int[] array = new int[size];
            System.out.println(String.format("Enter array elements:"));
            for (int i = 0; i <= array.length; i++) {
                array[i] = s.nextInt();
            }
            System.out.println("Enter a number:");
            int num = s.nextInt();
            boolean isFound = search(array, num);
                if (isFound) {
                    System.out.println("FOUND");
                } else {
                    System.out.println("NOT FOUND");
                }

            sortArray(array);
            System.out.println("Sorted array is");
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i] + "");
            }

        }
         catch (Exception e) {
            System.out.println("Exception occure");
        }


    }
}

