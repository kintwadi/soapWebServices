package bookstore.fault;

import javax.xml.ws.WebFault;

@WebFault(name ="faultElement", faultBean="bookstore.fault.FaultElement")
public class FaultMessage extends Exception {

	private static final long serialVersionUID = 1L;

	private FaultElement fault;

	public FaultMessage(FaultElement fault) {

		super(fault.getMessage());
		this.fault = fault;
	}

	public FaultMessage(String message, FaultElement fault) {

		super(message);
		this.fault = fault;
	}



	public FaultElement getFault() {
		return fault;
	}

	public void setFault(FaultElement fault) {
		this.fault = fault;
	}






}
