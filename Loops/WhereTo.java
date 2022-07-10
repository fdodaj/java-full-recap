import java.net.SocketTimeoutException;
import java.util.Scanner;

public class WhereTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Where from? ");
        int from = scanner.nextInt();
        System.out.print("Where to:");
        int where = scanner.nextInt();

        while(from <= where){
            if(from > where){
                break;
            }
            System.out.println(from);
            from++;

        }

    }
}
