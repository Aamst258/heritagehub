package com.heritagehub.entities;

import java.util.*;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Place")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Place {
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private int id;
	private String city ;
	private String state ;
	@Column(nullable = false)
	private String name ; 
	private String visitingTime ;
	private String  virtualTourImage;
    private String mapImage;
    @Column(length = 5000)
    private String about ;
   
    @OneToMany(mappedBy = "place", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Tour> tours =  new ArrayList<>();
    @OneToMany(mappedBy = "guide")
    private List<GuidePlace> guideForPlaces = new ArrayList<>();
    @ManyToOne
    @JoinColumn(name = "guide_id")
    private Guide guide; 
    @OneToMany(mappedBy = "place")
	 private List<GuideReview> placeReviews = new ArrayList<>();

}
