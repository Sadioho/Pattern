package product;

import concrete.IXe;

public class XeAB implements IXe {
	Xe xe=new Xe();
	@Override
	public void SetColor() {
		// TODO Auto-generated method stub
		xe.color="Red";
	}

	@Override
	public void SetName() {
		// TODO Auto-generated method stub
		xe.name="Xe AirBlack";
	}

	@Override
	public void SetGia() {
		// TODO Auto-generated method stub
		xe.gia="45,000 VND";
	}

	@Override
	public void SetWeight() {
		// TODO Auto-generated method stub
		xe.weight="100 kg";
	}

	@Override
	public Xe GetXe() {
		// TODO Auto-generated method stub
		return xe;
	}
	
}
