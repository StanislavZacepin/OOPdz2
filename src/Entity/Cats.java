package Entity;

public class Cats extends EnityName {
    private Mood mood;
    public Cats(String name , Mood mood) {
        super(name,mood);
    }


    @Override
    public boolean creatRelationships(Person person,Cats cats) {
        return false;
    }
}
