package Entity;

public class Cats extends EnityName {
    private Mood mood;
    public Cats(String name , Mood mood) {
        super(name,mood);
    }


    @Override
    public void sayYourName() {
        System.out.println(this.getName());
    }
}
