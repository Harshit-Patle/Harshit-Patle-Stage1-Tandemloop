import java.util.Scanner;
import java.util.HashMap;

public class Problem4 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the numbers:");
        String inputLine = sc.nextLine();
        
        String cleanInput = inputLine.replace("[", "").replace("]", "");
        
        String[] strNumbers = cleanInput.split(",");
        
        int[] numbers = new int[strNumbers.length];
        
        for(int i = 0; i < strNumbers.length; i++) {
            numbers[i] = Integer.parseInt(strNumbers[i].trim());
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