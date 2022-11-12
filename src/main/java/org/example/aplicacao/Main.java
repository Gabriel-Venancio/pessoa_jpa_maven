package org.example.aplicacao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.example.dominio.Pessoa;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa(null, "Gabriel Venancio", "gabrielvenancio@gmail.com");
        Pessoa p2 = new Pessoa(null, "Laiza Caroline", "laizacaroline@gmail.com");

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pessoa-jpa");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        em.persist(p1);
        em.persist(p2);
        em.getTransaction().commit();
        System.out.println("Pronto!");
    }
}