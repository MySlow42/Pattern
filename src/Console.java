import java.util.Scanner;

public class Console {
    final private String DEL = "del";
    final private String QUINE = "v1";
    final private String DOUBLE_QUINE = "v2";
    final private String CARTON = "v3";

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
        System.out.println("____________________________________________________________________");
        System.out.println("Aide de commande :");
        System.out.println("Entrez les numéros tiré les uns après les autres, en validant avec la touche enter");
        System.out.println("Si vous vous êtes trompé, taper \"del\", cela supprimera le dernier numero entré");
        System.out.println("Losrque vous voulez contrôler une QUINE taper \"v1\"");
        System.out.println("Losrque vous voulez contrôler une DOUBLE-QUINE taper \"v2\"");
        System.out.println("Losrque vous voulez contrôler un CARTON taper \"v3\"");
        System.out.println("____________________________________________________________________");
        System.out.println("Bonne partie de Lotto!!                              Vous jouez la partie n°: " + compteur);
        Scanner command = new Scanner(System.in);
        System.out.println("Entrer le numéro tiré, puis pressez enter");


    }
}
