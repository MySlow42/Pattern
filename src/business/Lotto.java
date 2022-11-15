package business;
// initialise cartes
//  collections de cartes de type map
// likedList pour les numSortis
// test ici et là

import java.io.File;
import java.io.IOException;
import javax.json.JsonObject;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class Lotto {
    private String filename = "Cartes.json";
    public void initCartes(){
        Carte[] cartes;
        try {
            ObjectMapper om = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            cartes = om.readValue(new File(filename), Carte[].class);
        } catch (JsonParseException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }



    }

}
