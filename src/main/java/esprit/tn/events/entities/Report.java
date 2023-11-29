package esprit.tn.events.entities;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;


@Getter
@Setter
@NoArgsConstructor
@Entity
public class Report implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private Instant reportTime = Instant.now();

    private String description;


    @ManyToOne
    private User reportedUser;



}
