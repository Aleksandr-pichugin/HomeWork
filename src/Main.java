import java.awt.*;



void main() {
        Thermometer thermometer = new Thermometer();

        thermometer.setTemp(51);
        System.out.println(thermometer.getTemp());

    }

   public static void main(String[] args) {
        // Создаём товар
        Product product = new Product("Часы", 5000.0, 3);

        // Выводим его данные
        System.out.println("Название: " + product.getName());
        System.out.println("Цена: " + product.getPrice());
        System.out.println("Количество: " + product.getQuantity());
        System.out.println("Общая стоимость: " + product.totalCost());

        product.setPrice(-10);

        System.out.println("\nПосле попытки установить отрицательную цену:");
        System.out.println("Цена: " + product.getPrice());
        System.out.println("Общая стоимость: " + product.totalCost());
    }




