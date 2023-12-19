package com.fsantana.fileuploadtest.infra.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fsantana.fileuploadtest.domain.entity.FileReference;

public interface FileReferenceRepository extends JpaRepository<FileReference, Long> {

}
