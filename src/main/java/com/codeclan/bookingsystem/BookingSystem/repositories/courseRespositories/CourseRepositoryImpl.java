package com.codeclan.bookingsystem.BookingSystem.repositories.courseRespositories;

import com.codeclan.bookingsystem.BookingSystem.models.Customer;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

public class CourseRepositoryImpl {
   @Autowired
    EntityManager entityManager;

    @Transactional
    public List<Customer> getAllCustomersForCourse(Long id){
        List<Customer> results = null;
        Session session = entityManager.unwrap(Session.class);
        try {
            Criteria cr = session.createCriteria(Customer.class);
            cr.createAlias("bookings", "bookingAlias");
            // cr.createAlias("bookingAlias.course", "courseAlias");
            cr.add(Restrictions.eq("bookingAlias.course.id", id));
            results = cr.list();
        } catch (HibernateException ex) {
            ex.printStackTrace();
        }
        return results;
    }
}
