package Factory;

/**
 * Created by wilder on 11/06/17.
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
