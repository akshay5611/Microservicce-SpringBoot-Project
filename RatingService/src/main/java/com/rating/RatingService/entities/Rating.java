package com.rating.RatingService.entities;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Rating")
public class Rating {
    @Id
    @Column(name = "RATING_ID")
    private String ratingId;
    @Column(name = "USER_ID")
    private String userId;
    @Column(name = "HOTEL_ID")
    private String hotelId;
    @Column(name = "RATING")
    private int rating;
    @Column(name = "RATING_FEEDBACK")

    private String feedback;

}
