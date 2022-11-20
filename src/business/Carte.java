package business;

import java.util.HashMap;

public class Carte {
    private String id;
    private int[][] numeros;

    public Carte(){}
    public Carte(String id, int[][] numeros) {
        this.id = id;
        this.numeros = numeros;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int[][] getNumeros() {
        return numeros;
    }

    public void setNumeros(int[][] numeros) {
        this.numeros = numeros;
    }
}
