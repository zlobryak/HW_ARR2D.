import java.util.Random;
import java.util.Scanner;

public class DATA {
    public static final int SIZE =8;
    static int[][] colors = new int[SIZE][SIZE];
//Заполняет таблицу случайными значениями
    public static void createTable(){
        Random random = new Random();
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                // для случайных значений воспользуемся готовым решением из библиотеки java.util.Random
                colors[i][j] = random.nextInt(256);
            }
        }
        printTable();
    }

    public  static void createTestTable(){
        colors[0][0] = 1;
        colors[0][3] = 88;
        colors[0][7] = 2;
        colors[7][7] = 3;
        colors[7][0] = 4;
        printTable();
    }


  public static void printTable(){
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
  public static String userInput(){
      System.out.println("Выберите угол поворота - 90,180 или 270:");
      Scanner scanner = new Scanner(System.in);

      return scanner.nextLine();

  }

}
