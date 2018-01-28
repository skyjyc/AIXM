package com.aixm.mashallerService;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import com.aixm.bean.*;
import com.cfar.swim.aixm.bind.AixmMarshaller;
import aero.aixm.*;

@javax.jws.WebService(targetNamespace = "http://mashallerService.aixm.com/", serviceName = "AirportHeliportMashallerService", portName = "AirportHeliportMashallerPort", wsdlLocation = "WEB-INF/wsdl/AirportHeliportMashallerService.wsdl")

public class AirportHeliportMashallerDelegate {

	com.aixm.mashallerService.AirportHeliportMashaller airportHeliportMashaller = new com.aixm.mashallerService.AirportHeliportMashaller();

	public String AirporHeliportMashallerMethod(String designator) {
		return airportHeliportMashaller.AirporHeliportMashallerMethod(designator);
	}

}