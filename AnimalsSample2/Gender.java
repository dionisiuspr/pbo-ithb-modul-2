enum Gender {

    MALE(0),
    FEMALE(1);

    private int value;  
    private Gender(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
    
}