/**
 * 
 */
package com.ehs.mihonline.util;

/**
 * @author vsubramaniyan
 *
 */
public class MailSendFailureException extends Exception {
	MailSendFailureException(){}
	public MailSendFailureException(String msg){
		super(msg);
	}

}
