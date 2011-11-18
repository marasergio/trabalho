/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

/**
 *
 * @author Mara-Netbook
 */

public class HibernateUtil {
    public static SessionFactory sessionFactory;
    
    public HibernateUtil(){
    }
    
    public static SessionFactory getSessionFactory(){
        if(sessionFactory == null){
            try{
                AnnotationConfiguration anotacao = new AnnotationConfiguration();
                sessionFactory = anotacao.configure().buildSessionFactory();
            }catch(Throwable ex){
                System.out.println("Erro ao iniciar o Hibernate" + ex);
                throw new ExceptionInInitializerError(ex);
            
            }
        }
        return sessionFactory;
    }
    
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        System.out.println("Iniciado com sucesso");
    }
}
