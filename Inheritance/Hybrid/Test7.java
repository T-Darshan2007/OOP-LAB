interface Printable {
    void print();
}

class Student {
    void display() {
        System.out.println("Displaying student details");
    }
}

class Result extends Student implements Printable {
    public void print() {
        System.out.println("Printing result");
    }
}

class Test7 {
    public static void main(String[] args) {
        Result r = new Result();
        r.display();
        r.print();
    }
}