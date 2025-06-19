
public class Main {
    public static void main(String[] args) {
//        DATA.createTestTable();
        DATA.createTable();

        switch (DATA.userInput()) {
            case "90":
                Rotation.rotateTable90();
                break;

            case "180":
                Rotation.rotateTable180();
                break;

            case "270":
                Rotation.rotateTable270();
                break;
        }
    }
}