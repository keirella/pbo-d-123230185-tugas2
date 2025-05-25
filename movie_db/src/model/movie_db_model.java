package model;

public class movie_db_model {
    private int id;
    private String judul;
    private double alur;
    private double penokohan;
    private double akting;
    private double rating;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getJudul() {
        return judul;
    }
    public void setJudul(String judul) {
        this.judul = judul;
    }

    public double getAlur() {
        return alur;
    }
    public void setAlur(double alur) {
        this.alur = alur;
        setRating();
    }

    public double getPenokohan() {
        return penokohan;
    }
    public void setPenokohan(double penokohan) {
        this.penokohan = penokohan;
        setRating();
    }

    public double getAkting() {
        return akting;
    }
    public void setAkting(double akting) {
        this.akting = akting;
        setRating();
    }

    public double getRating() {
        return rating;
    }

    private void setRating() {
        this.rating = (alur + penokohan + akting) / 3.0;
    }
}
