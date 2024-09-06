package io.codeforall.bootcamp.booklibrary.persistence.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

public abstract class GenericJpaDAO<T> {

    protected Class<T> modelType;

    @PersistenceContext
    protected EntityManager em;


    public GenericJpaDAO(Class<T> modelType) {
        this.modelType = modelType;
    }

    public List<T> findAll() {
        CriteriaQuery<T> criteriaQuery = em.getCriteriaBuilder().createQuery(modelType);
        Root<T> root = criteriaQuery.from(modelType);
        return em.createQuery(criteriaQuery).getResultList();

    }

    public T findById(Integer id) {
        return em.find(modelType, id);
    }

    public T saveOrUpdate(T modelObject) {
        return em.merge(modelObject);
    }

    public void delete(Integer id) {
        em.remove(em.find(modelType, id));
    }

}
