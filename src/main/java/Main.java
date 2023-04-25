import classes.Employeer;
import DAO.EmployeerDAO;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        while (true) {
            System.out.println("Что вы хотите сделать? \n 1-Добавить | 2- Рекадтировать | 3 - Удалить сторудника");

            switch (scanner.nextInt()) {
                case 1:
                    Employeer employeer1 = new Employeer();
                    System.out.println("===========Режим добавления сотрудника: =============\n");
                    System.out.println("Введите Фамилию сотрудника");
                    scanner.nextLine();
                    employeer1.setLastName(scanner.nextLine());
                    System.out.println("Введите Имя сотрудника");
                    employeer1.setFirstName(scanner.nextLine());
                    System.out.println("Введите Отчество сотрудника");
                    employeer1.setMiddleName(scanner.nextLine());
                    System.out.println("Введите Должность сотрудника");
                    employeer1.setPosition(scanner.nextLine());
                    System.out.println("Введите Отдел сотрудника");
                    employeer1.setDepartment(scanner.nextLine());
                    System.out.println("Введите Зарплату сотрудника (тысяч рублей)");
                    employeer1.setSalary(scanner.nextInt());
                    EmployeerDAO employeerDAO = new EmployeerDAO();
                    employeerDAO.addEmployeer(employeer1);
                    System.out.println("Сотрудник добавлен");
                    break;
                case 2:
                    Employeer employeer2 = new Employeer();
                    System.out.println("===========Режим редактирования сотрудника: =============\n");
                    System.out.println("Введите id сотрудника");
                    Long id = scanner.nextLong();
                    System.out.println("Введите Фамилию сотрудника");
                    scanner.nextLine();
                    employeer2.setLastName(scanner.nextLine());
                    System.out.println("Введите Имя сотрудника");
                    employeer2.setFirstName(scanner.nextLine());
                    System.out.println("Введите Отчество сотрудника");
                    employeer2.setMiddleName(scanner.nextLine());
                    System.out.println("Введите Должность сотрудника");
                    employeer2.setPosition(scanner.nextLine());
                    System.out.println("Введите Отдел сотрудника");
                    employeer2.setDepartment(scanner.nextLine());
                    System.out.println("Введите Зарплату сотрудника (тысяч рублей)");
                    employeer2.setSalary(scanner.nextInt());
                    EmployeerDAO employeerDAOConfigure = new EmployeerDAO();
                    employeerDAOConfigure.configurateEmployeer(id, employeer2);
                    break;
                case 3:
                    System.out.println("===========Режим удаления сотрудника: =============\n");
                    System.out.println("Укажите id сотрудника которого нужно удалить из Бд");
                    Long idDelete =  scanner.nextLong();
                    EmployeerDAO employeerDAOdelete = new EmployeerDAO();
                    employeerDAOdelete.deleteEmployeer(idDelete);
                    System.out.println("Сотрудник под id: " + idDelete +" был успешно удалён");
                    break;
                default:
                    System.out.println("Неверная команда");
                    break;
            }
            input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
        }
    }
}
