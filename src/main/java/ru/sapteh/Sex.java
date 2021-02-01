package ru.sapteh;

public class Sex {
    public static final Sex MALE = new Sex("male");
    public static final Sex FEMALE = new Sex("female");

    private String seh;
    public Sex(String s){
        this.seh = s;
    }

    @Override
    public String toString() {
        return seh;
    }
}
