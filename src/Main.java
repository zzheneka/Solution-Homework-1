import image.Image;
import image.RealImage;
import image.ProxyImage;
import image.ProtectedImageProxy;
import image.User;


public class Main {
    public static void main(String[] args) {
        System.out.println("== Страница объекта недвижимости ==");

        Image preview1 = new ProxyImage("villa-south.jpg");
        Image preview2 = new ProxyImage("loft-center.jpg");

        System.out.println("\n[Миниатюры загружены]");
        System.out.println("Показ миниатюры: villa-south.jpg");

        System.out.println("Показ миниатюры: loft-center.jpg");
        System.out.println("\n[Пользователь нажал на первую миниатюру]");
        preview1.display();

        System.out.println("\n[Повторный клик на ту же картинку]");
        preview1.display();



        System.out.println("\n[Клик по второму объекту]");
        preview2.display();
        System.out.println("\n== Доступ с защитным прокси ==");

        User guest = new User("guest123", false);
        User agent = new User("agent007", true);

        Image img1 = new ProtectedImageProxy("penthouse.jpg", guest);
        Image img2 = new ProtectedImageProxy("penthouse.jpg", agent);

        System.out.println("\n[Попытка неавторизованного пользователя]");
        img1.display();

        System.out.println("\n[Попытка авторизованного агента]");
        img2.display();

    }
}
