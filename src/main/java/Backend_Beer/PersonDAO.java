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



}