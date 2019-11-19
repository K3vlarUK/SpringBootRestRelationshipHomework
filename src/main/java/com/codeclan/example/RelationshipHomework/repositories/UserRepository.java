package com.codeclan.example.RelationshipHomework.repositories;

import com.codeclan.example.RelationshipHomework.models.User;
import com.codeclan.example.RelationshipHomework.projections.EmbedUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = EmbedUser.class)
public interface UserRepository extends JpaRepository<User, Long> {
}
