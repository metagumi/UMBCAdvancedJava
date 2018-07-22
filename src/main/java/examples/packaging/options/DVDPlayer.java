package examples.packaging.options;

public class DVDPlayer {
    private String title;
    public void insert(String title) {
        this.title = title;
    }
    public void play() {
        System.out.println(title + " " + " is playing");
    }
}
