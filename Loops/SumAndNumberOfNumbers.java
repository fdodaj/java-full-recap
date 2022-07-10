import java.util.Scanner;

public class SumAndNumberOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        while(true){
            System.out.println("Give a number: ");
            int input  = scanner.nextInt();
            if(input == 0){
                break;
            }
            else{
                sum = sum + input;
                count++;
            }
        }
        System.out.println("Sum of numbers:" + sum);
        System.out.println("Number of numbers:" + count);
    }
}
