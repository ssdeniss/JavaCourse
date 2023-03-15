package com.denis.course.Hibernate.Connections.OneToOne.Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "details")
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Detail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "city")
    private String city;
    @Column(name = "phone_number")
    private String phoneNumber;
    @Column(name = "email")
    private String email;

    @OneToOne(mappedBy = "empDetail", cascade = CascadeType.ALL)
    private Employee employee;

    public Detail(String city, String phoneNumber, String email) {
        this.city = city;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
}
