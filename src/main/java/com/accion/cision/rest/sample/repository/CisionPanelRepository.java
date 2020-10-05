package com.accion.cision.rest.sample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.accion.cision.rest.sample.entity.CisionPanelEntity;


@Repository
public interface CisionPanelRepository extends JpaRepository<CisionPanelEntity,Long> {

}
