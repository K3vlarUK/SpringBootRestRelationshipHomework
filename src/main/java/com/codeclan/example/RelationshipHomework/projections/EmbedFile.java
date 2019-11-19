package com.codeclan.example.RelationshipHomework.projections;

import com.codeclan.example.RelationshipHomework.models.File;
import com.codeclan.example.RelationshipHomework.models.Folder;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "embedFile", types = File.class)
public interface EmbedFile {

    String getFileName();
    String getFileExtension();
    int getFileSize();
    Folder getFolder();

}
