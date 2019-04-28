package com.zzc.ad.dao;

import com.zzc.ad.entity.AdUnit;
import com.zzc.ad.entity.Creative;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CreativeRepository extends JpaRepository<Creative,Long> {

}
