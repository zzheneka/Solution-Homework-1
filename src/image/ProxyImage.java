package image;

public class ProxyImage implements Image {
    private RealImage loadedImage;
    private final String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
        System.out.println("Создан прокси-объект для файла: " + fileName);
    }

    @Override
    public void display() {
        if (loadedImage == null) {
            System.out.println("Первый вызов — загружаем настоящее изображение...");
            loadedImage = new RealImage(fileName);
        } else {
            System.out.println("Изображение уже загружено, просто показываем.");
        }

        loadedImage.display();
    }
}
