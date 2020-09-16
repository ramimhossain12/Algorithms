import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        int num, i, j, temp;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any INteger Number:");

        num = in.nextInt();
        int array[] = new int[num];
        System.out.println("Integer" + num + " value");


        for (i = 0; i < num; i++)
            array[i] = in.nextInt();

        for (i = 0; i < num - 1; i++) {

            for (j = 0; j < num - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];

                    array[j] = temp;
                }
            }

            System.out.println("Sorted list of integers:");

            for (i = 0; i < num; i++)
                System.out.println(array[i]);
        }
    }
}