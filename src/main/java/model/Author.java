package model;

public class Author {
    private String nationality;
    private Integer authorId;
    private String authorDescription;
    private AuthorName authorName;
    private Birth birth;

    public Author(String nationality, Integer authorId, String authorDescription, AuthorName authorName, Birth birth) {
        this.nationality = nationality;
        this.authorId = authorId;
        this.authorDescription = authorDescription;
        this.authorName = authorName;
        this.birth = birth;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public Integer getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }

    public String getAuthorDescription() {
        return authorDescription;
    }

    public void setAuthorDescription(String authorDescription) {
        this.authorDescription = authorDescription;
    }

    public AuthorName getAuthorName() {
        return authorName;
    }

    public void setAuthorName(AuthorName authorName) {
        this.authorName = authorName;
    }

    public Birth getBirth() {
        return birth;
    }

    public void setBirth(Birth birth) {
        this.birth = birth;
    }

    public Author() {
    }

}
