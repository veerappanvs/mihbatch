/**
 * 
 */
package com.ehs.mihonline.exception;

/**
 * @author vsubramaniyan
 *
 */
public class TargetFileExistsException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2895890941202931738L;
	TargetFileExistsException(){}
	public TargetFileExistsException(String msg){
		super(msg);
	}

}
