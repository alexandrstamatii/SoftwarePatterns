<h1 style="text-align: center">Adapter Pattern</h1>
<p>Adapter pattern is a software design pattern (also known as wrapper, an alternative naming shared with the decorator pattern) that allows the interface of an existing class to be used as another interface. It is often used to make existing classes work with others without modifying their source code.</p>

<img src="https://upload.wikimedia.org/wikipedia/commons/d/d7/ObjectAdapter.png" style="margin-left: 30%"></img>

<p>Structures from this example:
<p>&emsp; <b>USB</b> - interface for USB devices;</p>
<p>&emsp; <b>USB_Port</b> - class for USB port where device is connected (<b><i>Client</i></b>);</p>
<p>&emsp; <b>MemoryCard</b> - class for Memory Card without USB interface plug (<b><i>Adaptee</i></b>);</p>
<p>&emsp; <b>MemoryCard_USB_Adapter</b> - class for Memory Card Adapter with a working USB interface plug (<b><i>Adapter</i></b>);</p>
<p>&emsp; <b>USB_Device</b> - class for a USB Device with USB interface plug;</p>