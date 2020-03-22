package MaxInArray;

import java.util.Scanner;

public class MaxInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter N: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        if (n > 20) {
            System.out.println("out Size");
        } else {
            System.out.println("So Phan tu torng array:  ");
            for (int i = 0; i < array.length; i++) {
                System.out.print("arr[" + i + "]: ");
                array[i] = scanner.nextInt();
            }
            for (int value : array) {
                System.out.print(value + " ");
            }
            int max = array[0];
            for (int value : array) {
                if (max < value) {
                    max = value;
                }
            }
            System.out.println("max= "+ max);
        }
    }
}
