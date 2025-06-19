
public class Main {
    public static void main(String[] args) {
//        DATA.createTestTable();
        Data table = new Data();
        table.createTable();

        switch (table.userInput()) {
            case "90":
                new Rotation().rotateTable90(table);
                break;

            case "180":
                new Rotation().rotateTable180(table);
                break;

            case "270":
                new Rotation().rotateTable270(table);
                break;
            default:
                System.out.println("Не умею поворачивать на такой угол");
        }
    }
}