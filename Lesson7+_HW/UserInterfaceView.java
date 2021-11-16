package Lesson7_HW;

import java.io.IOException;
import java.util.Scanner;

public class UserInterfaceView {
    private Controller controller = new Controller();

    public void runInterface() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите имя города: ");
            String city = scanner.nextLine();

            System.out.println("Введите 1 для получения погоды на сегодня;" +
                    "Введите 5 для прогноза на 5 дней; Введите 88 для получения данных из базы;  Для выхода введите 0:");

            String command = scanner.nextLine();

            if (command.equals("0")) break;
            if (command != "1" || command != "5" || command != "0" || command != "88") {
                System.out.println("Неа... Введите 1 для получения погоды на сегодня;" +
                        "Введите 5 для прогноза на 5 дней; Введите 88 для получения данных из базы;  Для выхода введите 0:");

                try {
                    controller.getWeather(command, city);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
