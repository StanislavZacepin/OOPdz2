package Action;

import Entity.Cats;
import Entity.Mood;
import Entity.Person;

public class Call {
    public void reaction(Person hum, Cats cat){
        if(cat.mood == Mood.love)
            System.out.println(cat + " Мурлыкает и подходит");
        if(cat.mood == Mood.aggressive)
            System.out.println(cat + " Бросаеться на ноги");
        if(cat.mood == Mood.hate)
            System.out.println(cat + " Шыпит и убегает");
        if(cat.mood == Mood.nonMoral)
            System.out.println(cat + " Игнорирует");
        if(hum.mood == Mood.love)
            System.out.println(hum + " Всё равно пытаеться погладить");
        if(hum.mood == Mood.aggressive)
            System.out.println(hum + " Кидает тапком");
        if(hum.mood == Mood.hate)
            System.out.println(hum + " Говорит: Брысь");
        if(hum.mood == Mood.nonMoral)
            System.out.println(hum + " Забил пошёл к холодельнику");
    }
}
