package com.example.stockspring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name="stockexchange")
public class StockExchange {
	
@Id
@Column(name="stockexchange_id")
private int stockExchangeId;

@NotEmpty(message="please enter stockExchange")
@Column(name="stockexchange_name")
private String stockExchanges;
	
@Column(name="brief")
private String brief;

@Column(name="contactaddress")
private String address;

@Column(name="remarks")
private String remarks;

public int getStockExchangeId() {
	return stockExchangeId;
}
public void setStockExchangeId(int stockExchangeId) {
	this.stockExchangeId = stockExchangeId;
}
public String getStockExchanges() {
	return stockExchanges;
}
public void setStockExchanges(String stockExchanges) {
	this.stockExchanges = stockExchanges;
}
public String getBrief() {
	return brief;
}
public void setBrief(String brief) {
	this.brief = brief;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getRemarks() {
	return remarks;
}
public void setRemarks(String remarks) {
	this.remarks = remarks;
}


}
