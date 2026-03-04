class Person {
    Person() {
        System.out.println("Person constructor called");
    }
}

class Student extends Person {
    Student() {
        System.out.println("Student constructor called");
    }
}

class Test2 {
    public static void main(String[] args) {
        Student s = new Student();
    }
}