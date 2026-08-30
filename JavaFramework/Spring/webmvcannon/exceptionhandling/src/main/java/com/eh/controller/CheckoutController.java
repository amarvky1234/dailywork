package com.eh.controller;

import com.eh.dto.OrderConfirmationDto;
import com.eh.exception.InsufficientFundException;
import com.eh.form.CheckoutForm;
import com.eh.service.PaymentService;
import com.eh.validator.CheckoutFormValidator;
import lombok.AllArgsConstructor;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.security.SecureRandom;
import java.time.LocalDateTime;
import java.util.Locale;
import java.util.UUID;

@Controller
@AllArgsConstructor
public class CheckoutController {
    private final CheckoutFormValidator checkoutFormValidator;
    private final PaymentService paymentService;
    //private final MessageSource messageSource;

    @GetMapping("/checkout.htm")
    public String setupForm(Model model){
        CheckoutForm form = new CheckoutForm();
        model.addAttribute("checkoutForm", form);
        return "checkout";
    }

    @PostMapping("/checkout.htm")
    public String pay(@ModelAttribute("checkoutForm") CheckoutForm checkoutForm, BindingResult errors, Model model){
        if (checkoutFormValidator.supports(CheckoutForm.class)){
            checkoutFormValidator.validate(checkoutForm, errors);
        }
        if (errors.hasErrors()){
            return "checkout";
        }

        double amount = new SecureRandom().nextDouble(10000);
        String orderId = paymentService.processPayment(amount);

        OrderConfirmationDto orderConfirmationDto = new OrderConfirmationDto();
        orderConfirmationDto.setOrderId(UUID.randomUUID().toString().substring(1, 8));
        orderConfirmationDto.setPaymentAmount(amount);
        orderConfirmationDto.setPaymentDate(LocalDateTime.now());

        model.addAttribute("orderConfirmation", orderConfirmationDto);
        return "order-confirmation";
    }

   /* @ExceptionHandler({InsufficientFundException.class})
    public ModelAndView handleInsufficientFundException(InsufficientFundException e, Locale locale){
        final ModelAndView modelAndView = new ModelAndView("error");
        modelAndView.addObject("errorMessage", messageSource.getMessage("insufficientFund.message", null, locale));
        return modelAndView;
    }*/
}
