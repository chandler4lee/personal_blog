package com.money.login.dao.Impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.money.entity.Blog_user;
import com.money.login.dao.LoginDAO;

@Repository 
public class LoginDaoImpl implements LoginDAO {

	protected SessionFactory sessionFactory;  
	
    @Resource  
    public void setSessionFactory(SessionFactory sessionFactory) {  
        this.sessionFactory = sessionFactory;  
    }  
  
    protected Session getSession() {  
        return sessionFactory.getCurrentSession();  
    }  
	
	public Blog_user select(Blog_user param) {
		Blog_user blog = null;
		System.out.println("in");
		
		/*Query q = getSession().createSQLQuery("select id,user_name,password,sign_date from blog_user where id=1")
				.addEntity(BlogUser.class);
		
		List<BlogUser> users = q.list();
		blog = users.get(0);*/
		
		String hql = "from Blog_user as blog_user where blog_user.id=:id";
		Query query= getSession().createQuery(hql);
		query.setInteger("id", 1);
		List<Blog_user> users = query.list();
		blog = users.get(0);
		return blog;
	}

}
