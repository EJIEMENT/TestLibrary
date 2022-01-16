package testApi;

import business.AuthorBO;
import io.restassured.response.Response;
import model.Author;
import model.AuthorName;
import model.Birth;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LibraryTest {
    AuthorBO authorBO = new AuthorBO();

    @Test
    public void getAllAuthors() {
        Response response = authorBO.getAllAuthors();
        Assert.assertEquals(response.getStatusCode(), 200);
    }

    @Test
    public void createNewAuthor() {
        Author author = new Author("Ukraine", 1, "TestAuthor", new AuthorName("Oleksii", "Konontsev"), new Birth("1973-03-28", "Ukraine", "Lviv"));
        Response response = authorBO.postNewAuthor(author);
        Assert.assertEquals(response.getStatusCode(), 201);
        authorBO.deleteAuthor(1);
    }

    @Test
    public void deleteAuthor() {
        Author author = new Author("Ukraine", 2, "TestAuthor", new AuthorName("Oleksii", "Konontsev"), new Birth("1973-03-28", "Ukraine", "Lviv"));
        authorBO.postNewAuthor(author);
        Response response = authorBO.deleteAuthor(2);
        Assert.assertEquals(response.getStatusCode(), 204);
    }

    @Test
    public void updateAuthor() {
        Author author = new Author("Ukraine", 3, "TestAuthor", new AuthorName("Oleksii", "Konontsev"), new Birth("1973-03-28", "Ukraine", "Lviv"));
        authorBO.postNewAuthor(author);
        Author updateAuthor = new Author("Italy", 3, "TestAuthor", new AuthorName("Oleksii", "Konontsev"), new Birth("1973-03-28", "Ukraine", "Lviv"));
        Response response = authorBO.updateAuthor(updateAuthor);
        Assert.assertEquals(response.getStatusCode(), 200);
        authorBO.deleteAuthor(3);
    }
}
