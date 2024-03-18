import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean b = true;

        while (b)
            try {
                System.out.println("""
                        press 0 to end the program
                        press 1 for a 4-10 grid for 2 players""");
                Scanner sc = new Scanner(System.in);
                int choice = sc.nextInt();
                if (choice < 3) {
                    switch (choice) {
                        case 0:b=false;
                            break;
                        case 1:
                            MoreSizes size = new MoreSizes(true);
                            size.start();
                            break;
                    }
                }
            } catch (Exception e) {
                System.out.println("an error has occured");
            }


    }
}