import image.Image;
import image.RealImage;
import image.ProxyImage;
import image.ProtectedImageProxy;
import image.User;
import map.MapMarker;
import map.MarkerFactory;


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
        User agentAlina = new User("agent_alina", true);
        Image img3 = new ProtectedImageProxy("cottage-north.jpg", agentAlina);

        System.out.println("\n[Попытка другого агента]");
        img3.display();


        Image img1 = new ProtectedImageProxy("penthouse.jpg", guest);
        Image img2 = new ProtectedImageProxy("penthouse.jpg", agent);

        System.out.println("\n[Попытка неавторизованного пользователя]");
        img1.display();

        System.out.println("\n[Попытка авторизованного агента]");
        img2.display();

        System.out.println("\n== Flyweight Pattern: маркеры на карте ==");

        MapMarker[] markers = new MapMarker[] {
                new MapMarker(51.12, 71.45, "Astana Hospital", "hospital"),
                new MapMarker(51.10, 71.42, "Samurai Sushi", "restaurant"),
                new MapMarker(51.13, 71.48, "Gas Central", "gas"),
                new MapMarker(51.14, 71.47, "KFC", "restaurant"),
                new MapMarker(51.16, 71.49, "Shell Station", "gas"),
                new MapMarker(51.11, 71.41, "City Clinic", "hospital")
        };

        for (MapMarker marker : markers) {
            marker.render();
        }

        System.out.println("Общее количество уникальных стилей: " + MarkerFactory.getUniqueStyleCount());
    }
}

//Гость не может загрузить изображение
//- Агент — может
//- Миниатюры показываются сразу, оригиналы только по клику
// RealImage— еальный объект изображения
//ProxyImage отображает миниатюру и загружает оригинал только при необходимости
//ProtectedImageProxy защищённый прокси, разрешает доступ только авторизованным агентам
//*User объект пользователя, указывает, является ли он агентом