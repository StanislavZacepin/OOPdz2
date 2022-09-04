package Entity;

public class Cats extends EnityName {

    public Cats(String name , Mood mood) {
        super(name);
        this.mood = mood;
    }
    public Mood mood;
}
