import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    private static StringBuilder log = new StringBuilder();
    private static ArrayList<String> fileList = new ArrayList<>();

    public static void main(String[] args) throws IOException {

        createFolder("src");
        createFolder("src/main");
        createFolder("src/test");
        createFolder("res");
        createFolder("savegames");
        createFolder("temp");
        createFile("src/main/Main.java");
        createFile("src/main/Utils.java");
        createFolder("res/drawables");
        createFolder("res/vectors");
        createFolder("res/icons");
        createFile("temp/temp.txt");

        FileWriter fileWriter = new FileWriter("temp/temp.txt");
        fileWriter.write(String.valueOf(log));
        fileWriter.close();

        System.out.println("Лог создания файлов сохранен в temp.txt");

    }

    public static void createFolder(String path) {
        File folder = new File(path);
        if (!folder.exists()) {
            if (folder.mkdir()) {
                log.append("Создана папка: ").append(path).append("\n");
            } else {
                log.append("Не удалось создать папку: ").append(path).append("\n");
            }
        } else {
            log.append("Папка уже существует: ").append(path).append("\n");
        }
    }

    public static void createFile(String path) {
        File file = new File(path);
        try {
            if (!file.exists()) {
                if (file.createNewFile()) {
                    fileList.add(path);
                    log.append("Создан файл: ").append(path).append("\n");
                } else {
                    log.append("Не удалось создать файл: ").append(path).append("\n");
                }
            } else {
                log.append("Файл уже существует: ").append(path).append("\n");
            }
        } catch (IOException e) {
            log.append("Ошибка при создании файла: ").append(path).append("\n");
            e.printStackTrace();
        }
    }
}