package Kyle-Galloway01.shapes;


import java.awt.Graphics;
import java.awt.Color;

public abstract class Shape {

    public static final Color DEFAULTCOLOR = Color.RED;
    protected Color color; // the data that is common to ALL shapes
    protected int x;        // x,y is the top left 
    protected int y;

    // default constructor
    public Shape() {
        this.color = DEFAULTCOLOR;
    }

    public Shape(int x, int y, String color) {
        this.x = x;
        this.y = y;
        this.color = Color.decode(color);
    }

    abstract public void draw(Graphics g);

}
