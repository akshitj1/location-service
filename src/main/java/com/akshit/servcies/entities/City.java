package com.akshit.servcies.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Data
@Table(name = "city")
public class City implements Serializable {
    @Id
    private Integer id;
    String city;
    String state;
}
