package com.example.proseit.phone;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/phone")
public class PhoneController {
    
    @GetMapping
    public List<Phone> getPhones() {
        return List.of(
                new Phone(
                        1L,
                        "Samsung",
                        "SJSG4909495",
                        "S10",
                        LocalDate.of(2017, Month.JUNE, 21),
                        500000
                )
        );
    }
}
