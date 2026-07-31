package com.wwa.api;

import com.wwa.dto.Parcel;
import com.wwa.dto.Receipt;
import jakarta.ws.rs.Path;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;

import java.io.InputStream;
import java.io.StringWriter;

@Path("/xml/parcel")
public class ParcelXmlApiService extends AbstractParcelApiService{
    @Override
    protected Parcel buildParcel(InputStream in) throws Throwable {
        JAXBContext jaxbContext = JAXBContext.newInstance(Parcel.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

        Parcel parcel = (Parcel) unmarshaller.unmarshal(in);

        return parcel;
    }

    @Override
    protected String toReceipt(Receipt receipt) throws Throwable {
        JAXBContext jaxbContext = JAXBContext.newInstance(Receipt.class);
        Marshaller marshaller = jaxbContext.createMarshaller();

        StringWriter sw = new StringWriter();
        marshaller.marshal(receipt, sw);

        return sw.toString();
    }
}
