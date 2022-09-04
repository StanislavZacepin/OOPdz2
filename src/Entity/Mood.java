package Entity;

public enum Mood {
    love("Любит"),
    aggressive("Агресивное"),
    nonMoral("Нетрально"),
    hate("Ненавидет");

    private String title;
    Mood(String title){
        this.title=title;
    }
    @Override
    public String toString() {
        return title;
    }
}
