package Questions15_30;

public class Q8 {
}
interface Printable {
    public void setMargin();
    public void setOrientation();
}

abstract class Paper implements Printable { //Line 7
    public void setMargin() {}
    //Line 9
}

class NewsPaper extends Paper { //Line 12
    public void setMargin() {}

    @Override  // added after
    public void setOrientation() {

    }
    //Line 14
}