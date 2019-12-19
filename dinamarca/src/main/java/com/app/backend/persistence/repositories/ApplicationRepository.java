package com.app.backend.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.backend.persistence.domain.Application;

@Repository
public interface ApplicationRepository  extends JpaRepository <Application, Integer> {

}
