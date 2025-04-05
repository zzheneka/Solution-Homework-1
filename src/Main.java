import image.Image;
import image.RealImage;
import image.ProxyImage;


public class Main {
    public static void main(String[] args) {
        System.out.println("== Страница объекта недвижимости ==");

        Image preview1 = new ProxyImage("villa-south.jpg");
        Image preview2 = new ProxyImage("loft-center.jpg");

        // эмуляция миниатюр
        System.out.println("\n[Миниатюры загружены]");
        System.out.println("Показ миниатюры: villa-south.jpg");
        System.out.println("Показ миниатюры: loft-center.jpg");

        // пользователь кликает на первое изображение
        System.out.println("\n[Пользователь нажал на первую миниатюру]");
        preview1.display();

        // повторный клик — изображение уже в кэше
        System.out.println("\n[Повторный клик на ту же картинку]");
        preview1.display();

        // клик на вторую
        System.out.println("\n[Клик по второму объекту]");
        preview2.display();
    }
}
