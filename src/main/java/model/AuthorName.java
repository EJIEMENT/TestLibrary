package model;

public class AuthorName {
    private String first;
    private String second;

    public AuthorName() {
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getSecond() {
        return second;
    }

    public void setSecond(String second) {
        this.second = second;
    }

    public AuthorName(String first, String second) {
        this.first = first;
        this.second = second;
    }
}
