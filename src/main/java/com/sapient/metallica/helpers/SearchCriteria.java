package com.sapient.metallica.helpers;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.data.jpa.domain.Specification;

import com.sapient.metallica.Entities.TradeEntity;

public class SearchCriteria {
	private Date startDate;
	private Date endDate;
	private String commodity;
	private String counterParty;
	private String location;
	private Boolean side;
	
	public SearchCriteria() { super(); }

	public SearchCriteria(Date startDate, Date endDate, String commodity, String counterParty, String location,
			Boolean side) {
		super();
		this.startDate = startDate;
		this.endDate = endDate;
		this.commodity = commodity;
		this.counterParty = counterParty;
		this.location = location;
		this.side = side;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getCommodity() {
		return commodity;
	}

	public void setCommodity(String commodity) {
		this.commodity = commodity;
	}

	public String getCounterParty() {
		return counterParty;
	}

	public void setCounterParty(String counterParty) {
		this.counterParty = counterParty;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Boolean getSide() {
		return side;
	}

	public void setSide(Boolean side) {
		this.side = side;
	}
	
	@SuppressWarnings("serial")
	public static Specification<TradeEntity> searchSpec(SearchCriteria sc) {
		return new Specification<TradeEntity>() {

			@Override
			public Predicate toPredicate(Root<TradeEntity> root, 
									 	 CriteriaQuery<?> query,
									 	 CriteriaBuilder criteriaBuilder) {
				List<Predicate> predicates = new ArrayList<Predicate>();
				
				if(sc.getCommodity() != null) {
					predicates.add(criteriaBuilder.equal(root.get("commodity"), sc.getCommodity()));
				}
				
				if(sc.getLocation() != null) {
					predicates.add(criteriaBuilder.equal(root.get("location"), sc.getLocation()));
				}
				
				if(sc.getCounterParty() != null) {
					predicates.add(criteriaBuilder.equal(root.get("counterParty"), sc.getCounterParty()));
				}
				
				if(sc.getSide() != null) {
					predicates.add(criteriaBuilder.equal(root.get("side"), sc.getSide()));
				}
				
				if(sc.getStartDate() != null && sc.getEndDate() != null) {
					predicates.add(criteriaBuilder.between(root.get("date"), sc.getStartDate(), sc.getEndDate()));
				}
				
				return criteriaBuilder.and(predicates.toArray(new Predicate[] {}));
			}
			
		};
	
	}

}
