import java.util.Scanner;

public class Task2 {

    public static int tonghaisolonnhat(int[] numbers) {
        int max1 = Integer.MIN_VALUE; 
        int max2 = Integer.MIN_VALUE; 

        for (int number : numbers) {
            if (number > max1) {
                max2 = max1; 
                max1 = number; 
            } else if (number > max2) {
                max2 = number; 
            }
        }

        return max1 + max2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] input = new int[n];
        int result = tonghaisolonnhat(input);
        System.out.println(result);
    }

   
}
