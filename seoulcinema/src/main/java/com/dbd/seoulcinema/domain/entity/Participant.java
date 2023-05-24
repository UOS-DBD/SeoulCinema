package com.dbd.seoulcinema.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "PARTICIPANT")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
public class Participant {

    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "PARTICIPANT_NUMBER")
    private Long ParticipantNumber;

    @Column(name = "PARTICIPANT_NAME", length = 16)
    private String participantName;

    //TODO(관계자코드)
}
