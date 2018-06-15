package com.bridgelabz.proxydesignpatterns;

public class ProxyPatternTest {
	public static void main(String[] args) {
		CommandExecuter executer = new CommandExecuterProxy("Sarita", "wrong_pwd");
		try {
			executer.runCommand("ls -ltr");
			executer.runCommand(" rm -rf abc.pdf");
		} catch (Exception e) {
			System.out.println("Exception message::" + e.getMessage());
		}
	}
}
