package Entity;

public interface Communication {

    default void relationships(Cats cats, Person person) {
        if (person.getMood() == Mood.love) {
            person.setVois("Кс-кс-кс, маленький компок шерсти");
        }
        if (person.getMood() == Mood.hate) {
            person.setVois("Брысь с глаз моих");
        }
        if (person.getMood() == Mood.aggressive) {
            person.setVois("брысь <<Кидает тапком>>");
        }
        if (person.getMood() == Mood.nonMoral) {
            person.setVois("игнор");
        }

        if (cats.getMood() == Mood.love) {
            cats.setVois("мур-мур-мур");
        }
        if (cats.getMood() == Mood.hate) {
            cats.setVois("шшшш(шипит)");
        }
        if (cats.getMood() == Mood.aggressive) {
            cats.setVois("Бросаеться с когтями и шипит");
        }
        if (cats.getMood() == Mood.nonMoral) {
            cats.setVois("игнор");
        }


    }


    boolean creatRelationships(EnityName entity);

    default void bind(EnityName entity) {
        boolean flag = creatRelationships(entity);
        if (flag) {
            System.out.println("Хорошие взаиотношения");
        } else {
            System.out.println("Отношения так себе");
        }
    }
}

