import builder.XeCreator;

import product.XeAB;
import product.XeDream;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			 XeCreator XeA =new XeCreator(new XeAB());
			XeA.CreateXe();
			XeA.GetXe();
			XeCreator XeB=new XeCreator(new XeDream());
			XeB.CreateXe();

			System.out.println(XeB.GetXe());
			
			
	}

}
