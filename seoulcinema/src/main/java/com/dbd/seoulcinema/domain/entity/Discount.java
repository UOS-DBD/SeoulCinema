package com.dbd.seoulcinema.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "DISCOUNT")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Getter
public class Discount {

    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long discountNumber;

    //TODO(할인코드)

    @Column(name = "DISCOUNT_PRICE")
    private String discountPrice;
}
