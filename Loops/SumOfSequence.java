import java.util.Scanner;

public class SumOfSequence{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First number");
        int f = scanner.nextInt();
        System.out.println("Last number");
        int l = scanner.nextInt();
        int sum = 0;
        while(f <= l){
            sum = sum + f;
            f++;
        }
        System.out.println("The sum is:" + sum);
    }
}