package com.accion.cision.rest.sample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.accion.cision.rest.sample.entity.CisionPanelEntity;

/**
 * @author al3211
 *
 */
@Repository
public interface CisionPanelRepository extends JpaRepository<CisionPanelEntity, Long> {

	/**
	 * @param email
	 * @param password
	 * @return
	 */
	@Query("SELECT u from CisionPanelEntity u  where u.email = :email and u.password = :password")
	CisionPanelEntity findUser(@Param("email")String email,@Param("password")String password);
}
