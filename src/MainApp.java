import business.Lotto;

public class  MainApp {
    public static void main(String[] args) {
        //initialiser les cartes avec leur id et matrice
        //lancer la console

        //new Cartes().initJeux -> qui va appeler Lotto.initCartes() puis va afficher les cartes;
        new Console().runJeux();

        //check
        //Lotto.addLignes();
    }
}
