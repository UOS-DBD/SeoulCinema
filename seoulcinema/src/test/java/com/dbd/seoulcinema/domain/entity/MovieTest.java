package com.dbd.seoulcinema.domain.entity;

import static org.junit.jupiter.api.Assertions.*;

import com.dbd.seoulcinema.domain.enumeration.ParticipantType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@SpringBootTest
class MovieTest {

    @PersistenceContext
    EntityManager em;

    @Test
    void builder() {

        em.persist(Participant.builder()
            .participantName("이상민")
            .participantType(ParticipantType.ACTOR)
            .build());

        em.flush();
        em.clear();

        Participant p = em.find(Participant.class, 1L);
        Assertions.assertThat(p.getParticipantType().getCode()).isEqualTo("02");

    }
}