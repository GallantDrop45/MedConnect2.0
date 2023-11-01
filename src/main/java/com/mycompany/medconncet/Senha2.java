
package com.mycompany.medconncet;

import java.security.SecureRandom;
import java.util.ArrayList;


public class Senha2 {
    private static final String LETRAS = "C";
    private static final String NUMEROS = "0123456789";
    
    private static final SecureRandom random = new SecureRandom();

    public static String gerarSenha2(int comprimento) {
        StringBuilder senha = new StringBuilder();

        
        for (int i = 0; i < comprimento / 4; i++) {
            int index = random.nextInt(LETRAS.length());
            senha.append(LETRAS.charAt(index));
        }

        
        for (int i = 0; i < comprimento / 1; i++) {
            int index = random.nextInt(NUMEROS.length());
            senha.append(NUMEROS.charAt(index));

        }

        return senha.toString();
    }

    public static void main(String[] args) {
        ArrayList<String> senhas = new ArrayList<>();
        
        for (int i = 0; i < 10; i++) {
            String senhaGerada = gerarSenha2(4);
            senhas.add(senhaGerada);
            System.out.println("Senha gerada: " + senhaGerada);
    }
    
}
}