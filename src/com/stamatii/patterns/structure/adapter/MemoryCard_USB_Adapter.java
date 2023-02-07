package com.stamatii.patterns.structure.adapter;

public class MemoryCard_USB_Adapter implements USB {

	private MemoryCard memoryCard;
	
	private MemoryCard_USB_Adapter() {}
	
	public MemoryCard_USB_Adapter(MemoryCard memoryCard) {
		this.memoryCard = memoryCard;
	}
	
	@Override
	public void plugIn_USB() {
		memoryCard.plugIn_MemoryCard();
	}

	@Override
	public void plugOut_USB() {
		memoryCard.plugOut_MemoryCard();
	}
}
