package com.bridgelabz.adapterdesignpatterns;

public class SocketObjectAdapterImplementation implements SocketAdapter {
	private Socket sock = new Socket();

	@Override
	public Volt get120Volt() {
		// TODO Auto-generated method stub
		return sock.getVolt();
	}

	@Override
	public Volt get12Volt() {
		// TODO Auto-generated method stub
		Volt v = sock.getVolt();
		return convertVolt(v, 40);
	}

	@Override
	public Volt get3Volt() {
		// TODO Auto-generated method stub
		Volt v = sock.getVolt();
		return convertVolt(v, 40);
	}

	private Volt convertVolt(Volt v, int i) {
		return new Volt(v.getVolts() / i);
	}

}
