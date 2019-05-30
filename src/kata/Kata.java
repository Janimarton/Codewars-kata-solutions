package kata;

public abstract class Kata {

    protected String kataLink;

    public Kata(String kataLink) {
        this.kataLink = kataLink;
    }

    public String getKataLink() {
        return kataLink;
    }

    public void setKataLink(String kataLink) {
        this.kataLink = kataLink;
    }
}
