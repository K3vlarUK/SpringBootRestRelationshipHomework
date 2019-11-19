package com.codeclan.example.RelationshipHomework.components;

import com.codeclan.example.RelationshipHomework.models.File;
import com.codeclan.example.RelationshipHomework.models.Folder;
import com.codeclan.example.RelationshipHomework.models.User;
import com.codeclan.example.RelationshipHomework.repositories.FileRepository;
import com.codeclan.example.RelationshipHomework.repositories.FolderRepository;
import com.codeclan.example.RelationshipHomework.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    UserRepository userRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    FileRepository fileRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args){

        User kevin = new User("Kevin");
        userRepository.save(kevin);

        Folder folder1 = new Folder("Docs", kevin);
        folderRepository.save(folder1);
        Folder folder2 = new Folder("Pictures", kevin);
        folderRepository.save(folder2);

        File file1 = new File("home", "txt", 24, folder1);
        fileRepository.save(file1);
        File file2 = new File("friends", "docx", 64, folder1);
        fileRepository.save(file2);

        File picture1 = new File("Me", "jpeg", 128, folder2);
        fileRepository.save(picture1);
        File picture2 = new File("Funny-Dog", "Gif", 256, folder2);
        fileRepository.save(picture2);

        kevin.addFolder(folder1);
        kevin.addFolder(folder2);
        userRepository.save(kevin);

        folder1.addFiles(file1);
        folder1.addFiles(file2);
        folderRepository.save(folder1);

        folder2.addFiles(picture1);
        folder2.addFiles(picture2);
        folderRepository.save(folder2);
    }
}
