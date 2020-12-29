package product;

import concrete.IXe;

public class XeDream implements IXe{
	Xe xe=new Xe();
	@Override
	public void SetColor() {
		// TODO Auto-generated method stub
		xe.color="Brown";
	}

	@Override
	public void SetName() {
		// TODO Auto-generated method stub
		xe.name="Xe Dream";
	}

	@Override
	public void SetGia() {
		// TODO Auto-generated method stub
		xe.gia="12,000,000 VND";
	}

	@Override
	public void SetWeight() {
		xe.weight="50 kg";
		// TODO Auto-generated method stub
		
	}

	@Override
	public Xe GetXe() {
		// TODO Auto-generated method stub
		return xe;
	}

}
