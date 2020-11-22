
public class Address 
{
	private String state; // 2 chars only!!
	private String street;
	private int zip;
	private String town;
	
	public Address(String state, String street, int zip, String town) {
		super();
		this.state = state;
		this.street = street;
		this.zip = zip;
		this.town = town;
	}

	public String getState() { return state; }
	public String getStreet() { return street; }
	public int getZip() { return zip; }
	public String getTown() { return town;  }
	public void setState(String state) { this.state = state;  }
	public void setStreet(String street) { this.street = street;  }
	public void setZip(int zip) { this.zip = zip; }
	public void setTown(String town) { this.town = town; }

	@Override
	public String toString() {
		return "Address [state=" + state + ", street=" + street + ", zip=" + zip + ", town=" + town + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		result = prime * result + ((street == null) ? 0 : street.hashCode());
		result = prime * result + ((town == null) ? 0 : town.hashCode());
		result = prime * result + zip;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Address other = (Address) obj;
		if (state == null) {
			if (other.state != null)
				return false;
		} else if (!state.equals(other.state))
			return false;
		if (street == null) {
			if (other.street != null)
				return false;
		} else if (!street.equals(other.street))
			return false;
		if (town == null) {
			if (other.town != null)
				return false;
		} else if (!town.equals(other.town))
			return false;
		if (zip != other.zip)
			return false;
		return true;
	}
	
	

}
