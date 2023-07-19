package com.example.proseit.phone;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

//We should specify T, type of object we want to work with amd the id for the type we want.
// Used type Student, and id's type for Student was a Long.
@Repository
public interface PhoneRepository extends JpaRepository<Phone, Long> {

    // The line below will generate a query which is SELECT * FROM phone WHERE emei = ?
//    @Query("SELECT p FROM phone p WHERE p.emei = ?1")
    Optional<Phone> findPhoneByEmei(String emei);
}
