package pe.edu.I202210236.cl1_jpa_data_rosas_baldeon.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@Table(name = "countrylanguage")



public class CountryLanguage {





    @EmbeddedId
    private CountryLanguageId id;

    @ManyToOne(cascade = CascadeType.REMOVE)
    @JoinColumn(name = "CountryCode", referencedColumnName = "Code",updatable = false, insertable = false)  // Cambiado a 'CountryCode'
    private Country country;
    @Column(name = "IsOfficial")
    private String isOfficial;

    @Column(name = "Percentage")
    private Double percentage;





}
