package com.example.proseit.phone;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//We should specify T, type of object we want to work with amd the id for the type we want.
// Used type Student, and id's type for Student was a Long.
@Repository
public interface PhoneRepository extends JpaRepository<Phone, Long> {

}
