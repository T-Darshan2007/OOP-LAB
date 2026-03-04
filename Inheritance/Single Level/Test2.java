class Employee {
    void work() {
        System.out.println("Employee is working");
    }
}

class Manager extends Employee {
    void manage() {
        System.out.println("Manager is managing");
    }
}

class Test2 {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.work();
        m.manage();
    }
}