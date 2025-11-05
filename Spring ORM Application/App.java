package SpringORM.SpringORM;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import SpringORM.SpringORM.dao.Bookdao;
import SpringORM.SpringORM.entity.Book;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext apc= new ClassPathXmlApplicationContext("config.xml");
         Bookdao bookDao= (Bookdao)apc.getBean("bookdao");
        
        // Book book = new Book(101,"Wing of Fire", " APJ Abdul Kalam");
         //bookDao.saveNewBook(book);
        // System.out.println("Data is Inserted");
         
     //   Book book=  bookDao.getBookDetailById(101);
       // System.out.println(book.getBookId()+" "+book.getBookName()+" "+book.getAuther());
         
         //get all
         //List<Book> listOfBooks= bookDao.getAllBooks();
       // for(Book b:listOfBooks){
        	//System.out.println(b.getBookId()+"--"+b.getBookName()+"--"+b.getAuther());
         
       //update 
     	//Book b=bookDao.getBookDetailById(101);
     	//b.setBookName("Java");
     	//bookDao.updateBookDetails(b);
         
         //delete
         //get
         Book b=bookDao.getBookDetailById(102);
         bookDao.deleteBook(b);
     	
     	
        }
    }

