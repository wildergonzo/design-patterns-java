package Singleton;

/**
 * Created by wilder on 11/06/17.
 */
public class SingletonPatternDemo {
    public static void main(String[] args){
        //any instantiation try will fail
        //SingleObject object = new SingleObject();

        //get only object available
        SingleObject object = SingleObject.getInstance();

        //show the message
        object.showMessage();
    }
}
