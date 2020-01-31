import java.util.Scanner;

public class SquareDriver {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double input = scan.nextDouble();
        Square S = new Square(input);
        System.out.println(S.calculateArea());
    }

}
