/******************************************************************************
 *  Compilation:  javac -d bin UserLogin.java
 *  Execution:    java -cp bin com.bridgelabz.register.java User
 *  Purpose: To allow user to login and register their details
 *
 *  @author  Sarita
 *  @version 1.0
 *  @since  18-06-2018
 ******************************************************************************/
package com.bridgelabz.register;

import java.sql.SQLException;

public class UserController {
	static ServicesImplementation services = new ServicesImplementation();

	public static void main(String[] args) throws SQLException {
	 DatabaseAccessObject.getConnection();
		System.out.println("WELCOME To USER EMAIL PAGE");
		while (true) {
			System.out.println("enter your choice : 1 to login\n" + "2 to register\n");
			int choice = UserUtility.userInteger();
			switch (choice) {
			case 1:
				services.login();
				break;
			case 2:
				services.register();
				break;
			}
		}
	}
}
