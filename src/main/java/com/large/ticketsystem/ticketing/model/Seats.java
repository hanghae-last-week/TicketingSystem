package com.large.ticketsystem.ticketing.model;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@NoArgsConstructor
@Entity
public class Seats {
    @Id @GeneratedValue
    private Long seatId;
    private Long showId; //todo show - 연관관계로 바꿔주기
    private String seatNum;

    public Seats(Long showId, String seatNum) {
        this.showId = showId;
        this.seatNum = seatNum;
    }

}