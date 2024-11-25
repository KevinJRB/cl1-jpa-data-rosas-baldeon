package pe.edu.I202210236.cl1_jpa_data_rosas_baldeon.entity;

import jakarta.persistence.Embeddable;
import lombok.*;

import java.io.Serializable;

@Embeddable
@Getter
@Setter
public class CountryLanguageId implements Serializable {
    private String countryCode;
    private String language;
}
