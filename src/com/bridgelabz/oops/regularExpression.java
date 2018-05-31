package com.bridgelabz.oops;
import java.sql.Date;

import com.bridgelabz.init.userDetails;
import com.bridgelabz.oops.utility.Utility1;
import com.bridgelabz.utility.Utility;

public class regularExpression {	 
	   public static void main(String[] args)
	   {
		   Utility1 u1=new Utility1();
		   userDetails user=new userDetails();
		   System.out.println("enter first name");
		   user.setFname(Utility.userString());
		   System.out.println("enter full name");
		   user.setLname(Utility.userString());
		   System.out.println("enter mobile no");
		   user.setMobileNo(Utility.userString());
		   System.out.println("enter the date");
		   user.setDate(u1.getFormatedDate(new Date(0)));
		   System.out.println(u1.convertString(user,u1.getFileText("newfile.txt")));
	   }
	}
