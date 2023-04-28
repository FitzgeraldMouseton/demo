package com.example.demo.entity;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
@EqualsAndHashCode(of = {"id"})
public class Account extends BaseEntity {

    @OneToOne(fetch = FetchType.LAZY)
    @Column(name = "user_id")
    @ToString.Exclude
    private User user;

    @Column(name = "balance")
    private BigDecimal balance;

    @Column(name = "user_id", insertable = false, updatable = false)
    private Long userId;

}
