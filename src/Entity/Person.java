package Entity;

public class Person extends EnityName {

    public Person(String name, Mood mood) {
        super(name, mood);

    }


    @Override
    public void sayYourName() {
        System.out.println(this.getName());
    }
}
