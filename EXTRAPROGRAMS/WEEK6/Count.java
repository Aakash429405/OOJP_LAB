import java.util.Scanner;
public class Count {

    public static void main(String[] args) {
        String line ;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the line");
        line=s.nextLine();
        
        int vowels = 0, consonants = 0, spaces = 0;

        line = line.toLowerCase();
        for(int i = 0; i < line.length(); ++i)
        {
            char ch = line.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i'
                || ch == 'o' || ch == 'u') {
                ++vowels;
            }
            else if((ch >= 'a'&& ch <= 'z')) {
                ++consonants;
            }
          
            }
            else if (ch ==' ')
            {
                ++spaces;
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("White spaces: " + spaces);
    }
}
