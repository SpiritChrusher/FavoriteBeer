package Backend_Beer;

import com.google.gson.*;
import org.tinylog.Logger;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;

public class PersonDAO {


    public static void WriteToJson(Person p)
    {
        Gson gson = new Gson();


        try (FileWriter writer = new FileWriter("Person.json")) {
            gson.toJson(p, writer);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        Logger.info("User's data has been saved to Json file.");
    }

    public static void test() throws IOException {
        String fileName = "Mybeers_part.json";
        ClassLoader classLoader = new PersonDAO().getClass().getClassLoader();

        File file = new File(classLoader.getResource(fileName).getFile());

        System.out.println("File Found : " + file.exists());

        //Read File Content
        String content = new String(Files.readAllBytes(file.toPath()));
        System.out.println(content);
    }

}