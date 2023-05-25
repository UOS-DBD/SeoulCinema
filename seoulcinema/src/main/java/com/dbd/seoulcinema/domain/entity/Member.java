package com.dbd.seoulcinema.domain.entity;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "MEMBER")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
public class Member {

    @Id
    @Column(name = "CLIENT_ID",length = 20)
    private String clientId;

    @Column(name = "PASSWORD",length = 64)
    private String password;

    @Column(name = "PHONE_NUMBER")
    private String phoneNumber;

    @Column(name = "POINT")
    private Long point;

    //TODO(고객 등급 코드)

    @Column(name = "BIRTH")
    private LocalDate localDate;
}
