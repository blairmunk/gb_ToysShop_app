package View;

import java.util.Scanner;

import Controller.ToyController;
import Model.Toy;

public class ToyView {
    private ToyController controller;

    public ToyView() {
        controller = new ToyController();
    }

    public void displayMenu() {
        System.out.println("1. Добавить игрушку");
        System.out.println("2. Розыгрыш игрушки");
        System.out.println("3. Выход");
    }

    public void processInput(int choice) {
        switch (choice) {
            case 1:
                // Запросить данные для новой игрушки
                Scanner scanner = new Scanner(System.in);
                System.out.println("Введите имя игрушки:");
                String name = scanner.nextLine();
                System.out.println("Введите вес игрушки:");
                double weight = scanner.nextDouble();
                controller.addToy(name, weight);
                break;
            case 2:
                // Розыгрыш игрушки
                Toy toy = controller.dispenseToy();
                if (toy != null) {
                    System.out.println("Вы получили игрушку: " + toy.getName());
                } else {
                    System.out.println("Игрушки закончились");
                }
                break;
            case 3:
                // Выход из программы
                System.exit(0);
                break;
            default:
                System.out.println("Неверный выбор");
                break;
        }
    }
}
