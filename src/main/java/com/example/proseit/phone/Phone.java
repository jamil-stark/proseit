package com.example.proseit.phone;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.Period;

// @Entity is for hibernate, @Table is for table
@Entity
@Table
public class Phone {
    @Id
    @SequenceGenerator(
            name = "phone_sequence",
            sequenceName = "phone_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "phone_sequence"
    )
    private Long id;
    private String brand;
    private String emei;
    private String model;
    private LocalDate releaseDay;
    private Integer price;
    @Transient          // means we don't want the age to be a column in our db.
    private Integer age;


    public Phone() {
    }

    public Phone(String brand, String emei, String model, LocalDate releaseDay, Integer price) {
        this.brand = brand;
        this.emei = emei;
        this.model = model;
        this.releaseDay = releaseDay;
        this.price = price;
    }

    public Phone(Long id, String brand, String emei, String model, LocalDate releaseDay, Integer price) {
        this.id = id;
        this.brand = brand;
        this.emei = emei;
        this.model = model;
        this.releaseDay = releaseDay;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getEmei() {
        return emei;
    }

    public void setEmei(String emei) {
        this.emei = emei;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public LocalDate getReleaseDay() {
        return releaseDay;
    }

    public void setReleaseDay(LocalDate releaseDay) {
        this.releaseDay = releaseDay;
    }

    public Integer getPrice() {
        return price;
    }

    public Integer getAge() {
        return Period.between(this.releaseDay, LocalDate.now()).getYears();
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", emei='" + emei + '\'' +
                ", model='" + model + '\'' +
                ", releaseDay=" + releaseDay +
                ", price=" + price +
                ", age=" + age +
                '}';
    }
}
