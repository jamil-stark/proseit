package com.example.proseit.phone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public void addNewPhone(Phone phone) {
        // For the moment let us just print the phone in console
        Optional<Phone> phoneOptional = phoneRepository.findPhoneByEmei(phone.getEmei());
        if (phoneOptional.isPresent()){
            throw new IllegalStateException("EMEI already exists");

        }
        phoneRepository.save(phone);
    }

    public void deletePhone(Long phoneId) {
        boolean exists = phoneRepository.existsById(phoneId);
        if (!exists){
            throw new IllegalStateException("Student with " + phoneId + " doesn't exist");
        }
        phoneRepository.deleteById(phoneId);
    }
}
