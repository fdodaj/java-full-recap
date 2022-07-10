import java.net.SocketTimeoutException;
import java.util.Scanner;

public class AverageOfPositiveNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isZero = true;
        int count = 0;
        double sum = 0;
        while(true){
            System.out.println("Give a number");
            int input = scanner.nextInt();
            if(input == 0){
                count++;
                isZero = true;
                break;
            }
            else{
                if(input > 0){
                    sum = sum + input;
                    count++;
                }
            }
        }

        if(isZero = true && count == 1){
            System.out.println("Cannot calculate the average");
        }
        else{
            System.out.println("Average of numbers: " + sum / (count -  1));
        }
    }
}
