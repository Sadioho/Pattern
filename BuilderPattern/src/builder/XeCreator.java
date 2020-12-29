package builder;

import concrete.IXe;
import product.Xe;

public class XeCreator {
	private IXe car;
	
	public XeCreator(IXe car) {
		this.car=car;
	}
	public void CreateXe() {
		this.car.SetColor();
		this.car.SetName();
		this.car.SetGia();
		this.car.SetWeight();
	}
	public Xe GetXe() {
		return car.GetXe();
	}
}
