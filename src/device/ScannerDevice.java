package device;

public class ScannerDevice extends Device implements Scanner{

	public ScannerDevice(String serialNumber) {
		super(serialNumber);
	}
	
	@Override
	public void processDoc(String doc) {
		System.out.println("Document processed: " + doc);
	}
	
	@Override
	public String scan() {
		return "Document scanned!";
	}
}
