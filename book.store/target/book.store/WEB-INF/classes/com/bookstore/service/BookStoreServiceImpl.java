package bookstore.service;

import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;

import bookstore.domain.Book;
import bookstore.fault.FaultElement;
import bookstore.fault.FaultMessage;
import bookstore.util.Util;

@WebService(endpointInterface ="bookstore.service.BookStoreService")
public class BookStoreServiceImpl implements BookStoreService {

	@Autowired
	private Book book;
	@Override
	public void init() {
		
		System.out.println("bookStore :: initialized...");	
		
	}

	@Override
	public Book details(String reference) throws FaultMessage{
		
		// throw fault  simple exception
		if(!Util.validate(reference)) {
		
			FaultElement fault = new FaultElement(Util.GET_BOOK_DETAILS_ERROR_MESSAGE, Util.ERROR_CODE);
			throw new FaultMessage(fault);
		}
		return  Util.books.get(reference);
	}

}
