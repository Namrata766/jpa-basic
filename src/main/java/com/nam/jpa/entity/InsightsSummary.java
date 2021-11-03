package com.nam.jpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "TABLE2", schema = "SCHEMA2")
public class InsightsSummary {
	
	@Id
	@Column(name = "SERVICE_TAG")
	private String serviceTag;

	//@ManyToOne(fetch = FetchType.LAZY)
	//@JoinColumn(name = "SERVICE_TAG", referencedColumnName = "ASSET_ID", insertable = false, updatable = false)
	//private CommercialAsset commercialAsset;
	
}
