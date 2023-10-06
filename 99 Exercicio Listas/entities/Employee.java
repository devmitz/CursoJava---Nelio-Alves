package entities;

public class Employee {
    private String name;
    private Double salary;
    public Integer id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Employee(int id, String name, Double salary) {
        super();
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void increaseSalary(double percentage) {
        this.salary += this.salary * percentage / 100.0;
    }

    @Override
    public String toString(){
        return id + ", " + name + ", " + String.format("%.2f", salary);
    }
}
