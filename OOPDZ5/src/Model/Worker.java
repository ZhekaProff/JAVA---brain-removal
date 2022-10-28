package Model;

public class Worker extends People{
    private String post;
    private int salary;

    public Worker(String name, int age, String post, int salary) {
        super(name, age);
        this.post = post;
        this.salary = salary;
    }
    public Worker(String name, int age){
        super(name, age);

    }


    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return String.format("Имя: %s, Возвраст: %d, Должность: %s, Зарплата: %d", this.getName(),this.getAge(), this.post,this.salary);
    }
}