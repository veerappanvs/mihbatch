/**
 * 
 */
package com.ehs.mihonline.exception;

/**
 * @author vsubramaniyan
 *
 */
public class MailSendFailureException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4635471056439110176L;
	MailSendFailureException(){}
	public MailSendFailureException(String msg){
		super(msg);
	}

}
