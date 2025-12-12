package Q10_3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<Shape>();
        shapes.add(new Circle());
        shapes.add(new Square());
        for(Shape s: shapes){
            s.draw();
        }

    }
}
