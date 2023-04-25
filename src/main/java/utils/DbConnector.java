package utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DbConnector {

        private static final String DB_URL = "jdbc:postgresql://localhost:5432/postgres";
        private static final String DB_USER = "postgres";
        private static final String DB_PASSWORD = "admin";
        private static final EntityManagerFactory ENTITY_MANAGER_FACTORY = Persistence.createEntityManagerFactory("main-unit");

        public static Connection getConnection() throws SQLException {
            return DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
        }

        private DbConnector() {
        }
        public static EntityManager getEntityManager() {
                return ENTITY_MANAGER_FACTORY.createEntityManager();
        }
}
