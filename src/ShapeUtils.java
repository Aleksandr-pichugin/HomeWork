public class ShapeUtils {
    public void printArea(Circle c) {
        System.out.println("Площадь круга " + c.area());
    }

    public void printArea(Rectangle r) {
        System.out.println("Площадь прямоугольника " + r.area());
    }

    public void printArea(Shape s) {
        System.out.println("Общая площадь фигуры " + s.area());
    }
}
