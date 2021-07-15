import java.util.Arrays;
import java.util.Scanner;

public class CountDublicate {
    public static void main (String args[]){
        
        Scanner sc = new Scanner(System.in);  

        System.out.print("Enter size of the array: "); 
        int n = sc.nextInt();  

        while (n<3 || n>1000){
            if (n<3)
            System.out.print("Enter size of array bigger than 2: ");
            else
            System.out.print("Enter size of array less than 1001: ");  
            n = sc.nextInt();  
        }

        int[] numbers = new int[n];  
        
        System.out.println("Enter array: "); 
        for (int i=0; i<n; i++){
            numbers[i] = sc.nextInt();
            while(numbers[i]<1 || numbers[i]>1000){
                System.out.println("Enter number between 1 and 1000:");
                numbers[i] = sc.nextInt();
            }
        }
        
        Arrays.sort(numbers);
        int dublicate=0;
        for (int i=0; i<n; i++){
            int counter=0;

            for(int y=i+1; y<n; y++){
                if(numbers[i]==numbers[y])
                counter++;
                else {
                    i=y-1;
                    break;
                }
            }
            if(counter>0)
            dublicate++;
        }  

        System.out.println(dublicate); 
        sc.close(); 
    }
}
