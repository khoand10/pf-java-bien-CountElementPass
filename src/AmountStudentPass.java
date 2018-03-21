import java.util.Scanner;

public class AmountStudentPass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        int[] array;
        do {
            System.out.print("Enter a size of array:");
            size = sc.nextInt();
            if (size > 30)
                System.out.println("Size should not exceed 20");
        } while (size > 30);
        array = new int[size];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter mark of student " + (i + 1) + ":");
            array[i] = sc.nextInt();
        }

        int count=0;
        for (int a : array) {
            if(a>=5 && a<=10)count++;
            System.out.print(a + "\t");
        }
        System.out.println("\n The number student pass :"+count);
    }
}
