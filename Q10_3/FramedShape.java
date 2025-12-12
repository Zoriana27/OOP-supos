package Q10_3;

public class FramedShape implements Shape{
    //Decorator

    private final Shape FramedShape;
    public FramedShape(Shape s){
        FramedShape = s;
    }
    public Shape frame(){
        return FramedShape;
    }
    @Override
    public void draw(){
        FramedShape.draw();
    }
}
