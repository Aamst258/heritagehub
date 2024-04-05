package com.heritagehub.entities;

import com.fasterxml.jackson.annotation.JsonFormat;

import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import java.util.*;

import jakarta.persistence.Basic;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Guide") 
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Guide { 
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(nullable = false)
	private String name ;
	@Column(unique = true) 
	private String email ; 
	private String password ;
	@Lob
    @Basic(fetch = FetchType.LAZY)
    private byte[] image ; 
	private String qualification;
	@ElementCollection
    private List<String> languages;
	@ElementCollection
    private List<String> placesknown ;
	@OneToMany(mappedBy = "guide", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Tour> tours = new ArrayList<>(); 
	@OneToMany(mappedBy = "guide", cascade = CascadeType.ALL, fetch = FetchType.LAZY )
    private List<GuidePlace> guideForPlaces =  new ArrayList<>();
	@OneToMany(mappedBy = "guide")
    private List<Place> places = new ArrayList<>();
	 @OneToMany(mappedBy = "guide")
	 private List<GuideReview> guideReviews = new ArrayList<>();
}
