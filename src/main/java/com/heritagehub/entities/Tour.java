package com.heritagehub.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity 
@Table(name = "Tour")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Tour { 
     @Id	
     @GeneratedValue(strategy = GenerationType.AUTO)
	private int id; 
	 
     @ManyToOne
     @JoinColumn(name = "user_id")
     private User user;

     @ManyToOne
     @JoinColumn(name = "place_id")
     private Place place;

     @ManyToOne
     @JoinColumn(name = "guide_id") // nullable defaults to  true
     private Guide guide;
      
     @JsonFormat(pattern = "yyyy-MM-dd", shape = Shape.STRING)
     @Column(name = "booking_date")
     private String bookingDate ;

}
