package myassignment;

public class HouseTest {
    public static void main(String[] args) {
        // 1. Створюємо 2 будинки через конструктор з параметрами
        House houseSmith = new House("Smith", 5, 1);
        House houseJones = new House("Jones", 3, 1);

        // 2. Створюємо 1 будинок через порожній конструктор
        House houseBurke = new House();
        // і заповнюємо його даними через сеттери
        houseBurke.setSurnameOfOwners("Burke");
        houseBurke.setNumberOfBedrooms(4);
        houseBurke.setNumberOfBathrooms(2);

        // 3. Викликаємо метод для друку інформації для кожного будинку
        houseSmith.printDetails();
        houseJones.printDetails();
        houseBurke.printDetails();
    }
}