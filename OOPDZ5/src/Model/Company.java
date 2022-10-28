package Model;

import View.View;

import java.util.ArrayList;


public class Company {
    private String name;
    private String address;
    private ArrayList<Worker> workers;
    public Owner owner;
    public HRD hrd;

    public Company(String name, String address, People owner) {
        this.name = name;
        this.address = address;
        this.workers = new ArrayList<>();
        this.owner = new Owner(owner.getName(), owner.getAge());
        this.hrd = new HRD();
        this.hrd.loadCandidate();

    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public Owner getOwner() {
        return owner;
    }

    public ArrayList<Worker> getWorkers() {
        return workers;
    }



    public static void addWorker(Company company){
        if (company.hrd.getCandidates().size() < 1){
            System.out.println("Кандидатов на работу нет");
        }
        else {
            View.showCandidates(company);
            int id = View.inputInt("Введите ID кандидата: ");
            String post = View.inputString("Введите желаемую должность: ");
            Integer sallary = View.inputInt("Введите желаемую зарплату: ");
            company.hiring(company.hrd.getCandidates().get(id-1) ,post,sallary);



        }
    }
    protected void hiring(People people, String post, int salary) {
        Worker worker = new Worker(people.getName(), people.getAge(), post, salary);
        this.workers.add(worker);
    }

    public static void removeWorker(Company company){
        String name = View.inputString("Введите имя работника: ");
        company.fire(name);
    }
    public void fire(String name) {
        for (Worker worker : this.workers) {
            System.out.println(worker.getName());
            System.out.println(name);
            if (worker.getName().equals(name)) {
                System.out.println("Зашел");
                this.workers.remove(worker);
            }
        }
    }

    public void showWorkers() {
        for (Worker worker : this.workers) {
            System.out.println(worker);
        }
    }

    @Override
    public String toString() {
        return String.format("Название: %s\nАдресс: %s\nВладелец: %s\nКолличество сотрудников: %d", this.name, this.address, this.owner.getName(), workers.size());
    }
}