

public enum Value {
    
    ACE,
    TWO (2),
    THREE (3),
    FOUR (4),
    FIVE (5),
    SIX (6),
    SEVEN (7),
    EIGHT (8),
    NINE (9),
    TEN (10),
    JACK (10),
    QUEEN (10),
    KING (10);
    
    protected final int numValue;
    
    Value(int numValue) {
        this.numValue = numValue;
    }
    
    public static Value randomValue() {
        return
    }
    
    
    public int getNumValue() {
        return numValue;
    }
}
