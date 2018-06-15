package com.bridgelabz.proxydesignpatterns;

public class CommandExecuterImplementation implements CommandExecuter {

	@Override
	public void runCommand(String cmd) throws Exception {
		// TODO Auto-generated method stub
		Runtime.getRuntime().exec(cmd);
		System.out.println(" " + cmd + " command executed ");
	}

}
