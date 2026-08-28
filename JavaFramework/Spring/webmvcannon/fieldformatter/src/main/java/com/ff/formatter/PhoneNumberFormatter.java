package com.ff.formatter;

import com.ff.form.PhoneNumber;
import org.springframework.format.Formatter;
import org.springframework.util.StringUtils;

import java.text.ParseException;
import java.util.Locale;

public class PhoneNumberFormatter implements Formatter<PhoneNumber> {
    @Override
    public PhoneNumber parse(String text, Locale locale) throws ParseException {
        PhoneNumber phoneNumber = new PhoneNumber();
        if (StringUtils.hasText(text) == true){
            phoneNumber.setCountryCode(text.length() == 12 ? text.substring(0, 2) : text.substring(0, 1));
            phoneNumber.setLineNumber(text.length() == 12 ? text.substring(2, text.length()) : text.substring(1, text.length()));
        }
        return phoneNumber;
    }

    @Override
    public String print(PhoneNumber object, Locale locale) {
        String countryCode = object.getCountryCode() !=null ? object.getCountryCode() : "";
        String lineNumber = object.getLineNumber() !=null ? object.getLineNumber() : "";

        return countryCode + lineNumber;
    }
}
