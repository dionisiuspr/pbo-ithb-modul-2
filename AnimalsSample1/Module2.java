package Animals;

public class Module2 {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Chloe", "Royal Canin", 2, Status.ALIVE, Gender.FEMALE);
        Dog dog2 = new Dog("Max", "Pedigree", 4, Status.ALIVE, Gender.MALE);
        Dog dog3 = new Dog("Bella", "Purina", 3, Status.ALIVE, Gender.FEMALE);
        Dog dog4 = new Dog("Rocky", "Nutro", 5, Status.DEAD, Gender.MALE);
        Dog dog5 = new Dog("Molly", "Blue Buffalo", 6, Status.ALIVE, Gender.FEMALE);

        Cat cat1 = new Cat("Gemi", "Whiskas", 1, Status.ALIVE, Gender.FEMALE);
        Cat cat2 = new Cat("Milo", "Meow Mix", 2, Status.ALIVE, Gender.MALE);
        Cat cat3 = new Cat("Luna", "Iams", 3, Status.ALIVE, Gender.FEMALE);
        Cat cat4 = new Cat("Oliver", "Friskies", 4, Status.DEAD, Gender.MALE);
        Cat cat5 = new Cat("Simba", "Sheba", 5, Status.ALIVE, Gender.MALE);

        Duck duck1 = new Duck("Cimi", "Corn", 3, Status.DEAD, Gender.MALE);
        Duck duck2 = new Duck("Donald", "Grains", 4, Status.ALIVE, Gender.MALE);
        Duck duck3 = new Duck("Daisy", "Oats", 2, Status.ALIVE, Gender.FEMALE);
        Duck duck4 = new Duck("Howard", "Barley", 3, Status.DEAD, Gender.MALE);
        Duck duck5 = new Duck("Huey", "Wheat", 1, Status.ALIVE, Gender.MALE);

        Horse horse1 = new Horse("Thunder", "Rice", 2, Status.DEAD, Gender.MALE);
        Horse horse2 = new Horse("Spirit", "Alfalfa", 5, Status.ALIVE, Gender.MALE);
        Horse horse3 = new Horse("Bella", "Grass", 3, Status.ALIVE, Gender.FEMALE);
        Horse horse4 = new Horse("Shadow", "Oats", 4, Status.DEAD, Gender.MALE);
        Horse horse5 = new Horse("Star", "Barley", 2, Status.ALIVE, Gender.FEMALE);

        System.out.println(dog1.printData());
        System.out.println(dog1.printSound());
        System.out.println(dog1.isAlive());
        dog1.setName("GANTI NAMA");
        dog1.setFood("Gausa makan");
        System.out.println(dog1.printData());
    }

}
