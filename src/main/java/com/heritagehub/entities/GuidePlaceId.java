package com.heritagehub.entities;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Table(name = "guide_place_id")
@Embeddable
public class GuidePlaceId  implements Serializable{ 
	private static final long serialVersionUID = 1L ;  //1L is arbitary value
	@Column(name = "place_id")
   private int placeId ;
    
	@Column(name = "guide_id")
   private int guideId;
}
