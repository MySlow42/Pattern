

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

    public void runJeux(){
        //TODO Apparence de sout pour que le meneur de jeu entre les numéros + indication de lettre quand veut checker, + indication de lettre quand erreur a refaire?
        System.out.println("____________________________________________________________________");
        System.out.println("Aide de commande :");
        System.out.println("Si vous vous êtes trompé, taper \"del\");
                System.out.println("____________________________________________________________________");
        System.out.print("Bonne partie de Lotto!!");
        System.out.println("            ");
        System.out.println("Vous jouez la partie n°: " + compteur);
        System.out.println("Entrer le numéro tiré, puis pressez enter");

}
