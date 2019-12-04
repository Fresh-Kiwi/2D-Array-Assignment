import java.util.Scanner;

class RottenPotatoes
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] data = { {4,6,2,5},
                         {7,9,4,8},
                         {6,9,3,7} };
        
        System.out.println("Enter '1' to find the average rating for a movie.");
        System.out.println("Enter '2' to find a reviewer's average rating.");
        System.out.println("Enter '3' to find the average rating for all movies and reviewers.");
        System.out.println("Enter '4' to find the hardest reviewer.");
        System.out.println("Enter '5' to find the worst movie.");
        
        System.out.println("");
        
        double c = sc.nextDouble();
        
        System.out.println("");
        
        if (c == 1) {
            System.out.println("Enter the movie's index.");
            
            System.out.println("");
            
            double ans = sc.nextDouble();
            
            System.out.println("");
            
            movieAvgRating(data, ans);
        }
        if (c == 2) {
            System.out.println("Enter the reviewer's index.");
            
            System.out.println("");
            
            double ans = sc.nextDouble();
        }
        if (c == 3) {
            
            
        }
        if (c == 4) {
            
            
        }
        if (c == 5) {
            
            
        }
    }
    
    public static double movieAvgRating(int[][] data, double ans) {
        return 1.0;
    }
}
