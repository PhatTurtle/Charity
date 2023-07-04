package com.charity.repository;

import com.charity.model.Lover;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface LoverRepository extends JpaRepository<Lover,Integer> {
    @Query("select o from Lover o")
    Page<Lover> getAllLoverDonate(Pageable pageable);
}
