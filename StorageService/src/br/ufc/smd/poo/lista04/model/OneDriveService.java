package br.ufc.smd.poo.lista04.model;

public class OneDriveService extends StorageService {

	public OneDriveService(String serviceAddress) {
		super(serviceAddress);
	}

	@Override
	public void sendFile(File file) {
		System.out.println("[ONE DRIVE] Sending file '" + file.getName() + "'...");
		System.out.println("[ONE DRIVE] File '" + file.getName() + "' sent successfully");
	}

}
