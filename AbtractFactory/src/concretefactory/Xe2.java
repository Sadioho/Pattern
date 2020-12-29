package concretefactory;

import abstractfactory.XeMay;
import abstractproduct.IXeCoDien;
import abstractproduct.IXeHienDai;
import product.XeYH;
import product.XeYH2;

public class Xe2 implements XeMay{

	@Override
	public IXeCoDien getXeCoDien() {
		// TODO Auto-generated method stub
		return new XeYH();
	}

	@Override
	public IXeHienDai getXeHienDai() {
		// TODO Auto-generated method stub
		return new XeYH2();
	}

}
