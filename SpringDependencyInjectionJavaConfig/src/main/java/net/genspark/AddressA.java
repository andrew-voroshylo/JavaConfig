package net.genspark;

public class AddressA implements Address {
	
	private Service service;
	
	public AddressA(Service service) {
		this.service = service;
	}

	@Override
	public void findAddress() {
		String info = service.getInfo();
		System.out.println(info);	

	}

}
