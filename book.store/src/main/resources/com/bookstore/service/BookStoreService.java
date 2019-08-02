package bookstore.service;

import javax.jws.WebService;

import bookstore.domain.Book;
import bookstore.fault.FaultMessage;

@WebService
public interface BookStoreService {

	void init();
	
	Book details(String reference)throws FaultMessage;
}
