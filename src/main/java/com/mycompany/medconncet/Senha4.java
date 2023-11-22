
package com.mycompany.medconncet;

import java.security.SecureRandom;

public class Senha4 {
    private static final String LETRAS = "R";
    private static final String NUMEROS = "0123456789";
    
    private static final SecureRandom random = new SecureRandom();

    public static String gerarSenha4(int comprimento) {
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
        
        String senhaGerada = gerarSenha4(5);
        System.out.println("Senha gerada: " + senhaGerada);
    }
}
