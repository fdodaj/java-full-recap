import java.net.SocketTimeoutException;
import java.util.Scanner;
import java.util.function.DoubleUnaryOperator;

public class AverageOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        double sum = 0;
        while(true){
            System.out.println("Enter numebrs:");
            int input = scanner.nextInt();
            if(input == 0 ){
                break;
            }
            else{
                sum = sum + input;
                count++;
            }
        }
        System.out.println("Average of numbers: " + sum / count);

    }
}
