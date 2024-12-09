import java.util.Scanner;
    

        class Food {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int X = sc.nextInt();
        int Y = sc.nextInt();
        
        int messCost = X * 6;
        int restaurantCost = Y;
        
        int totalCost = messCost + restaurantCost;
        
        System.out.println(totalCost);
    }
}
