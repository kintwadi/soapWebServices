package bookstore.fault;

import java.io.Serializable;

public class FaultElement  implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String message;
	private int code;

	
	
	public FaultElement(String message,int code) {
		super();
		this.code = code;
		this.message = message;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

}
