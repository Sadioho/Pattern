package concretefactory;

import abstractfactory.XeMay;
import abstractproduct.IXeCoDien;
import abstractproduct.IXeHienDai;
import product.XeHD;
import product.XeHD2;

public class Xe implements XeMay{

	@Override
	public IXeCoDien getXeCoDien() {
		// TODO Auto-generated method stub
		return new XeHD();
	}

	@Override
	public IXeHienDai getXeHienDai() {
		// TODO Auto-generated method stub
		return new XeHD2();
	}
	
}
