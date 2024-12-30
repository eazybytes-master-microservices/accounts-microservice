package com.angeltravieso.accounts.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@ToString
//@Table(name = "customer")
public class Customer extends BaseEntity {

    /**
     * @GeneratedValue deja la responsabilidad al framework para
     * incrementar el indice de la llave primaria
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    private Long customerId;

    private String name;

    private String email;

    /**
     * @Column para indicar el nombre del campo de la tabla
     * si este varia del nombre de propiedad en Java
     */
    @Column(name = "mobile_number")
    private String mobileNumber;
}
