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
        System.out.println("2. Добавить игрушки списком");
        System.out.println("3. Розыгрыш игрушки");
        System.out.println("4. Выход");
    }

    public void processInput(int choice) {
        switch (choice) {
            case 1:
                // Запросить данные для новой игрушки
                Scanner scanner1 = new Scanner(System.in);
                System.out.println("Введите имя игрушки:");
                String name = scanner1.nextLine();
                System.out.println("Введите вес игрушки в процентах (от 0 до 100):");
                double weight = scanner1.nextDouble();
                controller.addToy(name, weight);
                break;
            case 2:
                // Добавление игрушек списком
                Scanner scanner2 = new Scanner(System.in);
                System.out.println("Введите имена игрушек через пробел:");
                String names = scanner2.nextLine();
                System.out.println("Введите веса игрушек через пробел:");
                String weights = scanner2.nextLine();
                controller.addMultipleToys(names, weights);
                break;
            case 3:
                // Розыгрыш игрушки
                Toy toy = controller.dispenseToy();
                if (toy != null) {
                    System.out.println("Вы получили игрушку: " + toy.getName());
                } else {
                    System.out.println("Игрушки закончились");
                }
                break;
            case 4:
                // Выход из программы
                System.exit(0);
                break;
            default:
                System.out.println("Неверный выбор");
                break;
        }
    }
}
