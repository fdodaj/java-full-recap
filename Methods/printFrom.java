import java.nio.channels.Pipe;

public class printFrom {
    public static void main(String[] args) {
        printFromNumberToOne(10);

    }

    
    public static void printFromNumberToOne(int from){
        while(from > 0){
            System.out.println(from);
            from--;
        }
    }
}
