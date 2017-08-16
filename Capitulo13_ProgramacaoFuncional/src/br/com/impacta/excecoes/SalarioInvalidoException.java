package br.com.impacta.excecoes;

import java.util.Date;

public class SalarioInvalidoException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public SalarioInvalidoException(){
		super();
	}
	
	public SalarioInvalidoException(String msg){
		super(msg);
	}

	@Override
	public String getMessage(){
		String data = new Date().toString();
		String stackTrace = "";
		for(StackTraceElement item : this.getStackTrace()){
			stackTrace += item.toString() + "\n";
		}

		return "[" + data + "]\n\n" + stackTrace + "\n" + super.getMessage();
	}
	
	
	
	
	
	
}
