package com.eh.controller;

import com.eh.exception.InsufficientFundException;
import lombok.AllArgsConstructor;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import java.util.Locale;

@ControllerAdvice
@AllArgsConstructor
public class GlobalResponseExceptionController {
    private final MessageSource messageSource;

    @ExceptionHandler({InsufficientFundException.class})
    public ModelAndView handleInsufficientFundException(InsufficientFundException e, Locale locale){
        final ModelAndView modelAndView = new ModelAndView("error");
        modelAndView.addObject("errorMessage", messageSource.getMessage("insufficientFund.message", null, locale));
        return modelAndView;
    }
}
