package baseball_statistics;
import java.util.Scanner; 

public class Player {
	public static void main(String[] args) {
		Scanner s = new Scanner ( System.in );
		System.out.print("Enter At Bats: ");
	      double AB = s.nextInt();
	      System.out.print("Enter Hits: ");
	      double H = s.nextInt();
	      System.out.print("Enter Doubles: ");
	      double D = s.nextInt();
	      System.out.print("Enter Triples: ");
	      double T = s.nextInt();
	      System.out.print("Enter Home Runs: ");
	      double HR = s.nextInt();
	      System.out.print("Enter Runs: ");
	      double R = s.nextInt();
	      System.out.print("Enter Walks: ");
	      double W = s.nextInt();
	      System.out.print("Enter Hits By Pitch: ");
	      double HBP = s.nextInt();
	      System.out.print("Enter Sacrifice Flys: ");
	      double SF = s.nextInt();
	      
	      double SINGLE = (H - D - T - HR);
	      double BA = H / AB;
	      double OBP = (H + W + HBP)/(AB + W + HBP + SF);
	      double SLG = (SINGLE + (2 * D) + (3 * T) + (4 * HR))/AB;
	      double OPS = OBP + SLG;
	      double TB = (SINGLE + (2 * D) + (3 * T) + (4 * HR));
	      
	      System.out.println("Batting average is: " + BA);
	      System.out.println("On Base Percentage is: " + OBP);
	      System.out.println("Slugging Percentage is: " + SLG);
	      System.out.println("On Base Plus Slugging is: " + OPS);
	      System.out.println("Total Bases is: " + TB);
	}
}