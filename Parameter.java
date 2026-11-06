class Dog {
    String name;
    Dog(String name) { this.name = name; }
}

class PassingExample {
    
    public static void modifyValues(int number, Dog myDog) {
        number = 50;           
        myDog.name = "Max";    
    }

    public static void main(String[] args) {
        int x = 10;
        Dog dog = new Dog("Buddy");

        modifyValues(x, dog);

        System.out.println("Primitive x after method: " + x);   
        System.out.println("Object dog name after method: " + dog.name);
    }
}
