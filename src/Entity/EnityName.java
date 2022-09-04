package Entity;

public abstract class EnityName implements Communication {
    private String name;
    private String vois;
    private Mood mood;

    public EnityName(String name,Mood mood) {
        this.name = name;
        this.mood = mood;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVois() {
        return vois;
    }

    public void setVois(String vois) {
        this.vois = vois;
    }

    public Mood getMood() {
        return mood;
    }

    public void setMood(Mood mood) {
        this.mood = mood;
    }
}
