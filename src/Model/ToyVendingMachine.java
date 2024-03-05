package Model;
import java.util.*;

public class ToyVendingMachine {
    private List<Toy> toyList; // Список игрушек
    private Random random; // Генератор случайных чисел

    public ToyVendingMachine() {
        toyList = new ArrayList<>(); // Создание нового пустого списка игрушек
        random = new Random(); // Инициализация генератора случайных чисел
    }

    public void addToy(Toy toy) {
        toyList.add(toy); // Добавление игрушки в список
    }

    public Toy dispenseToy() {
        if (toyList.isEmpty()) {
            return null; // Если список игрушек пуст, возвращаем null
        }

        double totalWeight = toyList.stream().mapToDouble(Toy::getWeight).sum(); // Вычисление суммарного веса всех игрушек
        double randomValue = random.nextDouble() * totalWeight; // Генерация случайного значения от 0 до суммарного веса

        double cumulativeWeight = 0;
        for (Toy toy : toyList) {
            cumulativeWeight += toy.getWeight(); // Накопление веса игрушек
            if (randomValue < cumulativeWeight) {
                toyList.remove(toy); // Удаление выбранной игрушки из списка
                return toy; // Возвращение выбранной игрушки
            }
        }
        return null; // Возвращение null, если игрушка не была выбрана
    }

    public boolean isEmpty() {
        return toyList.isEmpty(); // Проверка, пуст ли список игрушек
    }
}