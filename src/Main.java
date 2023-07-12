import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        StringBuilder log = new StringBuilder();

        File src = new File("src");
        if (src.mkdir() || src.exists()) {
            log.append(src.getName() + " создан успешно" + "\n");
        } else {
            log.append(src.getName() + " создать не удалось" + "\n");
        }

        File main = new File(src, "main");
        if (main.mkdir() || main.exists()) {
            log.append(main.getName() + " создан успешно" + "\n");
        } else {
            log.append(main.getName() + " создать не удалось" + "\n");
        }

        File test = new File(src, "test");
        if (test.mkdir() || test.exists()) {
            log.append(test.getName() + " создан успешно" + "\n");
        } else {
            log.append(test.getName() + " создать не удалось" + "\n");
        }


        File res = new File("res");
        if (res.mkdir() || res.exists()) {
            log.append(res.getName() + " создан успешно" + "\n");
        } else {
            log.append(res.getName() + " создать не удалось" + "\n");
        }

        File savegames = new File("savegames");
        if (savegames.mkdir() || savegames.exists()) {
            log.append(savegames.getName() + " создан успешно" + "\n");
        } else {
            log.append(savegames.getName() + " создать не удалось" + "\n");
        }

        File temp = new File("temp");
        if (temp.mkdir() || temp.exists()) {
            log.append(temp.getName() + " создан успешно" + "\n");
        } else {
            log.append(temp.getName() + " создать не удалось" + "\n");
        }

        File mainFile = new File("src/main/Main.java");
        try {
            if (mainFile.createNewFile() || mainFile.exists()) {
                log.append(mainFile.getName() + " создан успешно" + "\n");
            } else {
                log.append(mainFile.getName() + " создать не удалось" + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        File util = new File("src/main/Utils.java");
        try {
            if (util.createNewFile() || util.exists()) {
                log.append(util.getName() + " создан успешно" + "\n");
            } else {
                log.append(util.getName() + " создать не удалось" + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        File drawables = new File(res, "drawables");
        if (drawables.mkdir() || drawables.exists()) {
            log.append(drawables.getName() + " создан успешно" + "\n");
        } else {
            log.append(drawables.getName() + " создать не удалось" + "\n");
        }

        File vectors = new File(res, "vectors");
        if (vectors.mkdir() || vectors.exists()) {
            log.append(vectors.getName() + " создан успешно" + "\n");
        } else {
            log.append(vectors.getName() + " создать не удалось" + "\n");
        }

        File icons = new File(res, "icons");
        if (icons.mkdir() || icons.exists()) {
            log.append(icons.getName() + " создан успешно" + "\n");
        } else {
            log.append(icons.getName() + " создать не удалось" + "\n");
        }

        File tempFile = new File("temp/temp.txt");
        try {
            if (tempFile.createNewFile() || tempFile.exists()) {
                log.append(tempFile.getName() + " создан успешно" + "\n");
            } else {
                log.append(tempFile.getName() + " создать не удалось" + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        FileWriter fileWriter = new FileWriter(tempFile);
        fileWriter.write(String.valueOf(log));
        fileWriter.close();

        System.out.println("Лог создания файлов сохранен в temp.txt");

    }
}