package com.collectionsTest;

public class Item implements Comparable<Item> {

	int aPartNumber;
	public int getaPartNumber() {
		return aPartNumber;
	}

	public void setaPartNumber(int aPartNumber) {
		this.aPartNumber = aPartNumber;
	}

	public String getaDescription() {
		return aDescription;
	}

	public void setaDescription(String aDescription) {
		this.aDescription = aDescription;
	}



	String aDescription;
	
	public Item(int aPartNumber, String aDescription) {
		this.aPartNumber = aPartNumber;
		this.aDescription = aDescription;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((aDescription == null) ? 0 : aDescription.hashCode());
		result = prime * result + aPartNumber;
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
		Item other = (Item) obj;
		if (aDescription == null) {
			if (other.aDescription != null)
				return false;
		} else if (!aDescription.equals(other.aDescription))
			return false;
		if (aPartNumber != other.aPartNumber)
			return false;
		return true;
	}

	
	
	public int compareTo(Item other) {
		// TODO Auto-generated method stub		
		return aPartNumber - other.aPartNumber;
	}

	@Override
	public String toString() {
		return "[aPartNumber=" + aPartNumber + ", aDescription="
				+ aDescription + "]";
	}
	
	

}
