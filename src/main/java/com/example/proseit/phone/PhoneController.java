package com.example.proseit.phone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/phone")
public class PhoneController {
    private final PhoneService phoneService;
    //The above declaration would not work because there is no instantiation.
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

    // A method is defined registerNewPhone() having a Phone parameter.
    // Parameters of the above method are annotated with @RequestBody
    // A method is defined in phoneService and is invoked here in our method that was annotated by @PostMapping
    // We are taking the request from request body hence the annotation

    @PostMapping
    public void registerNewPhone(@RequestBody Phone phone){
        phoneService.addNewPhone(phone);
    }

}
