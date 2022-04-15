/**
 * @author viktorvoltz
 */

public class SingletonPattern {
    private String _id;

    private static SingletonPattern instance;

    public static SingletonPattern getInstance(String id) {
        // check if instance has not been created
        if (instance == null) {
            instance = new SingletonPattern(id);
            return instance;
        } else {
            // if instance already exists
            return instance;
        }

    }

    // new object creation is inaccessible through constructor
    private SingletonPattern(String id) {
        this._id = id;
    }

    @Override
    public String toString() {
        return _id;
    }
}
