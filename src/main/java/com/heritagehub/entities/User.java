 package com.heritagehub.entities;


import jakarta.persistence.Basic;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

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
@Table(name = "User")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class User { 
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
     private int id ; 
	@Column(nullable = false)
     private String name ;
     private String password ;
     @Lob
     @Basic(fetch = FetchType.LAZY)
     private byte[] image ;
     private String gender ;
     @Column(unique = true)
     private String email;   
     private String phoneNum ;
     @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
     private List<Tour> tours = new ArrayList<>(); 
     @OneToMany(mappedBy = "user")
     private List<GuideReview> guideReviews = new ArrayList<>();
     @OneToMany(mappedBy = "user")
     private List<PlaceReview> placeReviews = new ArrayList<>();
}
