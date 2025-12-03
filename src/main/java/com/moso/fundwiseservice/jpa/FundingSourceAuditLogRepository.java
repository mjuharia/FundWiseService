package com.moso.fundwiseservice.jpa;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.moso.fundwiseservice.entity.FundingSourceAuditLog;
import com.moso.fundwiseservice.entity.FundingSourceAuditLogID;

public interface FundingSourceAuditLogRepository extends JpaRepository<FundingSourceAuditLog, FundingSourceAuditLogID> {
	@Query(value="SELECT al.* "
			+ "FROM "
			+ "customer.funding_source_auditlog al "		
			+ "where al.built_sourceid = :builtSourceID"
			+ "order by al.built_sourceid, al.version desc limit 1", nativeQuery=true)
	FundingSourceAuditLog findLastFundingSourceVersion(int builtSourceID);
	
}
