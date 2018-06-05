package com.bridgelabz.oops.inventory;

import java.util.List;
import java.util.ArrayList;

public class CommercialList {
	private List<CommercialPojo> stockDetails = new ArrayList<CommercialPojo>();

	public List<CommercialPojo> getStockDetails() {
		return stockDetails;
	}

	public void setStockDetails(List<CommercialPojo> stockDetails) {
		this.stockDetails = stockDetails;
	}
}
