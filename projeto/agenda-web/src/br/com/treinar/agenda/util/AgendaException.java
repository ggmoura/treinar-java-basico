package br.com.treinar.agenda.util;

public class AgendaException extends Exception {

	private static final long serialVersionUID = 5L;

	private String msg;

	public AgendaException(String msg) {
		this.msg = msg;
	}
	
	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	@Override
	public String toString() {
		return msg;
	}

}
