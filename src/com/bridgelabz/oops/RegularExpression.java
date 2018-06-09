package com.bridgelabz.oops;
import java.sql.Date;

import com.bridgelabz.init.UserDetails;
import com.bridgelabz.init.UserDetails;
import com.bridgelabz.oops.utility.Utility1;
import com.bridgelabz.utility.Utility;

public class RegularExpression {	 
	   public static void main(String[] args)
	   {
		   Utility1 u1=new Utility1();
		   UserDetails user=new UserDetails();
		   System.out.println("enter first name");
		   user.setFname(Utility.userString());
		   System.out.println("enter last name");
		   user.setLname(Utility.userString());
		   System.out.println("enter mobile no");
		   user.setMobileNo(Utility.userString());
		   System.out.println("enter the date");
		   user.setDate(u1.getFormatedDate(new Date(0)));
		   System.out.println(u1.convertString(user,u1.getFileText("newfile.txt")));
	   }
	}
