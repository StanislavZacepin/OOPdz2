package Entity;

public class Person extends EnityName{

    public Person(String name , Mood mood) {
        super(name);
        this.mood = mood;
    }
    public Mood mood;
}
