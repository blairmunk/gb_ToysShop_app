package Controller;

import java.io.FileWriter;
import java.io.IOException;

import Model.Toy;
import Model.ToyVendingMachine;

public class ToyController {
    private ToyVendingMachine vendingMachine;
    private FileWriter fileWriter;

    public ToyController() {
        vendingMachine = new ToyVendingMachine();
        try {
            fileWriter = new FileWriter("toy_data.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void addToy(String name, double weight) {
        Toy toy = new Toy(name, weight);
        vendingMachine.addToy(toy);
    }

    public Toy dispenseToy() {
        Toy toy = vendingMachine.dispenseToy();
        if (toy != null) {
            try {
                fileWriter.write(toy.getName() + " ");
                fileWriter.write(toy.getWeight() + "\n");
                fileWriter.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return toy;
    }

    public void closeFileWriter() {
        try {
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void addMultipleToys(String names, String weights) {
        String[] nameArray = names.split(" ");
        String[] weightArray = weights.split(" ");
    
        if (nameArray.length != weightArray.length) {
            System.out.println("Ошибка: количество имен игрушек не соответствует количеству весов");
            return;
        }
    
        for (int i = 0; i < nameArray.length; i++) {
            String name = nameArray[i];
            double weight = Double.parseDouble(weightArray[i]);
            Toy toy = new Toy(name, weight);
            vendingMachine.addToy(toy);
        }
    }
}

