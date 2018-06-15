package com.bridgelabz.proxydesignpatterns;

public class CommandExecuterProxy implements CommandExecuter {
	private boolean isAdmin;
	private CommandExecuter executer;

	public CommandExecuterProxy(String user, String pwd) {
		if ("Sarita".equals(user) && "hjuytrte".equals(pwd))
			isAdmin = true;
		executer = new CommandExecuterImplementation();
	}

	@Override
	public void runCommand(String cmd) throws Exception {
		// TODO Auto-generated method stub
		if (isAdmin) {
			executer.runCommand(cmd);
		} else {
			if (cmd.trim().startsWith("rm")) {
				throw new Exception("rm is not allowed for non-admin users");
			} else {
				executer.runCommand(cmd);
			}
		}
	}
}
