import java.util.Random;
import java.util.Scanner;

public class Data {

    public static final int SIZE = 8;
    int[][] colors = new int[SIZE][SIZE];

    public Data() {
        createTable();
    }

    //Заполняет таблицу случайными значениями
    public void createTable() {
        Random random = new Random();
        for (int i = 0; i < SIZE; i++) {
            // для случайных значений воспользуемся готовым решением из библиотеки java.util.Random
            for (int j = 0; j < SIZE; j++) colors[i][j] = random.nextInt(256);
        }
        printTable();
    }

    public void printTable() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                // %4d означает, что мы под каждый номер резервируем 4 знака
                // (незанятые будут заполнены пробелами)
                // таким образом, у нас получится ровная таблица
                System.out.format("%4d", colors[i][j]);
            }
            // Переход на следующую строку
            System.out.println();
        }
        System.out.println();
    }

    public String userInput() {
        System.out.println("Выберите угол поворота - 90,180 или 270:");
        Scanner scanner = new Scanner(System.in);

        return scanner.nextLine();

    }

}
