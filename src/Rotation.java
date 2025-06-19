class Rotation {
    int[][] rotatedColors = new int[Data.SIZE][Data.SIZE];
    int shift = Data.SIZE - 1;

    //Поворачивает таблицу га 90
    public void rotateTable90(Data table) {

        for (int i = 0; i < Data.SIZE; i++) {
            for (int j = shift; j > -1; j--) {
                rotatedColors[shift - j][shift - i] = table.colors[i][shift - j];
            }
        }
        printRotatedTable();
    }

    //Поворачивает таблицу на 180
    public void rotateTable180(Data table) {
        for (int i = 0; i < Data.SIZE; i++) {
            for (int j = shift; j > -1; j--) {
                rotatedColors[shift - i][j] = table.colors[i][shift - j];
            }
        }
        printRotatedTable();
    }

    //Поворачивает таблицу на 270
    public void rotateTable270(Data table) {
        for (int i = 0; i < Data.SIZE; i++) {
            for (int j = 0; j < Data.SIZE; j++) {
                rotatedColors[Data.SIZE - 1 - j][i] = table.colors[i][j];
            }
        }
        printRotatedTable();
    }

    //Печатает таблицу в консоль
    public void printRotatedTable() {
//        Отступает от предыдущего вывода на одну строку
        System.out.println();
        for (int i = 0; i < Data.SIZE; i++) {
            for (int j = 0; j < Data.SIZE; j++) {
                // %4d означает, что мы под каждый номер резервируем 4 знака
                // (незанятые будут заполнены пробелами)
                // таким образом, у нас получится ровная таблица
                System.out.format("%4d", rotatedColors[i][j]);
            }
            System.out.println();
        }
    }
}
