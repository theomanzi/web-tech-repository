package Dao;
import org.hibernate.*;
import java.util.*;
import Pojo.StudentPojo;
public class studentdao {
	 public void saveStudent(StudentPojo student) {
	        Transaction transaction = null;
	        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
	            // Start a transaction
	            transaction = session.beginTransaction();
	            // Save the student object
	            session.save(student);
	            // Commit transaction
	            transaction.commit();
	        } catch (Exception e) {
	            if (transaction != null) {
	                transaction.rollback();
	            }
	            e.printStackTrace();
	        }
	    }

	    // Method to update a student
	    public void updateStudent(StudentPojo student) {
	        Transaction transaction = null;
	        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
	            // Start a transaction
	            transaction = session.beginTransaction();
	            // Update the student object
	            session.update(student);
	            // Commit transaction
	            transaction.commit();
	        } catch (Exception e) {
	            if (transaction != null) {
	                transaction.rollback();
	            }
	            e.printStackTrace();
	        }
	    }

	    // Method to delete a student
	    public void deleteStudent(StudentPojo student) {
	        Transaction transaction = null;
	        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
	            // Start a transaction
	            transaction = session.beginTransaction();
	            // Delete the student object
	            session.delete(student);
	            // Commit transaction
	            transaction.commit();
	        } catch (Exception e) {
	            if (transaction != null) {
	                transaction.rollback();
	            }
	            e.printStackTrace();  
	        }
	    }

	    // Method to get a student by id
	    public StudentPojo getStudentById(int id) {
	        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
	            // Retrieve the student object by id
	            return session.get(StudentPojo.class, id);
	        } catch (Exception e) {
	            e.printStackTrace();
	            return null;
	        }
	    }


}
