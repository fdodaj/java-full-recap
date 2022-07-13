import java.util.Scanner;

public class Reprint {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many times: ");
        int number = scanner.nextInt();
        int limit = 0;
        while(limit < number){
            limit++;
            System.out.print(limit + " ");
            printText();
            
        }
    }
    public static void printText() {
            System.out.println("In a hole in the ground there lived a method"); 
        }

}
