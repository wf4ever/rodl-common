package pl.psnc.dl.wf4ever.common;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 * Active Record instance, with generic methods for loading, saving and deleting objects.
 * 
 * @author piotrek
 * 
 */
public abstract class ActiveRecord implements Serializable {

    /** id. */
    private static final long serialVersionUID = 258330617173783552L;

    /** Hibernate session factory. */
    protected SessionFactory sessionFactory;


    /**
     * Load an object.
     * 
     * @param <T>
     *            ActiveRecord class
     * @param clazz
     *            ActiveRecord class instance
     * @param sessionFactory
     *            session factory for this object
     * @param id
     *            primary key
     * @return an object or null
     */
    @SuppressWarnings("unchecked")
    protected static <T extends ActiveRecord> T findByPrimaryKey(Class<T> clazz, SessionFactory sessionFactory,
            Serializable id) {
        Session session = sessionFactory.getCurrentSession();
        T activeRecord = (T) session.get(clazz, id);
        if (activeRecord != null) {
            activeRecord.sessionFactory = sessionFactory;
        }
        return activeRecord;
    }


    /**
     * Persist the object in the database.
     */
    public void save() {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(this);
    }


    /**
     * Delete the object from the database.
     */
    public void delete() {
        Session session = sessionFactory.getCurrentSession();
        session.delete(this);
    }

}
