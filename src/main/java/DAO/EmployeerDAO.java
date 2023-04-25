package DAO;

import classes.Employeer;
import utils.DbConnector;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;

public class EmployeerDAO {

    public void addEmployeer(Employeer employeer){
        EntityManager entityManager = DbConnector.getEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(employeer);
        entityManager.getTransaction().commit();
    }

    public void configurateEmployeer(Long id, Employeer newEmployeer){
        EntityManager entityManager = DbConnector.getEntityManager();
        entityManager.getTransaction().begin();
        Employeer employeerConfig = entityManager.find(Employeer.class, id);
        if(employeerConfig != null) {
            employeerConfig.setFirstName(newEmployeer.getFirstName());
            employeerConfig.setLastName(newEmployeer.getLastName());
            employeerConfig.setMiddleName(newEmployeer.getMiddleName());
            employeerConfig.setPosition(newEmployeer.getPosition());
            employeerConfig.setDepartment(newEmployeer.getDepartment());
            employeerConfig.setSalary(newEmployeer.getSalary());
            entityManager.persist(employeerConfig);
            System.out.println("Сотрудник под id " + id + "был успешно иземенён");
        } else {
            System.out.println("Работник с данным id: " + id + " не найден");
        }
        entityManager.getTransaction().commit();
    }

    public void deleteEmployeer(Long id){
        EntityManager entityManager = DbConnector.getEntityManager();
        entityManager.getTransaction().begin();
        Employeer employeerDelete = entityManager.find(Employeer.class, id);
        entityManager.remove(employeerDelete);
        entityManager.getTransaction().commit();
    }

    public Employeer showEmployeer(Long id){
        EntityManager entityManager = DbConnector.getEntityManager();
        entityManager.getTransaction().begin();
        return entityManager.find(Employeer.class, id);
    }
}
