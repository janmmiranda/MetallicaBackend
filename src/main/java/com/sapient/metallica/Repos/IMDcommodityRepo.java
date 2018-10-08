package com.sapient.metallica.Repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sapient.metallica.Entities.MDCommodity;


public interface IMDcommodityRepo extends JpaRepository<MDCommodity, Integer>{
}
