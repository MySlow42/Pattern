import java.util.LinkedList;
import java.util.Scanner;

public class Console {
    final private String DEL = "del";
    final private String QUINE = "v1";
    final private String DOUBLE_QUINE = "v2";
    final private String CARTON = "v3";
    private LinkedList<Integer> numTire = new LinkedList<>();
    private int compteur = 1;
    //private boolean finDeLaPartie = false;

    //TODO selon ce qui est entré dans la console:
    // case nombres, ajouter le nombre dans une collection
    // case retour en arrière, supprime le dernier element ajouter dnas le tableau
    //case "check", lance la vérification
    //meneur de jeux entre q d ou c pour checker quine double quine carton, dans le cas carton ok reinitaliser le jeu
    // automatique ?

    public void runJeux() {
        //TODO Apparence de sout pour que le meneur de jeu entre les numéros + indication de lettre quand veut checker, + indication de lettre quand erreur a refaire?
        boolean running = true;
        System.out.println("____________________________________________________________________");
        System.out.println("Aide de commande :");
        System.out.println("Entrez \"jouerles numéros tiré les uns après les autres, en validant avec la touche enter");
        System.out.println("Entrez les numéros tiré les uns après les autres, en validant avec la touche enter");
        System.out.println("Si vous vous êtes trompé, taper \"del\", cela supprimera le dernier numero entré");
        System.out.println("Losrque vous voulez contrôler une QUINE taper \"v1\"");
        System.out.println("Losrque vous voulez contrôler une DOUBLE-QUINE taper \"v2\"");
        System.out.println("Losrque vous voulez contrôler un CARTON taper \"v3\"");
        System.out.println("____________________________________________________________________");
        while (running) {
        System.out.println("Bonne partie de Lotto!!                              Vous jouez la partie n°: " + compteur);
        System.out.println("Entrer le numéro tiré, puis pressez enter");
            Scanner command = new Scanner(System.in);
            String entry = command.nextLine();
            if(isNumeric(entry)){
                numTire.add(Integer.valueOf(entry));
                System.out.println("Le numéro " + entry + " a été ajouté.");
            } else {

                switch (entry) {
                    case DEL:
                        Integer num = numTire.removeLast();
                        System.out.println("Le numero " + num + " a été supprimé de la liste.");
                        break;
                    case QUINE:
                        System.out.println("Veuillez entrer l'id de la carte a contrôler: ");
                        String id = command.nextLine();

                        String v1 = ckeckCarte(id);
                        if (v1 == "v1"){
                            System.out.println("la carte à bien un ligne complète, c'est QUINE!");
                        } else {
                            System.out.println("la carte n'est pas valide pour la QUINE");
                        }
                        break;
                    case DOUBLE_QUINE:
                        System.out.println("Veuillez entrer l'id de la carte a contrôler: ");
                        String id = command.nextLine();
                        //boolean checkv2 = ckeckCarte(id);
                        if (check){
                            System.out.println("la carte à bien deux lignes complètes, c'est DOUBLE-QUINE!");
                        } else {
                            System.out.println("la carte n'est pas valide pour la DOUBLE-QUINE");
                        }
                        break;
                    case CARTON:
                        System.out.println("Veuillez entrer l'id de la carte a contrôler: ");
                        String id = command.nextLine();
                        //boolean checkv3 = ckeckCarte(id);
                        if (check){
                            System.out.println("la carte est complète, c'est CARTON!");
                            compteur++;
                            numTire.clear();
                        } else {
                            System.out.println("la carte n'est pas valide pour le CARTON");
                        }
                        break;
                    default:
                        System.out.println("Commande non reconnue");
                        break;


                }
            }
    }

    }
    public boolean isNumeric(String entry){
        if (entry == null){
            return false;
        }
        try {
            Integer d = Integer.parseInt(entry);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}
