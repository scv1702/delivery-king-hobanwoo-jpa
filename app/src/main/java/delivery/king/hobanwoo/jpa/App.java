/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package delivery.king.hobanwoo.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("delivery-king-hobanwoo");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        // Perform JPA operations here

        entityManager.close();
        entityManagerFactory.close();
    }
}
