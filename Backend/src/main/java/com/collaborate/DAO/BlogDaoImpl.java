package com.collaborate.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.collaborate.Model.Blog;
@Repository("blogDao")
public class BlogDaoImpl implements BlogDao {
	
	@Autowired
	SessionFactory sessionFactory;
	public BlogDaoImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}
	@Transactional
	public boolean createBlog(Blog blog)
	{
	try
	{
		sessionFactory.getCurrentSession().saveOrUpdate(blog);
		return true;
	}
	catch(Exception e)
	{
		System.out.println("Exception Arised"+e);
		return false;
	}
	
}

	public Blog getBlog(int blogId) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Blog> getBlogs() {
		
		Session session=sessionFactory.openSession();
		Query query=session.createQuery("from blog where status='A'");
	   List<Blog> listBlog=query.list();
	   session.close();
		
		return listBlog;
		
	}
	@Transactional
	public boolean approveBlog(Blog blog)
	{
		try
		{
			blog.setStatus("A");
			sessionFactory.getCurrentSession().saveOrUpdate(blog);
			return true;
		}
		catch(Exception e)
		{
			System.out.println("Exception Arised:"+e);
			return false;
		}
	}

	public boolean editBlog(int blogId) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean deleteBlog(int blogId) {
		// TODO Auto-generated method stub
		return false;
	}
}
