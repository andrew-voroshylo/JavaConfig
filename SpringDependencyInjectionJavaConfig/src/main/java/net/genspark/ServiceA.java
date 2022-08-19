package net.genspark;

public class ServiceA implements Service {
	
	  private String city = "NY";
	  private String state = "NY";
	  private String country = "US";
	  private String zipcode = "11603";

	@Override
	public String getInfo() {
		String fullInfo = "City:" + city + " State:" + state + " Country:" + country + " Zipcode: " + zipcode;
		return fullInfo;
	}	

}
