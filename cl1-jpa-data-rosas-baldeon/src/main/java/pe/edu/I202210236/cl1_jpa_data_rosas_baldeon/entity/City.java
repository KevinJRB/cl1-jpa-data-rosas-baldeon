package pe.edu.I202210236.cl1_jpa_data_rosas_baldeon.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data

@Table(name = "city")
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;

    @Column(name = "Name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "CountryCode", referencedColumnName = "Code")
    private Country country;

    @Column(name = "District")
    private String district;

    @Column(name = "Population")
    private Integer population;
}
