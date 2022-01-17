package jsonParser;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import model.Author;

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
}
