import java.awt.*;

void main() {
    Shape[] shapes={
            new Shape(),
            new Circle(5),
            new Rectangle(4,5.5)
    };
    ShapeUtils shapeUtils = new ShapeUtils();

    for (Shape s : shapes){
        System.out.println(s.area());
        shapeUtils.printArea(s);
    }
    }




