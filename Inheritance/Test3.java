class Bank {
    void rateOfInterest() {
        System.out.println("Bank interest rate is 5%");
    }
}

class SBI extends Bank {
    void rateOfInterest() {
        System.out.println("SBI interest rate is 7%");
    }
}

class Test3 {
    public static void main(String[] args) {
        SBI obj = new SBI();
        obj.rateOfInterest();
    }
}