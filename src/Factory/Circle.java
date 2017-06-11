package Factory;

/**
 * Created by wilder on 11/06/17.
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
