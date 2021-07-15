import java.util.Scanner;

public class FizzBuzz{
    public static void main (String args[]){
        
        Scanner sc = new Scanner(System.in);  

        System.out.print("Enter a number: "); 
        int n = sc.nextInt();  
        
        while (n<1 || n>=200000){
            if (n<=0)
            System.out.println("Number must be bigger than 0!");
            else
            System.out.println("Number must be less than 200000!");  

            System.out.print("Enter a number: "); 
            n = sc.nextInt();  
        }

        for (int i=1; i<=n; i++){
            if(i%15==0)
                System.out.println("FizzBuzz");
            else if(i%3==0)
                System.out.println("Fizz");
            else if(i%5==0)
                System.out.println("Buzz");
            else
                System.out.println(i);
        }

        sc.close(); 
    }
}