package com.stamatii.patterns.structure.adapter;

public class USB_Port {
	
	public void connect(USB usb) {
		usb.plugIn_USB();
		System.out.println("Connecting USB Device...");
	}
	
	public void disconnect(USB usb) {
		System.out.println("Disconnecting USB Device...");
		usb.plugOut_USB();		
	}
}
