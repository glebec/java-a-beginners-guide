/**
 * OverConstruct
 */
public class OverConstruct {

    private int data;

    OverConstruct (int init) {
        data = init;
    }

    OverConstruct (OverConstruct init) { // overloaded constructor
        data = init.getData();
    }

    /**
     * @return the data
     */
    public int getData() {
        return data;
    }
}
