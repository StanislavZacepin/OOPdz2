package Entity;

public class Person extends EnityName {

    public Person(String name, Mood mood) {
        super(name, mood);

    }


    @Override
    public boolean creatRelationships(Person person, Cats cats) {
        if (person.getMood() == Mood.love && cats.getMood() == Mood.love){
            System.out.println(person.getVois());
            System.out.println(cats.getVois());
            return true;
        }
        System.out.println(person.getVois());
        System.out.println(cats.getVois());
        return false;
    }
}
