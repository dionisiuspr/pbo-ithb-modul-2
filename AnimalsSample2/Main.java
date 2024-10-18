class Main {
    
    public static void main(String[] args) {
        
        Animal cat = new Cat();
        Animal dog = new Dog();
        Animal duck = new Duck();
        Animal horse = new Horse();

        cat.setName("A");
        cat.setAge(10);
        cat.setFood("Food Type A");
        cat.setGender(Gender.FEMALE);
        cat.setStatus(StatusHewan.ALIVE);

        dog.setName("B");
        dog.setAge(8);
        dog.setFood("Food Type B");
        dog.setGender(Gender.MALE);
        dog.setStatus(StatusHewan.ALIVE);

        duck.setName("C");
        duck.setAge(3);
        duck.setFood("Food Type C");
        duck.setGender(Gender.FEMALE);
        duck.setStatus(StatusHewan.ALIVE);

        horse.setName("D");
        horse.setAge(14);
        horse.setFood("Food Type D");
        horse.setGender(Gender.MALE);
        horse.setStatus(StatusHewan.ALIVE);

        cat.printData();
        dog.printData();
        duck.printData();
        horse.printData();

    }

}
