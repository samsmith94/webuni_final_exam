package hu.webuni.spring.exam.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.List;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@Entity
public class TransportPlan {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    BigDecimal income;

    //mi legyen itt a kapcsolat?
    //List<Section> section;
}
