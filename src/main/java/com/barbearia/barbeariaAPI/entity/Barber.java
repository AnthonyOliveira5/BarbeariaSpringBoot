package com.barbearia.barbeariaAPI.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tb_barber")
@NoArgsConstructor
@Getter
@Setter
public class Barber {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "barberId", nullable = false, unique = true)
    @Setter(AccessLevel.NONE)
    private int barberId;

    @Column(name = "barberName", nullable = false)
    private String barberName;


    private String barberCPF;
    private String barberBirth;
    private double barberSallary;
    private String barberEmail;
    private String barberPassword;
    private String barberStatus;

}
