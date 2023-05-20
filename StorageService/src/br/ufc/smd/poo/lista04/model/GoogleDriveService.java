package br.ufc.smd.poo.lista04.model;

public class GoogleDriveService extends StorageService {

	public GoogleDriveService(String serviceAddress) {
		super(serviceAddress);
	}

	@Override
	public void sendFile(File file) {
		System.out.println("[GOOGLE DRIVE] Sending file '" + file.getName() + "'...");
		System.out.println("[GOOGLE DRIVE] File '" + file.getName() + "' sent successfully");
	}

}
