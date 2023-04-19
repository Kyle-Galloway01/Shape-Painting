

import java.awt.Graphics;

public class Rectangle extends Shape {

    protected int width  = 10;
    protected int height = 5;  

    public Rectangle() {
     
    }

    public Rectangle(int x, int y, int width, int height, String color) {
        super(x, y, color);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw(Graphics g) {
        if (g==null)
            System.out.println("drawing a " + width + "x" + height + " " + color + " rectangle");
        else {
            g.setColor(color);
            g.drawRect(x, y, width, height);
        }
    }
    
}
