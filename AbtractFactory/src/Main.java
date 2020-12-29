import abstractfactory.XeMay;
import client.Client;
import concretefactory.Xe;
import concretefactory.Xe2;

public class Main {

	private static Client ConfigClient() {
		Client cl;
		XeMay xm;
		xm=new Xe();
		cl=new Client(xm);
		return cl;
	} 
	private static Client ConfigClient2() {
		Client cl;
		XeMay xm;
		xm=new Xe2();
		cl=new Client(xm);
		return cl;
	} 
	  public static void main(String[] args) {
	        Client cl=ConfigClient();
	        cl.paint(); 
	        Client cl2=ConfigClient2();
	        cl2.paint(); 
	    }

}
