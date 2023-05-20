package br.ufc.smd.poo.lista04.app;

import java.util.Date;

import br.ufc.smd.poo.lista04.model.*;

public class AppStorage {

	public static void main(String [] args) {
		// TODO Auto-generated method stub
		File myFile = new File("myFile", "C:\\Downloads\\myFile", 120, new Date());
		
		GoogleDriveService google = new GoogleDriveService("https://drive.google.com/");
		google.sendFile(myFile);
		
		System.out.println("");
		
		OneDriveService onedrive = new OneDriveService("https://onedrive.live.com/");
		onedrive.sendFile(myFile);
		
		System.out.println("");
		
		FTPService ftp = new FTPService("https://www.wftpserver.com/");
		ftp.sendFile(myFile);
	}

}
