import java.util.Scanner;

public class LastLetters {

    public static boolean isLetter(String s){
        for (int i=0; i<s.length(); i++){
            char c=s.charAt(i);
            if (!(c>='a' && c<='z') && !(c>='A' && c<='Z')) {
                return false;
            }
        }
        return true;
    }

    public static boolean wordSize(String w) {
        if(w.length()<2 || w.length()>100)
            return false;
        else
            return true;
    }

    public static void main (String args[]){
        
        Scanner sc = new Scanner(System.in);  
    
        System.out.print("Enter a word: "); 
        String word = sc.nextLine(); 
        
        while(isLetter(word)==false || wordSize(word)==false) {
            if(isLetter(word)==false)
                System.out.println("Enter only letters!");
            if(wordSize(word)==false)
                System.out.println("The word must contain at least 2 letters and not more than 100!");
            System.out.print("Enter a word: ");
            word= sc.nextLine();
        }
        
        String lastletters = word.charAt(word.length()-1)+" "+word.charAt(word.length()-2);
        System.out.println(lastletters);
        
        sc.close(); 
    }
}
