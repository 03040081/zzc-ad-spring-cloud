package com.zsc.ad.dao;

import com.zsc.ad.entity.AdUnit;
import com.zsc.ad.entity.Creative;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CreativeRepository extends JpaRepository<Creative,Long> {

}
