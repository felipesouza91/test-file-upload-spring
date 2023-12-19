package com.fsantana.fileuploadtest.domain.entity;

import java.time.OffsetDateTime;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "file_reference")
public class FileReference {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "file_name")
  private String fileName;

  @Column(name = "original_file_name")
  private String originalFileName;

  @Column(name = "content_type")
  private String contentType;

  private boolean temp = true;

  @CreationTimestamp
  @Column(name = "created_at")
  private OffsetDateTime createdAt;
}
