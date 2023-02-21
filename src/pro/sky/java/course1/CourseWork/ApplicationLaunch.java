package pro.sky.java.course1.CourseWork;

public class ApplicationLaunch {
    static Employee[] employees = new Employee[10];
    public static void main(String[] args) {
        fillBase();
        printAll();
        System.out.println("Сумма зарплат: " + sumSalary());
        findMinSalary();
        findMaxSalary();
        findAverageSalary();
        printFullName();
    }
    private static void fillBase () {
        employees[0] = new Employee("Ivanov", "Ivan", "Ivanovich", 5, 10000);
        employees[1] = new Employee("Petrov", "Petr", "Petrovich", 3, 34734);
        employees[2] = new Employee("Sidorov", "Sidor", "Sidorovich", 1, 45833);
        employees[3] = new Employee("Shevnin", "Sergey", "Ivanovich", 4, 49321);
        employees[4] = new Employee("Nesterova", "Olga", "Nikolaevna", 2, 72882);
        employees[5] = new Employee("Isupova", "Ekaterina", "Olegovna", 3, 38932);
        employees[6] = new Employee("Zhdanova", "Olga", "Igorevna", 4, 24942);
        employees[7] = new Employee("Luginina", "Ann", "Andeevna", 3, 98352);
        employees[8] = new Employee("Simakov", "Vladimir", "Ivanovich", 2, 195935);
        employees[9] = new Employee("Degtyarev", "Ivan", "Michailovich", 5, 632858);
    }
    private static void printAll() {
        for (Employee employee: employees) {
            System.out.println(employee);
        }
    }
    private static double sumSalary() {
        double sum = 0;
        for (Employee employee : employees) {
            sum = sum + employee.getSalary();
        }
        return sum;
    }
    private static void findMinSalary () {
        Employee empMinSalary = null;
        for (Employee employee : employees) {
            if (empMinSalary == null || (empMinSalary.getSalary() < employee.getSalary())) {
                empMinSalary = employee;
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой: " + empMinSalary);
    }
    private static void findMaxSalary () {
        Employee empMaxSalary = null;
        for (Employee employee : employees) {
            if (empMaxSalary == null || (empMaxSalary.getSalary() > employee.getSalary())) {
                empMaxSalary= employee;
            }
        }
        System.out.println("Сотрудник с максимальной зарплатой: " + empMaxSalary);
    }
    private static void findAverageSalary () {
        var average = sumSalary()/ employees.length;
        System.out.println("Средняя зарплата сотрудников составляет: " + average);
    }
    private static void printFullName () {
        for (Employee employee : employees) {
            System.out.println(employee.getLastName() + " " + employee.getFirstName() + " " + employee.getMiddleName());
        }
    }
}
