package hu.webuni.spring.exam.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@Entity
public class Section {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    //mi legyen itt a kapcsolat?
    //Milestone fromMilestone;
    //Milestone toMilestone;

    Integer number;
}
