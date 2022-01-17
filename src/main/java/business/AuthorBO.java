package business;

import core.HttpMethods;
import io.restassured.response.Response;
import jsonParser.JsonParser;
import model.Author;

public class AuthorBO {
    private HttpMethods methods = new HttpMethods();
    
    public Response getAuthorById(Integer id) {
        return methods.get("/api/library/author/" + id);
    }

    public Response getAllAuthors() {
        return methods.get("/api/library/authors");
    }

    public Response postNewAuthor(Author author) {
        return methods.post("/api/library/author", JsonParser.convertObjectToJson(author));
    }

    public Response deleteAuthor(Integer idAuthor) {
        return methods.delete("/api/library/author/" + idAuthor);
    }

    public Response updateAuthor(Author author) {
        return methods.put("/api/library/author", JsonParser.convertObjectToJson(author));
    }


}
