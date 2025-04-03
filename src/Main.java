import image.Image;
import image.RealImage;
import image.ProxyImage;

public class Main {
    public static void main(String[] args) {
        System.out.println("== Пример с использованием Proxy ==");

        Image thumb1 = new ProxyImage("house1.jpg");
        Image thumb2 = new ProxyImage("house2.jpg");

        System.out.println("-- Отображаем миниатюры (ничего не грузим) --");

        // Покажем полные изображения только по запросу
        System.out.println("\n-- Клик по первому изображению --");
        thumb1.display();

        System.out.println("\n-- Повторный клик по первому изображению --");
        thumb1.display();

        System.out.println("\n-- Клик по второму изображению --");
        thumb2.display();
    }
}
