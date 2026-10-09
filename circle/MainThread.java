package circle;
public class MainThread {
    public static void main(String[] args) {
        Circle circle = new Circle(5.5);
        System.out.println("Ban Kinh :" + circle.getRadius());
        System.out.println("Dien tich :" + circle.getArea());
        System.out.println("Chu vi :" + circle.getPerimeter() );
    }
}
