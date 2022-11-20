package util;

import business.Carte;
import business.Lotto;

import java.util.HashMap;

public class ServiceLotto {
    Lotto jeu;
    HashMap<String, Carte> cartes = new Lotto().initCartes();
    //methode check carte
    public String ckeckCarte(String id){
        Carte carte = cartes.get(id);

    }
    //méthode enlever le dernier N°
    //méthode compteur qui indique le nombre de tour
}
