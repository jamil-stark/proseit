package com.example.proseit.phone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/phone")
public class PhoneController {
    private final PhoneService phoneService;
    //The above declaration will not work because there is no instantiation.
    //We need to use @Autowired annotation on the constructor.

    //The class PhoneService should be a spring bean

    @Autowired
    public PhoneController(PhoneService phoneService) {
        this.phoneService = phoneService;
    }

    @GetMapping
    public List<Phone> getPhones(){
        return phoneService.getPhones();
    }


}
