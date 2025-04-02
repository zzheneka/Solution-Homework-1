package image;

public class RealImage implements Image {
    private String filename;

    public RealImage(String filename) {
        this.filename = filename;
        loadFromDisk();
    }

    private void loadFromDisk() {
        System.out.println("Загрузка изображения: " + filename + " (высокое разрешение)");
        try {
            Thread.sleep(1000); // эмуляция долгой загрузки
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void display() {
        System.out.println("Показ изображения: " + filename);
    }
}
