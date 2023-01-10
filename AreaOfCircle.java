//Area Of Circle Java Program
import java.util.Scanner;
import java.lang.Math;
public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter radius of circle : ");
        int radius = input.nextInt();

        System.out.printf("area of circle is %f",Math.PI*radius*radius);
    }
}
