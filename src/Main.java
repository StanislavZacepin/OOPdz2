import Entity.Cats;
import Entity.Mood;
import Entity.Person;

public class Main {
    public static void main(String[] args) {

        Person ivan = new Person("Ivan", Mood.love);
        Person ira = new Person("Ira", Mood.nonMoral);
        Person dima = new Person("Dima", Mood.hate);
        Person vadik = new Person("Vadik", Mood.aggressive);

        Cats barsic = new Cats("barsic", Mood.love);
        Cats vaska = new Cats("vaska", Mood.nonMoral);
        Cats tom = new Cats("tom", Mood.hate);
        Cats mursik = new Cats("mursik", Mood.aggressive);

        ivan.relationships(ivan,barsic);
        ivan.relationships(ira,vaska);
        ivan.relationships(dima,tom);
        ivan.relationships(vadik,mursik);

        ivan.bind(ivan,barsic);
        ivan.bind(ira,vaska);
        ivan.bind(dima,tom);
        ivan.bind(vadik,mursik);
    }
}
