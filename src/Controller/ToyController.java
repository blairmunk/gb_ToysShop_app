package Controller;

import Model.Toy;
import Model.ToyVendingMachine;

public class ToyController {
    private ToyVendingMachine vendingMachine;

    public ToyController() {
        vendingMachine = new ToyVendingMachine();
    }

    public void addToy(String name, double weight) {
        Toy toy = new Toy(name, weight);
        vendingMachine.addToy(toy);
    }

    public Toy dispenseToy() {
        return vendingMachine.dispenseToy();
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

