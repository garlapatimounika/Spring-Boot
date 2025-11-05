package SpringORM.SpringORM.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import SpringORM.SpringORM.entity.Book;

public class Bookdao {
	@Autowired
	HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
   //--------------------------------------------------
	//save operation
	@Transactional
	public void saveNewBook(Book book){
		this.hibernateTemplate.save(book);
		
		
	}
	//-----------------------------------------
	//get sigle data by id
	public Book getBookDetailById(int id){
		 Book book=this.hibernateTemplate.get(Book.class ,id);
		return book;
	}
	//-------------------------------------------
	public List<Book> getAllBooks(){
	  List<Book> listOfBooks=	this.hibernateTemplate.loadAll(Book.class );
	  return listOfBooks;
	}
	//---------------------------------------------------
	@Transactional
public void updateBookDetails(Book book){
	this.hibernateTemplate.update(book);
}
	//-------------------------------------------------
	@Transactional
	public void deleteBook(Book book){
		this.hibernateTemplate.delete(book);
	}
	
	}

