import java.util.Scanner;

public class LastLetters {
    public static void main (String args[]){
        
        Scanner sc = new Scanner(System.in);  
    
        System.out.print("Enter a word: "); 
        String word = sc.nextLine(); 

        while(word.length()<2 || word.length()>100) {
            if(word.length()<2)
            System.out.println("The word must have at least 2 letters!");
            else 
            System.out.println("The word must have not more than 100 letters!");
            System.out.print("Enter a word: "); 
            word= sc.nextLine(); 
        }

        String lastletters = word.charAt(word.length()-1)+" "+word.charAt(word.length()-2);
        System.out.println(lastletters);
      
        sc.close(); 
    }
}
