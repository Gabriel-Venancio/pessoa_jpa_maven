package org.example.aplicacao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.example.dominio.Pessoa;

public class Main {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pessoa-jpa");
        EntityManager em = emf.createEntityManager();

        Pessoa p1 = new Pessoa(null, "Gabriel Venancio", "gabrielvenancio@gmail.com");
        Pessoa p2 = new Pessoa(null, "Laiza Caroline", "laizacaroline@gmail.com");
        em.getTransaction().begin();
        em.persist(p1);
        em.persist(p2);
        em.getTransaction().commit();

        Pessoa a = em.find(Pessoa.class, 2);
        System.out.println(a);

        Pessoa b = em.find(Pessoa.class, 2);
        em.getTransaction().begin();
        em.remove(b);
        em.getTransaction().commit();

        System.out.println("Pronto!");

        em.close();
        emf.close();
    }
}