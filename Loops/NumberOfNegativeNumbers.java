import java.util.Scanner;

public class NumberOfNegativeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;

        while(true){
            System.out.println("give a number:");
            int input = scanner.nextInt();
            if(input == 0){
                break;
            }
            else if(input<0){
                count++;
            }
        }
    System.out.println("Number of negative numbers: " + count);
    }
}
