package com.example.proseit;

import com.example.proseit.phone.Phone;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
@RestController
public class ProseitApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProseitApplication.class, args);
	}

	@GetMapping
	public List <Phone> hello() {
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
