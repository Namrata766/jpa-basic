package com.nam.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.nam.jpa.entity.CommercialAsset;

@Repository
public interface CommercialAssetRepository extends JpaRepository<CommercialAsset, String> {

	@Query("SELECT ca FROM CommercialAsset ca join InsightsSummary ins on ca.assetId = ins.serviceTag WHERE ca.assetId = :serviceTag")
	public CommercialAsset getCommercialAssetsForAsset(@Param("serviceTag") String serviceTag);
}
