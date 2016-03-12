package com.khyzhun.sasha.server.controller;

import com.khyzhun.sasha.server.entity.Remind;
import com.khyzhun.sasha.server.repository.RemindRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/reminder")
public class ReminderController {

    @Autowired
    private RemindRepository remindRepository;

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @ResponseBody
    public Remind getReminder() {
        List<Remind> list = remindRepository.findAll();
        return createMockRemid();
    }

    private Remind createMockRemid() {
        Remind remind = new Remind();
        remind.setId(1);
        remind.setRemindDate(new Date());
        remind.setTitle("My first remind");

        return remind;
    }

}