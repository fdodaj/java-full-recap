import java.util.Scanner;

import javax.management.MBeanAttributeInfo;

public class ToHundred {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        while(input<=100){
            System.out.println(input);
            input++;
        }

    }   
}
