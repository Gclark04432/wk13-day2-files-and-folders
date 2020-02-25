package com.codeclan.example.filesandfolders;

import com.codeclan.example.filesandfolders.models.File;
import com.codeclan.example.filesandfolders.models.Folder;
import com.codeclan.example.filesandfolders.repositories.FileRepository;
import com.codeclan.example.filesandfolders.repositories.FolderRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FilesandfoldersApplicationTests {
	@Autowired
	FileRepository fileRepository;

	@Autowired
	FolderRepository folderRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void canAddFile(){
		Folder folder1 = new Folder("Programming Languages");
		folderRepository.save(folder1);

		File file1 = new File("Ruby", "txt", 12, folder1);
		fileRepository.save(file1);
	}

}
