class Rotation {
    static int[][] rotatedColors = new int[DATA.SIZE][DATA.SIZE];
    static int shift = DATA.SIZE - 1;
//    TODO Переписать логику всез вращений
//Поворачивает таблицу га 90
    public static void rotateTable90() {

        for (int i = 0; i < DATA.SIZE; i++) {
            for (int j = shift; j > -1; j--) {
                rotatedColors[shift - j][shift - i] = DATA.colors[i][shift - j];
            }
        }
        printRotatedTable();
    }
//Поворачивает тблицу на 180
    public static void rotateTable180(){
        for (int i = 0; i < DATA.SIZE; i++) {
            for (int j = shift; j > - 1; j--) {
                rotatedColors[shift - i][j] = DATA.colors[i][shift - j];
            }
        }
        printRotatedTable();
    }
//Поворачивает таблицу на 270
    public static void rotateTable270(){
        for (int i = 0; i < DATA.SIZE ; i++) {
            for (int j = 0; j < DATA.SIZE; j++) {
                rotatedColors[DATA.SIZE -1 - j][i] = DATA.colors[i][j];
            }
        }
        printRotatedTable();
    }
//Печатает таблицу в консоль
    public static void printRotatedTable() {
//        Отступает от предыдущего вывода на одну строку
        System.out.println();
        for (int i = 0; i < DATA.SIZE; i++) {
            for (int j = 0; j < DATA.SIZE; j++) {
                // %4d означает, что мы под каждый номер резервируем 4 знака
                // (незанятые будут заполнены пробелами)
                // таким образом, у нас получится ровная таблица
                System.out.format("%4d", rotatedColors[i][j]);
            }
            System.out.println();
        }
    }
}
