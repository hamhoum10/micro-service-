package esprit.tn.events.entities;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

import java.io.Serializable;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Ban implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBan;

    private Instant banStartTime = Instant.now() ;

    private LocalDate  banExpDate ;


    private String reason;

    //el user eli klé el ban
    @ManyToOne
    private User bannedUser;

    //id mta room eli klé  fiha ban wala room me8ir relation ma table / wala direct mel user nodhklou lel room id
    //private Room room;

}
