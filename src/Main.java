import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input array 1 length");
        int arrayN1 = scanner.nextInt();

        System.out.println("Input array 2 length");
        int arrayN2 = scanner.nextInt();

        int[] array1 = new int[arrayN1];
        int[] array2 = new int[arrayN2];

        System.out.println("Array 1: ");
        for (int i = 0; i < array1.length; i++) {
            System.out.print("Input element " + i + " : ");
            int element = scanner.nextInt();
            array1[i] = element;
        }

        System.out.println("Array 2: ");
        for (int i = 0; i < array2.length; i++) {
            System.out.print("Input element " + i + " : ");
            int element = scanner.nextInt();
            array2[i] = element;
        }

        int[] array3 = new int[array1.length + array2.length];
        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i];
        }

        for (int i = 0; i < array2.length; i++) {
            array3[i+array1.length] = array2[i];
        }
        System.out.println("Array 1: ");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println();
        System.out.println("Array 2: ");
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }
        System.out.println();
        System.out.println("Array 3: ");
        for (int i = 0; i < array3.length; i++) {
            System.out.print(array3[i] + " ");
        }
    }
}