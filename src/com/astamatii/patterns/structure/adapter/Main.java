package com.astamatii.patterns.structure.adapter;

public class Main {

	public static void main(String[] args) {
		MemoryCard memCard = new MemoryCard();
		MemoryCard_USB_Adapter memCardAdapter = new MemoryCard_USB_Adapter(memCard);
		USB_Device usbDevice = new USB_Device();
		USB_Port usbPort = new USB_Port();
		
		System.out.println("Connecting a real USB device into USB port: ");
		usbPort.connect(usbDevice);
		usbPort.disconnect(usbDevice);
		
		System.out.println("\nConnecting a memory card through its adapter into USB port:");
//		usbPort.connect(memCard); !!! Compile-Time ERROR when connecting directly
		usbPort.connect(memCardAdapter);
		usbPort.disconnect(memCardAdapter);
	}

}
