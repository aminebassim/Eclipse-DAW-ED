/**
 * 
 */
package debug1;

import static org.junit.Assert.*;


import org.junit.Test;

//modificacion

/**
 * @author Amine
 *
 */
public class actividad31 {

	public int resta() {
		int resul;
		if (resta2())
			 resul = num1 - num2;
		else 
			resul= num2-num1;
		return resul;
	}
	
	public boolean resta2() {
		if (num1 >= num2) 
			return true;
		else 
			return false;
	}
	
	public Integer divide2() {
		if (num2==0) 
			return null;
			int resul = num1 / num2;
		reutrn resul;
	}
}
