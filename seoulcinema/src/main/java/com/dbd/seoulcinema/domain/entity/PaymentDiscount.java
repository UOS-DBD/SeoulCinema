package com.dbd.seoulcinema.domain.entity;

import com.dbd.seoulcinema.domain.PaymentDiscountId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "PAYMENT_DISCOuNT")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Getter
@IdClass(PaymentDiscountId.class)
public class PaymentDiscount {

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PAYMENT_NUMBER")
    private Payment payment;

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "DISCOUNT_NUMBER")
    private Discount discount;
}
