
package com.mycompany.medconncet;

import java.util.ArrayList;


public class GuardaSenha {
        private ArrayList<String> senhasArmazenadas = new ArrayList<>();

    public void adicionarSenha(String senha) {
        senhasArmazenadas.add(senha);
    }

    public ArrayList<String> getSenhasArmazenadas() {
        return senhasArmazenadas;
    }
}


