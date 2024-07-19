package device;

public class ComboDevice extends Device implements Scanner, Printer {

	public ComboDevice(String serialNumber) {
		super(serialNumber);
	}

	@Override
	public void processDoc(String doc) {
		System.out.println("Processing document: " + doc);
	}
	
	@Override
	public String scan() {
		return "Document scanned";
	}
	
	@Override
	public void print(String doc) {
		System.out.println("Document printed: " + doc);
	}
}