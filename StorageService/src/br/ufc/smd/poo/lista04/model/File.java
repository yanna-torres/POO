package br.ufc.smd.poo.lista04.model;

import java.util.Date;

public class File {
	private String name;
	private String localAddress;
	private long size;
	private Date modificationDate;
	
	public File(String name, String localAddress,long size, Date modificationDate) {
		super();
		this.name = name;
		this.localAddress = localAddress;
		this.size = size;
		this.modificationDate = modificationDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocalAddress() {
		return localAddress;
	}

	public void setLocalAddress(String localAddress) {
		this.localAddress = localAddress;
	}

	public long getSize() {
		return size;
	}

	public void setSize(long size) {
		this.size = size;
	}

	public Date getModificationDate() {
		return modificationDate;
	}

	public void setModificationDate(Date modificationDate) {
		this.modificationDate = modificationDate;
	}
	
	public void showInfo() {
		System.out.println("[FILE] " + this + " information:");
		System.out.println("        name: " + this.name);
		System.out.println("        size: " + this.size);
		System.out.println("        modification date: " + this.modificationDate);
	}
	
	@Override
	public String toString() {
		return this.name;
	}
}
