/* Rida Abdulwasay 
CIS 35A Section 00450
Assignment 3 
Due: 2/14/20
Submitted: 2/14/20 */

public class Franchise { //Franchise contains stores
	private Store stores[]; 
	
	public Franchise(int num) {
			stores = new Store[num];
	}

	public Store getStores(int i) {
		return stores[i];
	}

	public void setStores(Store stores, int i) {
		this.stores[i] = stores;
	}
	public int numberofstores()
	{
		return stores.length;
	}
	
}
