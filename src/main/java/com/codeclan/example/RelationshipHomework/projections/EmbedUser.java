package com.codeclan.example.RelationshipHomework.projections;

import com.codeclan.example.RelationshipHomework.models.Folder;
import com.codeclan.example.RelationshipHomework.models.User;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "embedUser", types = User.class)
public interface EmbedUser {

    String getName();
    List<Folder> getFolders();

}
