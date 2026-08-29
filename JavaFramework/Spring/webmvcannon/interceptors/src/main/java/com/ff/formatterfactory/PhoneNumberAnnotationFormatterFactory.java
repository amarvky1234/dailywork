package com.ff.formatterfactory;

import com.ff.form.PhoneNumber;
import com.ff.formatter.PhoneNumberFormatter;
import com.ff.formatter.annotation.PhoneNumberFormat;
import org.springframework.format.AnnotationFormatterFactory;
import org.springframework.format.Parser;
import org.springframework.format.Printer;

import java.util.Set;

public class PhoneNumberAnnotationFormatterFactory implements AnnotationFormatterFactory<PhoneNumberFormat> {
    @Override
    public Set<Class<?>> getFieldTypes() {
        return Set.of(PhoneNumber.class);
    }

    @Override
    public Printer<?> getPrinter(PhoneNumberFormat annotation, Class<?> fieldType) {
        if (fieldType.isAssignableFrom(PhoneNumber.class)){
            return new PhoneNumberFormatter();
        }
        return null;
    }

    @Override
    public Parser<?> getParser(PhoneNumberFormat annotation, Class<?> fieldType) {
        if (fieldType.isAssignableFrom(PhoneNumber.class)){
            return new PhoneNumberFormatter();
        }
        return null;
    }
}
