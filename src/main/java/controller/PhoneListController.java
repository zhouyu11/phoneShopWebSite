package controller;

import Service.PhoneService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/controller")
public class PhoneListController {
    PhoneService phoneService =new PhoneService();


    @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody String getPhonesList(){
        return new Gson().toJson(phoneService.getPhones());
    }
}
