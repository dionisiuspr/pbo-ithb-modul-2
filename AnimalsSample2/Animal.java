abstract class Animal implements Interface {

    private String name;
    private int age;
    private String food;
    private Gender gender;
    private StatusHewan status;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public StatusHewan getStatus() {
        return status;
    }

    public void setStatus(StatusHewan status) {
        this.status = status;
    }

    @Override
    public void printSound() {
    }

    @Override
    public void printData() {
        System.out.println("Type : " + this.getClass().getName());
        System.out.println("Name : " + this.name);
        System.out.println("Age : " + this.age);
        System.out.println("Food : " + this.food);
        System.out.println("Gender " + this.gender);
        System.out.println("Status : " + this.status);
    }

    public String isAlive() {

        String msg = "";

        switch (this.status) {
            case ALIVE:

                msg = "This animal is still alive!";

                break;

            case DEAD:

                msg = "This animal already dead!";

                break;

        }

        return msg;

    }

}
