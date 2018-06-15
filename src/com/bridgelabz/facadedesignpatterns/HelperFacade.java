package com.bridgelabz.facadedesignpatterns;

import java.sql.Connection;

public class HelperFacade {
	public static void generateReport(DBTypes dbType, ReportTypes reportType, String tableName) {
		Connection con = null;
		switch (dbType) {
		case MySQL:
			con = MySqlHelper.getMySqlDBConnection();
			MySqlHelper mySqlHelper = new MySqlHelper();
			switch (reportType) {
			case HTML:
				mySqlHelper.generateMySqlHTMLReport(tableName, con);
				break;
			case PDF:
				mySqlHelper.generateMySqlPDFReport(tableName, con);
				break;
			}
			break;
		case ORACLE:
			con = OracleHelper.getOracleDBConnection();
			OracleHelper oracleHelper = new OracleHelper();
			switch (reportType) {
			case HTML:
				oracleHelper.generateOracleHTMLReport(tableName, con);
				break;
			case PDF:
				oracleHelper.generateOracleHTMLReport(tableName, con);
				break;
			}
			break;
		}
	}

	public static enum DBTypes {
		MySQL, ORACLE;
	}

	public static enum ReportTypes {
		HTML, PDF,;
	}
}
