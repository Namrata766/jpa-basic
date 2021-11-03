package com.nam.jpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "TABLE1", schema = "SCHEMA1")
public class CommercialAsset {

	@Id
	@Column(name = "ASSET_ID")
	private String assetId;
	
	@Column(name = "ACCNT_ID")
	private Long accountId;
	
	//@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "commercialAsset")
	//private List<InsightsSummary> insightsSummary;
}
