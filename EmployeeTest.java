public class EmployeeTest {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[1] = new Employee(
                fio: "Bogorodova Vera",
                staff: "driver",
                email: "bogorodova@mail.ru",
                phone: "9438483088",
                age: 26,
                salary: 52000
    );
        employees[2] = new Employee(
                fio: "Krylatov Konstantin",
                staff: "teacher",
                email: "krylo@mail.ru",
                phone: "353453",
                age: 35,
                salary: 45000
    );
        employees[3] = new Employee(
                fio: "Nazarova Marina",
                staff: "actor",
                email: "nazarova@mail.ru",
                phone: "84656655",
                age: 42,
                salary: 15000
    );
        employees[4] = new Employee(
                fio: "Altunina Nadezda",
                staff: "doctor",
                email: "Altunina@mail.ru",
                phone: "8181545945",
                age: 34,
                salary: 40000
    );
        employees[5] = new Employee(
                fio: "Kirillov Kirill",
                staff: "pilot",
                email: "kirillov@mail.ru",
                phone: "854854486",
                age: 24,
                salary: 120000
    );
        for (Employee employee : employees) {
            if (employee.getAge() > 40 ){
                employee.printInfo();
            }
        }
    }
}
