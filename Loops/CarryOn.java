import java.util.Scanner;

public class CarryOn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("Shall we cary on?");
            String input = sc.nextLine();
            if(input.equalsIgnoreCase("no")){
                break;
            };

        }

    }

}
