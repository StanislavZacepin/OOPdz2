import Entity.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

        List<Person> personList = Arrays.asList(ivan,ira,dima,vadik);
        List<Cats> catsList = Arrays.asList(barsic,vaska,tom,mursik);

        for (Person person : personList) {
            person.sayYourName();
        }
        for (Cats cats : catsList) {
            cats.sayYourName();
        }

        for (Person person : personList) {
            for (Cats cats : catsList) {
                CreateVois.Create(person,cats);
            }
        }
        for (Person person : personList) {
            for (Cats cats : catsList) {
                Bind.bind(person,cats);
            }
        }



    }
}
