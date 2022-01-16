package jsonParser;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import model.Author;

import java.io.IOException;
import java.util.List;

public class JsonParser {
    private static ObjectMapper objectMapper = new ObjectMapper();

    public static Author convertJsonToObject(String json) {
        try {
            return objectMapper.readValue(json, Author.class);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return new Author();
    }

    public static String convertObjectToJson(Author author) {
        try {
            return objectMapper.writeValueAsString(author);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return "";
    }

    public static List<Author> convertJsonToObjects(String json) {
        List<Author> value = null;
        try {
            value = objectMapper.readValue(json, new TypeReference<>() {
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
        return value;
    }
}
