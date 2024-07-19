package application;

import device.ComboDevice;
import device.PrinterDevice;
import device.ScannerDevice;

public class Program {

	public static void main(String[] args) {
		PrinterDevice p = new PrinterDevice("1080");
		p.processDoc("My Letter");
		p.print("My Letter");

		System.out.println();
		ScannerDevice s = new ScannerDevice("2003");
		s.processDoc("My Email");
		System.out.println("Scan result: " + s.scan());
		
		System.out.println();
		ComboDevice cd = new ComboDevice("2081");
		cd.processDoc("My dissertation");
		cd.print("My dissertation");
		System.out.println("Scan result: " + cd.scan());
	}
}
