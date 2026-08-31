package com.bookstore.controller;

import com.bookstore.dto.AuthorDto;
import com.bookstore.form.AuthorForm;
import com.bookstore.service.AuthorService;
import com.bookstore.validator.AuthorFormValidator;
import com.google.common.collect.ImmutableList;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.DataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.security.SecureRandom;

@Controller
@AllArgsConstructor
public class AuthorController {
    private final AuthorService authorService;
    private final AuthorFormValidator authorFormValidator;

    @InitBinder
    public void initBinder(DataBinder dataBinder){
        dataBinder.addValidators(authorFormValidator);
    }

    @GetMapping("/authors")
    public String listAuthors(Model model){
        final ImmutableList<AuthorDto> authorDtos = authorService.getAuthors();
        model.addAttribute("authors", authorDtos);
        return "list-authors";
    }

    @GetMapping("/newAuthor")
    public String newAuthor(Model model){
        model.addAttribute("authorForm", new AuthorForm());
        return "new-author";
    }

    @PostMapping("/newAuthor")
    public String saveAuthor(@ModelAttribute("authorForm") @Valid AuthorForm authorForm, BindingResult bindingResult, Model model){

        if(bindingResult.hasErrors()){
            return "new-author";
        }

        final AuthorDto dto = AuthorDto.of().authorId(new SecureRandom().nextInt(9999999))
                .fullName(authorForm.getFullName())
                .dob(authorForm.getDob())
                .gender(authorForm.getGender())
                .contactNo(authorForm.getContactNo())
                .emailAddress(authorForm.getEmailAddress()).build();
        authorService.saveAuthor(dto);

        return "redirect:authors";
    }
}
