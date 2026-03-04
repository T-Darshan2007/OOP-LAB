class Shape {
    void draw() {
        System.out.println("Drawing Shape");
    }
}

class Circle extends Shape {
    void draw() {
        super.draw();
        System.out.println("Drawing Circle");
    }
}

class Test5 {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.draw();
    }
}