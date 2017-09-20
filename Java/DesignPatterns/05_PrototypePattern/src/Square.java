/**
 * Created by Broccoli on 2017/9/20.
 */
public class Square extends Shape {
    public Square() {
        type = "Square";
}

    @Override
    void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
