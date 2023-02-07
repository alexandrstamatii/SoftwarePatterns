package com.stamatii.patterns.structure.adapter;

public class USB_Device implements USB_Interface {

	@Override
	public void plugIn_USB() {
		System.out.println("USB Device is plugged in");
	}

	@Override
	public void plugOut_USB() {
		System.out.println("USB Device is unplugged");		
	}

}
