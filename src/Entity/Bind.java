package Entity;

public class Bind {
    public static void bind(Person person,Cats cats) {
        boolean flag = creatRelationships(person,cats);
        if (flag) {
            System.out.println("Хорошие взаиотношения");
        } else {
            System.out.println("Отношения так себе");
        }
    }
    public static boolean creatRelationships(Person person, Cats cats) {
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
