package programmingcourse.timbuchalka;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner (System.in);
    public static void main(String[] args) {

        printArray(sortIntegers(getIntegers(5)));


        }
        public static int[] getIntegers (int number) {
            System.out.println("Enter " + number + " integer valuer.\r");
            int[] values = new int[number];

            for (int i = 0; i<values.length; i++) {
                values[i] = scanner.nextInt();
            }
            return values;
        }

        public static void printArray (int[] print) {
            for (int i = 0; i<print.length; i++) {
                System.out.println("Element " + i + " contents " + print[i]);
            }

        }

        public static int [] sortIntegers (int[] sort) {
            int [] sortedArray = Arrays.copyOf(sort, sort.length);
//            int [] sortedArray = new int[sort.length];
//            for (int i = 0; i<sort.length; i++) {
//                sortedArray[i] = sort[i];
//            }

            boolean flag = true;
            int temp;

            while(flag) {
                flag = false;
                for (int i = 0; i < sortedArray.length; i++) {
                    for (int j = i; j > 0; j--) {
                        if (sortedArray[j] > sortedArray[j - 1]) {
                            temp = sortedArray[j];
                            sortedArray[j] = sortedArray[j - 1];
                            sortedArray[j - 1] = temp;
                            flag = true;
                        }
                    }
                }
            }
            return sortedArray;
        }
}
