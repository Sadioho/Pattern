package client;

import abstractfactory.XeMay;
import abstractproduct.IXeCoDien;
import abstractproduct.IXeHienDai;

public class Client {
	IXeCoDien xecodien;
	IXeHienDai xehiendai;
	
	public Client(XeMay factory) {
		xecodien=factory.getXeCoDien();
		xehiendai=factory.getXeHienDai();
	}
	public void paint() {
		xecodien.paint();
		xehiendai.paint();
	}
}
