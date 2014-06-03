package com.companyname.springapp.repository;



import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.companyname.springapp.domain.Office;

@Repository(value = "officeDao")
public class JPAOfficeDao implements OfficeDao {

    private EntityManager em = null;

    /*
     * Sets the entity manager.
     */
    @PersistenceContext
    public void setEntityManager(EntityManager em) {
        this.em = em;
    }

    @Transactional(readOnly = true)
    @SuppressWarnings("unchecked")
    public List<Office> getOfficeList() {
        return em.createQuery("select o from Office o order by o.id").getResultList();
    }

    @Transactional(readOnly = false)
    public void saveOffice(Office office) {
        int id = this.getOfficeList().size()+1;
       office.setId(id);
        System.out.println(office.getId());
        em.merge(office);
    	
       
    }


}