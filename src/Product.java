public class Product {
    // Приватные поля
    private String name;
    private double price;
    private int quantity;

    // Конструктор
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
//
    // Геттеры (только для чтения)
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // Сеттер для цены с проверкой
    public void setPrice(double price) {
        if (price <= 0) {
            throw new IllegalArgumentException("Цена не может быть отрицательной");
        } else {
            this.price = price;
        }
    }

    public double totalCost() {
        return price * quantity;
    }
}