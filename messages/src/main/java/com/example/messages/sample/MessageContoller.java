package com.example.messages.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
public class MessageContoller {

    @Autowired
    private MessageSource messageSource;

    @RequestMapping("/messagetest")
    public String testMessage() {
        String[] args = {"A", "B", "C"};
        String message1 = messageSource.getMessage("test1", args, Locale.getDefault());

        return message1;
    }
}
