interface Sports {
    void sportsGrade();
}

class Student {
    void study() {
        System.out.println("Student is studying");
    }
}

class SchoolStudent extends Student implements Sports {
    public void sportsGrade() {
        System.out.println("Sports grade: A");
    }
}

class Test8 {
    public static void main(String[] args) {
        SchoolStudent s = new SchoolStudent();
        s.study();
        s.sportsGrade();
    }
}