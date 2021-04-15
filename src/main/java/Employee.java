public class Employee {
    private String fio;
    private String staff;
    private String email;
    private String phone;
    private double salary;
    private int age;
    public HW(String fio,
              String staff,
              String email,
              String phone,
              double salary,
              int age) {
        this.fio = fio;
        this.staff = staff;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
    public String getFio() {
        return fio;
    }
    public void setFio(String fio) {
        this.fio = fio;
    }
    public String getStaff() {
        return staff;
    }
    public void setStaff(String staff) {
        this.staff = staff;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void printInfo() {
        System.out.println(" ФИО: " + fio + "Должность: " + staff + ", e-mail: " + email + ", Телефон: " + phone + ", возраст: " + age + ", Зарплата: " + salary);
    }
}
