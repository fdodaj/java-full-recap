import java.util.Scanner;

import javax.lang.model.element.Element;

public class OnlyPositives {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        while(true){
            System.out.println("Give a nunber:");
            int input = scanner.nextInt();
            if(input<0){
                System.out.println("Unsuitable number");
                continue;
            }
            else if(input==0){
                System.out.println("Bye");
                break;
            }
            else{
                 System.out.println(input * input);
            }
        }
    }
    
}
