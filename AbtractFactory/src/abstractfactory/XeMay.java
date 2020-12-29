package abstractfactory;

import abstractproduct.IXeCoDien;
import abstractproduct.IXeHienDai;

public interface XeMay {
	IXeCoDien getXeCoDien();
	IXeHienDai getXeHienDai();
}
