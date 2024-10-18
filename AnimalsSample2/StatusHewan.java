enum StatusHewan {
    
    DEAD(0),
    ALIVE(1);

    private int value;  
    private StatusHewan(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

}
