package com.sample.project.jpaproject;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import main2.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) 
    {
    	
    	EntityManagerFactory emf = null;
		EntityManager entityManager = null;
		EntityTransaction transaction = null;
  
    try
    {
    	emf =Persistence.createEntityManagerFactory("jpa-todo");
    	entityManager = emf.createEntityManager();
		transaction = entityManager.getTransaction();
		transaction.begin();
		
		Student stud =new Student();
		stud.setStudentId(1);
		stud.setFname("Suyesh");
		stud.setLname("Patil");
		stud.setContact("95790277");
		entityManager.persist(stud);
		transaction.commit();
		Query q = entityManager.createQuery("select a from Student a");
		List<Student> resultList = q.getResultList();
		System.out.println("num of sudents:" + resultList.size());
		for (Student next : resultList) {
			System.out.println("next student: " + next);
		}		
		
    }
    catch(Exception e)
    {
    	System.out.println("Error");
    	transaction.rollback();
    }
    finally {
    	entityManager.close();
		emf.close();
    }
}
}