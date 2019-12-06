import java.util.Scanner;

class RottenPotatoes
{
    public static void main(String[] args) {
        boolean run = true;
        
            while (run == true) {
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
            
            int c = sc.nextInt();
            
            System.out.println("");
            
            if (c == 1) {
                System.out.println("Enter the movie's index.");
                
                System.out.println("");
                
                int mov = sc.nextInt();
                
                System.out.println("");
                
                System.out.println("The movie has an average rating of: " + movieAvgRating(data, mov));
            }
            if (c == 2) {
                System.out.println("Enter the reviewer's index.");
                
                System.out.println("");
                
                int rev = sc.nextInt();
                
                System.out.println("");
                
                System.out.println("The reviewer's average rating is: " + reviewerAvgRating(data, rev));
            }
            if (c == 3) {
                System.out.println("Not working right now, sorry.");
            }
            if (c == 4) {
                System.out.println("The hardest reviewer's index is: " + hardestReviewer(data));
            }
            if (c == 5) {
                System.out.println("The worst movie's index is: " + worstMovie(data));
            }
        }
    }
    
    public static int movieAvgRating(int[][] data, int mov) {
        int count = 0;
        int total = 0;
        
        for (int i = 0; i < data.length; i++) {
            total += data[i][mov];
            count++;
        }
        
        double t = Math.round(1.0*total/count);
        
        return (int) t;
    }
    
    public static int reviewerAvgRating(int[][] data, int rev) {
        int count = 0;
        int total = 0;
        
        for (int i = 0; i < data[rev].length; i++) {
            total += data[rev][i];
            count++;
        }
        
        double t = Math.round(1.0*total/count);
        
        return (int) t;
    }
    
    public static int allAvgRatings(int[][] data) {
        return 1;
    }
    
    public static int hardestReviewer(int[][] data) {
        int r = reviewerAvgRating(data, 0);
        int ans = 0;
        
        for (int i = 0; i < data.length; i++) {
            if (reviewerAvgRating(data, i) < r) {
                r = reviewerAvgRating(data, i);
                ans = i;
            }
        }
        
        return ans;
    }
    
    public static int worstMovie(int[][] data) {
        int m = movieAvgRating(data, 0);
        int ans = 0;
        
        for (int i = 0; i < data[0].length; i++) {
            if (movieAvgRating(data, i) < m) {
                m = movieAvgRating(data, i);
                ans = i;
            }
        }
        
        return ans;
    }
}
