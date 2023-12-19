package com.fsantana.fileuploadtest.infra.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fsantana.fileuploadtest.domain.entity.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
