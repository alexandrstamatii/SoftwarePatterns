<h1 style="text-align: center">Adapter Pattern</h1>
<p>The bridge pattern is a design pattern used in software engineering that is meant to "decouple an abstraction from its implementation so that the two can vary independently". The bridge uses encapsulation, aggregation, and can use inheritance to separate responsibilities into different classes.</p>

<img src="https://upload.wikimedia.org/wikipedia/commons/f/fd/W3sDesign_Bridge_Design_Pattern_UML.jpg" style="width:70%; margin-left: 20%"></img>

<p>Structures from this example:
<p>&emsp; <b>USB</b> - interface for USB devices;</p>
<p>&emsp; <b>USB_Port</b> - class for USB port where device is connected (<b><i>Client</i></b>);</p>
<p>&emsp; <b>MemoryCard</b> - class for Memory Card without USB interface plug (<b><i>Adaptee</i></b>);</p>
<p>&emsp; <b>MemoryCard_USB_Adapter</b> - class for Memory Card Adapter with a working USB interface plug (<b><i>Adapter</i></b>);</p>
<p>&emsp; <b>USB_Device</b> - class for a USB Device with USB interface plug;</p>