package device;

public class PrinterDevice extends Device implements Printer{
	private String serialNumber;

	public PrinterDevice(String serialNumber) {
		super(serialNumber);
	}
	
	@Override
	public void processDoc(String doc) {
		System.out.println("Process document: " + doc);
	}
	
	@Override
	public void print(String doc) {
		System.out.println("Printed document: " + doc);
	}
}
