package Animals;

public class Horse extends Animal implements Action {
    public Horse(String name, String food, Integer age, Status status, Gender gender) {
        this.name = name;
        this.food = food;
        this.age = age;
        this.status = status;
        this.gender = gender;
    }

    @Override
    public String printSound() {
        return "HIIII";
    }

    @Override
    public boolean isAlive() {
        return this.status.equals(Status.ALIVE);
    }

    @Override
    public String printData() {
        return ("Type : " + this.getClass().getSimpleName() + "\n " +
                "Name : (" + this.name.getClass().getSimpleName() + ") " + getName() + "\n " +
                "Food : (" + this.food.getClass().getSimpleName() + ") " + getFood() + "\n " +
                "Age : (" + this.age.getClass().getSimpleName() + ") " + getAge() + "\n " +
                "Status : (" + this.status.getClass().getSimpleName() + ") " + getStatus() + "\n " +
                "Gender : (" + this.gender.getClass().getSimpleName() + ") " + getGender() + "\n " +
                "Actions: \n" +
                "printSound(): " + printSound() + "\n" +
                "isAlive(): " + isAlive() + "\n"
        );
    }
}
