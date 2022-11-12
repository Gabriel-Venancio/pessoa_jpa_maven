package org.example.aplicacao;

import org.example.dominio.Pessoa;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa(1, "Gabriel Venancio", "gabrielvenancio@gmail.com");
        Pessoa p2 = new Pessoa(2, "Laiza Caroline", "laizacaroline@gmail.com");
        System.out.println(p1);
        System.out.println(p2);
    }
}