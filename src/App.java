import java.util.Scanner;

import Controller.ToyController;
import View.ToyView;

public class App {
    public static void main(String[] args) {
        ToyView view = new ToyView();
        ToyController controller = new ToyController();

        boolean running = true;
        Scanner scanner = new Scanner(System.in);

        while (running) {
            view.displayMenu();
            int choice = scanner.nextInt();
            view.processInput(choice);
        }
    }
}