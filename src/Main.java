import image.Image;
import image.RealImage;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start");

        Image image1 = new RealImage("house1.jpg");
        image1.display();

        Image image2 = new RealImage("house2.jpg");
        image2.display();
    }
}
