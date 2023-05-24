package com.dbd.seoulcinema.domain.entity;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "PAYMENT")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Getter
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "PAYMENT_NUMBER", length = 36)
    private String paymentNumber;

    @Column(name = "PAYMENT_PRICE")
    private Long paymentPrice;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TICKET_NUMBER")
    private Ticket ticket;

    @Column(name = "PAYMENT_DATE")
    private LocalDate paymentDate;

    @Column(name = "BANK_NAME", length = 14)
    private String bankName;

    @Column(name = "PAYMENT_APPROVE_NUMBER",length = 36)
    private String paymentApproveNumber;

    //TODO(결제구분코드)
}
