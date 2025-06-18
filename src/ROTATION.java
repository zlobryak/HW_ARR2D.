public class Rotation {
    static int[][] rotatedColors = new int[DATA.SIZE][DATA.SIZE];
}
    public static Rotate(){

        for (int i = DATA.SIZE - 1; i  > -1; i--) {
            for (int j = DATA.SIZE -1; j > -1; j--) {
                rotatedColors[i][j] = DATA.colors[DATA.SIZE - 1 - j][i];
            }
    }
}
