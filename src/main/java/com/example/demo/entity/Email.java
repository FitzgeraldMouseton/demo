package com.example.demo.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
@EqualsAndHashCode(of = {"id"})
@Table(name = "email_data")
public class Email {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @Column(name = "user_id")
    @ToString.Exclude
    private User user;

    @Column(name = "email")
    private String email;

    @Column(name = "user_id", insertable = false, updatable = false)
    private Long userId;
}
