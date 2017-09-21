/**
 * Created by Broccoli on 2017/9/20.
 */
public class RedCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: red, radius: " + radius +", x: " +x+", "+ y +"]");
    }
}
