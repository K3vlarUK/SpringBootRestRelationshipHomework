package com.codeclan.example.RelationshipHomework.repositories;

import com.codeclan.example.RelationshipHomework.models.File;
import com.codeclan.example.RelationshipHomework.projections.EmbedFile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = EmbedFile.class)
public interface FileRepository extends JpaRepository<File, Long> {
}
