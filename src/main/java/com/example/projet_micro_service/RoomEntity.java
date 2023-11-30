package com.example.projet_micro_service;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class RoomEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numAbon;
private String nameRoom;
    @Temporal(TemporalType.DATE)
    private Date dateDebut;
    private String createdBy;

    private int NBRMember;

}
