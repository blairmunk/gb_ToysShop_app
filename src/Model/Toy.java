package Model;

public class Toy {
    private static int count = 0; // статическое поле для подсчета количества экземпляров класса
    private int id;
    private String name;
    private double weight;

    public Toy(String name, double weight) {
        this.id = ++count; // увеличиваем счетчик и присваиваем его значение полю id
        this.name = name;
        this.weight = weight;
    }

    // Геттеры и сеттеры для свойств

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    // Метод для изменения веса (частоты выпадения игрушки)
    public void changeWeight(double newWeight) {
        this.weight = newWeight;
    }

    // Метод для получения общего количества игрушек
    public static int getTotalQuantity() {
        return count;
    }
}
