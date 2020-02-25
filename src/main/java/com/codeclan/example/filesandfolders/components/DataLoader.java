package com.codeclan.example.filesandfolders.components;

import com.codeclan.example.filesandfolders.models.File;
import com.codeclan.example.filesandfolders.models.Folder;
import com.codeclan.example.filesandfolders.repositories.FileRepository;
import com.codeclan.example.filesandfolders.repositories.FolderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FolderRepository folderRepository;
    @Autowired
    FileRepository fileRepository;


    public DataLoader() {
    }

    public void run(ApplicationArguments args) {
        Folder folder1 = new Folder("Programming Languages");
        folderRepository.save(folder1);

        File file1 = new File("Ruby", "txt", 12, folder1);
        fileRepository.save(file1);
    }

}
