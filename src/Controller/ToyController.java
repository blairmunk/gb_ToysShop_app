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
}
