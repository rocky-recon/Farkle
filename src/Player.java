
import java.util.Scanner;

public class Player {
    public static void main(String[] args) {

        players();
        playerOne();

    }
    private static void players() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of players ");
        int name = in.nextInt();
        System.out.println("Number of players are: " + name);
    }



    private static void playerOne() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = in.nextLine();
        System.out.println("Player name is: " + name);
        in.close();
    }

    private static void gameType() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = in.nextLine();
        System.out.println("Player name is: " + name);
        in.close();
    }
}




