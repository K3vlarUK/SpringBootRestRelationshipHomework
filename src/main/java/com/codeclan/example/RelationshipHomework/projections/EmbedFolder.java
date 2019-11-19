package com.codeclan.example.RelationshipHomework.projections;

import com.codeclan.example.RelationshipHomework.models.File;
import com.codeclan.example.RelationshipHomework.models.Folder;
import com.codeclan.example.RelationshipHomework.models.User;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "embedFolder", types = Folder.class)
public interface EmbedFolder {

    String getTitle();
    List<File> getFiles();
    User getUser();

}
