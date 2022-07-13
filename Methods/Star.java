public class Star {
    public static void main(String[] args) {
        printTriangle(4);
    }
    public static void printStars(int number) {
        int max = 1;
        while(max<=number){
            System.out.print("*");
            max++;
        }
        System.out.println("");
    }
    public static void printSquare(int size){
        int limit = 1;
        while(limit <= size){
            printStars(size);
            limit++;
        }
    }

    public static void printRectangle(int width, int height){
        int limit = 1;
        while(limit<=height){
            printStars(width);
            limit++;
        }
    }

    public static void printTriangle(int size){
        int limit = 1;
        while(limit <= size){
            printStars(limit);
            limit++;
        }
    }

}   
