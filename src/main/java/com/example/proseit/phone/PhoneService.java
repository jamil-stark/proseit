package com.example.proseit.phone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

//  This should be a spring bean.
//  We can use @Component or @Service, though the latter is preferred.
@Service
public class PhoneService {
    // Instead of using the static list, we use the instance.findAll()

    private final PhoneRepository phoneRepository;

    @Autowired
    public PhoneService(PhoneRepository phoneRepository) {
        this.phoneRepository = phoneRepository;
    }


    public List<Phone> getPhones() {
        return phoneRepository.findAll();
    }
}
