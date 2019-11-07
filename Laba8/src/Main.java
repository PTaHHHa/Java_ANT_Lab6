import java.util.Scanner;
import new_package.*;
public class Main {
    public static void main(String [] args) {
        while(true) {
            Scanner input = new Scanner(System.in);
            System.out.println("Input your string: ");
            String word = input.nextLine();
            if (word.equals("exit")){
                break;
            }
            else if (word.equals("")){
                System.out.println("Nothing was passed as input text :/");
            }
            else{
                output out = new output(word);
            }
        }
    }
}
