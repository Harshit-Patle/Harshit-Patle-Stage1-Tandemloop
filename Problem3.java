import java.util.Scanner;

public class Problem3 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        
        if (a % 2 == 0) {
            a--;
        }
        
        int index = 1;
        while(a > 0) {
            if(index % 2 != 0) {
            	
                if(a > 1) {
                     System.out.print(index + ", ");
                } else {
                     System.out.print(index);
                }
                a--;
            }
            index++;
        }
        
        System.out.println();
        
        sc.close();
    }
}