package com.example.proseit.phone;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

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
