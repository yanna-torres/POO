package br.ufc.smd.poo.lista04.model;

public class FTPService extends StorageService {

	public FTPService(String serviceAddress) {
		super(serviceAddress);
	}

	@Override
	public void sendFile(File file) {
		System.out.println("[FTP] Sending file '" + file.getName() + "'...");
		System.out.println("[FTP] File '" + file.getName() + "' sent successfully");
	}

}
