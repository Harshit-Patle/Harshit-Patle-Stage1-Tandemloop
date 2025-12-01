import java.util.Scanner;
import java.util.HashMap;

public class Problem4 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter count of numbers: ");
        int n = sc.nextInt();
        
        int[] numbers = new int[n];
        
        System.out.println("Enter the numbers: ");
        for(int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        
        HashMap<Integer, Integer> counts = new HashMap<>();
        
        for(int i = 1; i <= 9; i++) {
            int count = 0;
            
            for(int num : numbers) {
                if(num % i == 0) {
                    count++;
                }
            }
            
            counts.put(i, count);
        }
        
        System.out.println(counts);
        
        sc.close();
    }
}