import java.util.Scanner;
public class Ruin {
    public static void main(String[] args) {
        System.out.println("This is the Ruin class in the studio2 package.");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the starting amount, win chance, win limit, and total simulations: ");
         int startAmount = input.nextInt();
        double winChance = input.nextDouble();
        int winLimit = input.nextInt();
        int totalSimulation =  input.nextInt();
        
        for (int i=1; i<=totalSimulation; i++) {
            int currentAmount = startAmount;
            while (currentAmount > 0 && currentAmount < winLimit) {
                if (Math.random() < winChance) {
                    currentAmount++;
                } else {
                    currentAmount--;
                }
            }
            if (currentAmount >= winLimit) {
                System.out.println("Simulation " + (i) + ": Win");
            } else {
                System.out.println("Simulation " + (i) + ": Ruin");
            }
        }
        double p = (1 - winChance) / winChance;
        double eRuin;
        if (winChance == 0.5) {
            eRuin = (double)(winLimit - startAmount) / winLimit;
        } else {
            eRuin = (Math.pow(p, startAmount) - Math.pow(p, winLimit)) / (1 - Math.pow(p, winLimit));
        }
        eRuin = (int)Math.round(eRuin * 100) / 100.0;
        System.out.println("Ruin Rate from Simulation: " + eRuin + " Expected Ruin Rate: ");
        System.out.println(p);
    }
}
