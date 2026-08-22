package com.vw.view;

import com.google.common.collect.ImmutableList;
import com.lowagie.text.BadElementException;
import com.lowagie.text.Document;
import com.lowagie.text.Table;
import com.lowagie.text.pdf.PdfWriter;
import com.vw.dto.PassengersDto;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.view.document.AbstractPdfView;

import java.util.Map;

@Component("bus-passengers-pdf")
public class BusPassengerPdfView extends AbstractPdfView {
    @Override
    protected void buildPdfDocument(Map<String, Object> model,
                                    Document document,
                                    PdfWriter writer,
                                    HttpServletRequest request,
                                    HttpServletResponse response) throws Exception {

        final ImmutableList<PassengersDto> passengersDtos = (ImmutableList<PassengersDto>) model.get("passengers");
        final Table table = new Table(5);
        table.addCell("Passenger Name");
        table.addCell("Age");
        table.addCell("Gender");
        table.addCell("MobileNo");
        table.addCell("Bus Stop to Board");

        passengersDtos.forEach(passengersDto -> {
            try {
                table.addCell(passengersDto.getPassengerName());
                table.addCell(String.valueOf(passengersDto.getAge()));
                table.addCell(passengersDto.getGender());
                table.addCell(passengersDto.getMobileNo());
                table.addCell(passengersDto.getBusStopName());
            } catch (BadElementException e) {
                throw new RuntimeException(e);
            }
        });
    }
}
