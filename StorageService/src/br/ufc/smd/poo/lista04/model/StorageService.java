package br.ufc.smd.poo.lista04.model;

public abstract class StorageService {
	private String serviceAddress;
	
	public StorageService(String serviceAddress) {
		super();
		this.serviceAddress = serviceAddress;
	}

	public String getServiceAddress() {
		return serviceAddress;
	}

	public void setServiceAddress(String serviceAddress) {
		this.serviceAddress = serviceAddress;
	}

	public abstract void sendFile(File file);

}
