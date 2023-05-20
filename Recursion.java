public class Recursion {
    public static void main(String[] args) {
printingWithoutLoop(1);
    }
    public static void printingWithoutLoop(int x){
        if(x<=10){
            System.out.println(x);
        printingWithoutLoop(x+1);

        }
    }
}
