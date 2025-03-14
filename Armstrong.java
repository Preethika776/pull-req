import java.util.Scanner;
class Armstrong 
 {
  public static void main(String args[])  
  {
   Scanner scanner = new Scanner(System.in);
   int n = scanner.nextInt();          
   int s = 0, t = n; 
        while (t > 0)
          {
            int digit = t % 10; 
            s += (int) Math.pow(digit, 3); 
            t /= 10;  // Remove last digit
        }

        System.out.println(n == s ? "Armstrong" : "Not Armstrong"); 
    }
}
