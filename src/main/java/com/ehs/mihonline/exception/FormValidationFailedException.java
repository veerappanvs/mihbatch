/**
 * 
 */
package com.ehs.mihonline.exception;

/**
 * @author vsubramaniyan
 *
 */
public class FormValidationFailedException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8333001680646478471L;
	FormValidationFailedException(){}
	public FormValidationFailedException(String msg){
		super(msg);
	}

}
