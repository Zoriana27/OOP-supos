package Q10_3;

import java.util.ArrayList;

public class CompositeShape implements Shape{

    private final ArrayList<Shape> shapes =  new ArrayList<Shape>();
    public void add(Shape s){
        shapes.add(s);
    }
    @Override
    public void draw() {
        for(Shape s: shapes){
            s.draw();
        }
    }
}
