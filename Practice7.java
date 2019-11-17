public class Practice7 {
    public static void main(String[] args) {
        ShapePanel panel = new ShapePanel();


        panel.add(new Rectangle(20,20,3,4));
        panel.add(new Circle(10,10,10));
        panel.display();

        panel.add(new Rectangle(10,10,2,3));
        panel.add(new Rectangle(20,20,3,4));

        panel.display();

        panel.add(new Circle(100,100,2));
        panel.add(new Circle(10,10,10));
        panel.delete(new Circle(10,10,10));
        panel.display();
    }
}

class ShapePanel {
    final static int MAX_SIZE = 100;
    private Shape[] shapes;
    private int count;

    public ShapePanel() {
        shapes = new Shape[MAX_SIZE];
        count = 0;
    }

    public void add(Shape s) {
        for (int i=0; i<count; i++) {
            if (shapes[i].equals(s)) {
                return;
            }
        }
        if (count<MAX_SIZE) {
            shapes[count++] = s;
        }
    }

    public void delete(Shape s) {
        for (int i=0; i<count; i++) {
            if (shapes[i].equals(s)) {
                for (int j=i; j<count-1; j++) {
                    shapes[j] = shapes[j+1];
                }
                count--;
            }
        }
    }

    public void display() {
        System.out.println("********** ShapePanel에 등록된 모든 도형 **********");
        for (int i=0; i<count; i++) {
            shapes[i].display();
        }
    }

}

abstract class Shape {
    protected int x;
    protected int y;

    public Shape() {
        this(0,0);
    }

    public Shape (int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void display()  {
        System.out.printf("x=%d, y=%d",x,y);
    }

    abstract public boolean equals(Shape s);
}

class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle() {
        this(1,1);
    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(int x, int y, int width, int height) {
        super(x,y);
        this.width = width;
        this.height = height;
    }

    public void display() {
        System.out.print("[Rectangle 객체]");
        super.display();
        System.out.printf(", width=%d, height=%d\n",width,height);
    }

    @Override
    public boolean equals(Shape s) {
        Rectangle r = null;
        if (s instanceof Rectangle) {
            r = (Rectangle) s;
            if (r.x == this.x && r.y == this.y && r.width == this.width && r.height == this.height)
                return true;
        }
        return false;
    }
}

class Circle extends Shape {
    private int radius;

    public Circle() {
        radius = 1;
    }

    public Circle(int radius) {
        this.radius = radius;
    }

    public Circle(int x, int y, int radius) {
        super(x,y);
        this.radius = radius;

    }

    public void display() {
        System.out.print("[Circle 객체]");
        super.display();
        System.out.printf(", radius=%d\n",radius);
    }

    public boolean equals(Shape s) {
        Circle c = null;
        if (s instanceof Circle) {
            c = (Circle) s;
            if (c.x == this.x && c.y == this.y && c.radius == this.radius)
                return true;
        }
        return false;
    }
}
