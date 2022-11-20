package business;
// initialise cartes
// collections de cartes de type map
// likedList pour les numSortis

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.List;
import javax.json.JsonObject;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.type.TypeFactory;

public class Lotto {
    private final String FILENAME = "Cartes.json";
    private static HashMap<String, Carte> cartesMap = new HashMap<>();
    private static Carte[] cartesTableau = new Carte[0];
    public HashMap<String, Carte> initCartes(){
        try {
            ObjectMapper om = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            //TODO check paramètre possible avec ARRAY
            /*TypeFactory tFactory = om.getTypeFactory();
            cartesTableau = om.readValue(new File(FILENAME), tFactory.constructCollectionType(Array.class, Carte.class));
*/
            cartesTableau = om.readValue(new File(FILENAME), Carte[].class);

            for(Carte carte : cartesTableau) {
                cartesMap.put(carte.getId(), carte);
                System.out.println("ici add de la carte avec l'di: "+carte.getId());
            }

        } catch (JsonParseException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return cartesMap;

    }

}
