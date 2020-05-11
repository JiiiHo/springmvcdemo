package me.jiho.springmvcdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EventController {

    @Autowired
    EventService eventService;
    //@RequestMapping(value = "/event", method = RequestMethod.GET)
    @GetMapping("/event")
    public String events(Model model) { //model은 map이라고 생각 key, value
        model.addAttribute("events", eventService.getEvents());
        return "events";
    }
}
