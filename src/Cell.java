/**
 * Created by marv on 5/21/2015.
 */
public class Cell {
    private int state = 0;


    public void setX() {
        this.state = 1;
    }

    public void set0() {
        this.state = -1;
    }

    public int getState() {
        return this.state;
    }
}
