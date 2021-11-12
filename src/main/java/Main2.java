import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;

public class Main2 {

    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        File file = new File("./test.json");
        if (!file.exists()) {
            file.createNewFile();
        }
        OutputStream outputStream = new FileOutputStream(file);
        JsonGenerator jGenerator = mapper.getFactory().createGenerator(outputStream);
        // jGenerator.writeStartArray();
        Person p = new Person(1, "Michel");
        jGenerator.writeStartObject();
        jGenerator.writeNumberField("id", p.getId());
        jGenerator.writeStringField("name", p.getName());
        jGenerator.writeEndObject();
        // jGenerator.writeEndArray();
        jGenerator.close();
    }
}
