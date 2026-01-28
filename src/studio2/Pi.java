import java.util.Scanner;
public class Pi {
    public static void main(String args[]){
        System.out.println("This is the Pi class in the studio2 package.");
        Scanner input =  new Scanner (System.in);
        System.out.println("Enter the number of terms to approximate Pi: ");
        int terms = input.nextInt();
        double piApproximation;
        int count=0;
        100
        for (int i=0; i<terms; i++) {
           double x =  Math.random();
           double y = Math.random();
            double radius = Math.sqrt((x*x) + (y*y));
              if (radius <= 1) {
                count++;
        }
    }
    double piEstimate = 4.0 * count / terms;
    System.out.println("Approximation of Pi after " + terms + " terms: " + piEstimate);
}
}
