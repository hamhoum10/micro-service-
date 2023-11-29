package esprit.tn.events.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUser;
    private String name;

    @JsonIgnore
    @OneToMany(mappedBy = "bannedUser")
    private List<Ban> bans;

    @JsonIgnore
    @OneToMany(mappedBy = "reportedUser")
    private List<Report> reports;

    //for testing purposes
    @JsonIgnore
    @ManyToMany
    private List<Room> userInroom;
}
