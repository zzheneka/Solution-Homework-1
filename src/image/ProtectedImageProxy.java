package image;

public class ProtectedImageProxy implements Image {
    private RealImage realImage;
    private final String filename;
    private final User user;

    public ProtectedImageProxy(String filename, User user) {
        this.filename = filename;
        this.user = user;
        System.out.println("Создан прокси с защитой для файла: " + filename);
    }

    @Override
    public void display() {
        if (!user.isAgent()) {
            System.out.println(" Доступ запрещён: пользователь " + user.getUsername() + " не является агентом.");
            return;
        }

        if (realImage == null) {
            System.out.println("Доступ разрешён.Загрузка изображения...");
            realImage = new RealImage(filename);
        } else {
            System.out.println("Доступ разрешён.Показываем уже загруженное изображение.");
        }

        realImage.display();
    }
}
