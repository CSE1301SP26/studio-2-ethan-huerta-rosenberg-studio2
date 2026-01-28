import java.util.Scanner;
public class Pi {
    public static void main(String args[]){
        System.out.println("This is the Pi class in the studio2 package.");
        Scanner input =  new Scanner (System.in);
        System.out.println("Enter the number of terms to approximate Pi: ");
        int terms = input.nextInt();
        double piApproximation;

        for (int i=0; i<terms; i++) {
           double x =  Math.random();
           double y = Math.random();
            double radius = Math.sqrt((x*x) + (y*y));
              if (radius <= 1) {
                piApproximation = 4.0 / (2*radius);
                System.out.println("Approximation of Pi after " + (i+1) + " terms: " + piApproximation);
        }
    }
}
}
