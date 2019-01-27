package com.example.messages.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.support.MessageSourceAccessor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
public class MessageContoller {

    @Autowired
    private MessageSource messageSource;

    @Autowired
    MessageSourceAccessor messageSourceAccessor;

    @RequestMapping("/messagetest")
    public String testMessage() {
        String[] args = {"A", "B", "C"};
        String message1 = messageSource.getMessage("test1", args, Locale.getDefault());
        String message2 = messageSourceAccessor.getMessage("test2", args);
        String message3 = messageSourceAccessor.getMessage("test3", args);
        String message4 = messageSourceAccessor.getMessage("test4", args);


        String temp = "test1 : " + message1 + "<br>test2 : " + message2
                + "<br>test3 : " + message3 + "<br>test4 : " + message4;

        return temp;
    }
}
