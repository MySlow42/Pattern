package business;
// initialise cartes
//  collections de cartes de type map
// likedList pour les numSortis

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonReader;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class Lotto {
    private String filename = "Cartes.json";
    public HashMap<String, Carte> cartes = null ;
    private JsonObject messageJson =null;

    public HashMap<String, Carte> initCartes(){
        try {
            try (JsonReader reader = Json.createReader(new FileReader(filename))) {
                messageJson = reader.readObject();
                JsonArray cartesImport = messageJson.getJsonArray("cartes");

                for(int i=0; i< cartesImport.size(); i++) {
                    Carte c = new Carte();
                    String id = messageJson.getString("NumCarte");
                    c.setId(id);
                    String rangee1 = messageJson.getString("Rangee1");
                    System.out.println(rangee1);
                    String rangee2 = messageJson.getString("Rangee2");
                    String rangee3 = messageJson.getString("Rangee3");

                }

            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Lotto.class.getName()).log(Level.SEVERE, null, ex);
        }

        return cartes;

    }

}
