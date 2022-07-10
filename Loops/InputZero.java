import java.util.Scanner;

public class InputZero{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("Give a number");
            int input = scanner.nextInt();
            if(input == 4){
                break;
            }

        }

    }
}
