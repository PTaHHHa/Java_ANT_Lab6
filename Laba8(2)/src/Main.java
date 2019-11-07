import java.util.Scanner;
import another_package.*;
public class Main {
    public static void main(String [] args) {
        while(true) {
            Scanner input = new Scanner(System.in);
            System.out.println("Input your string: ");
            String word = input.nextLine();
            if (word.equals("exit")){
                break;
            }
            else{
                proj2 out = new proj2(word);
            }
        }
    }
}
