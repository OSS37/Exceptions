public class Main {
    public static void main(String[] args) {
        printInput("_4L5hdeFGDVf48dgF7u_", "4568pL", "4568pL");
    }

    public static void printInput(String login, String password, String confirmPassword) {
        InputData inputData = new InputData(login, password, confirmPassword);
        System.out.println("Login: " + login + "," +
                "\nPassword: " + password + ", " +
                "\nConfirm Password: " + confirmPassword);
        inputData.checkInputData();

    }
}