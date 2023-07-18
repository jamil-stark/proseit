package com.example.proseit.phone;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.JUNE;
import static java.time.Month.MAY;

//      Create a class, PhoneConfig annotated with @Configuration
//      Create an instance of CommandlineRunner annotated with @Bean. Inject PhoneRepository
//      Return args where the instances of phone objects are made without id because we already have that
//      Invoke our repository of Type PhoneRepository with a method saveAll() having an argument List.of(objects we want to save to database)

@Configuration
public class PhoneConfig {
    @Bean
        CommandLineRunner commandLineRunner(PhoneRepository repository){
          return args ->   {
              Phone s10 = new Phone(
                      "Samsung",
                      "SJSG4909495",
                      "S10",
                      LocalDate.of(2017, JUNE, 21),
                      500000
              );

              Phone pop2 = new Phone(
                      "Techno",
                      "TCH653YYE89",
                      "POP2",
                      LocalDate.of(2012, MAY, 1),
                      230000
              );

              repository.saveAll(
                      List.of(s10, pop2)
              );
          };
        }
}
