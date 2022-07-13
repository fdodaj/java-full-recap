public class PrintUntil {

    public static void main(String[] args) {
        printUntil(8);

    }

   static int limit = 0;
    public static void printUntil(int to){
        while(limit < to){
            limit++;
            System.out.println(limit);
    }
    }
}
