package mypack;

public class Rectangle {
	int length;
    int breadth;
    
    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    
    public int Area() {
        return length * breadth;
    }

    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(4, 5);
        Rectangle rect2 = new Rectangle(5, 8);
        
        int area1 = rect1.Area();
        int area2 = rect2.Area();
        
        System.out.println("Area of rectangle 1: " + area1);
        System.out.println("Area of rectangle 2: " + area2);
    }
}


