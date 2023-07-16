package com.example.proseit.phone;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

//  This should be a spring bean.
//  We can use @Component or @Service, though the latter is preferred.
@Service
public class PhoneService {
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
