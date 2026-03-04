class Grandfather {
    void property() {
        System.out.println("Grandfather property");
    }
}

class Father extends Grandfather {
    void house() {
        System.out.println("Father's house");
    }
}

class Son extends Father {
    void car() {
        System.out.println("Son's car");
    }
}

class Test4 {
    public static void main(String[] args) {
        Son s = new Son();
        s.property();
        s.house();
        s.car();
    }
}