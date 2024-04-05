package com.heritagehub.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "guide_place")
@Data
public class GuidePlace {
	 @EmbeddedId
	    private GuidePlaceId id;

	    @ManyToOne
	    @JoinColumn(name = "guide_id", insertable = false, updatable = false)
	    private Guide guide;

	    @ManyToOne
	    @JoinColumn(name = "place_id", insertable = false, updatable = false)
	    private Place place;

}
