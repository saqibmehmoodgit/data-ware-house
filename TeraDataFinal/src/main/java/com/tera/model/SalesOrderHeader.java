package com.tera.model;

import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "salesorderheader")

public class SalesOrderHeader {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "businessentityid")
	long businessEntityId;
	@Column(name = "salesorderid")
	long salesOrderId;
	@Column(name = "orderdate")

	Date orderDate; /// 3 pks
	@Column(name = "shipmethodid")

	int shipMethodId;
	@Column(name = "revisionnumber")

	int revisionNumber;
	@Column(name = "duedate")

	Date dueDate;
	@Column(name = "shipdate")

	Date shipDate;
	@Column(name = "status")

	int status;
	@Column(name = "onlineorderflag")

	int onlineOrderFlag;
	@Column(name = "salesordernumber")

	int salesOrderNumber;
	@Column(name = "purchaseordernumber")

	String purchaseOrderNumber;
	@Column(name = "accountnumber")

	String accountNumber;
	@Column(name = "creditcardapprovalcode")

	String creditCardApprovalCode;
	@Column(name = "currencyrateid")

	String currencyRateId;
	@Column(name = "territoryid")

	int territoryId;
	@Column(name = "billtoaddressid")

	int billToAddressId;
	@Column(name = "shiptoaddressid")

	int shipToAddressId;

	@Column(name = "creditCardId")
	int creditcardid;
	@Column(name = "subtotal")
	int subTotal;
	@Column(name = "taxamt")
	int taxAmt;
	@Column(name = "freight")
	int freight;
	@Column(name = "totalDue")
	int totaldue;

	public long getBusinessEntityId() {
		return businessEntityId;
	}

	public void setBusinessEntityId(long businessEntityId) {
		this.businessEntityId = businessEntityId;
	}

	public long getSalesOrderId() {
		return salesOrderId;
	}

	public void setSalesOrderId(long salesOrderId) {
		this.salesOrderId = salesOrderId;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public int getShipMethodId() {
		return shipMethodId;
	}

	public void setShipMethodId(int shipMethodId) {
		this.shipMethodId = shipMethodId;
	}

	public int getRevisionNumber() {
		return revisionNumber;
	}

	public void setRevisionNumber(int revisionNumber) {
		this.revisionNumber = revisionNumber;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public Date getShipDate() {
		return shipDate;
	}

	public void setShipDate(Date shipDate) {
		this.shipDate = shipDate;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getOnlineOrderFlag() {
		return onlineOrderFlag;
	}

	public void setOnlineOrderFlag(int onlineOrderFlag) {
		this.onlineOrderFlag = onlineOrderFlag;
	}

	public int getSalesOrderNumber() {
		return salesOrderNumber;
	}

	public void setSalesOrderNumber(int salesOrderNumber) {
		this.salesOrderNumber = salesOrderNumber;
	}

	public String getPurchaseOrderNumber() {
		return purchaseOrderNumber;
	}

	public void setPurchaseOrderNumber(String purchaseOrderNumber) {
		this.purchaseOrderNumber = purchaseOrderNumber;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getCreditCardApprovalCode() {
		return creditCardApprovalCode;
	}

	public void setCreditCardApprovalCode(String creditCardApprovalCode) {
		this.creditCardApprovalCode = creditCardApprovalCode;
	}

	public String getCurrencyRateId() {
		return currencyRateId;
	}

	public void setCurrencyRateId(String currencyRateId) {
		this.currencyRateId = currencyRateId;
	}

	public int getTerritoryId() {
		return territoryId;
	}

	public void setTerritoryId(int territoryId) {
		this.territoryId = territoryId;
	}

	public int getBillToAddressId() {
		return billToAddressId;
	}

	public void setBillToAddressId(int billToAddressId) {
		this.billToAddressId = billToAddressId;
	}

	public int getShipToAddressId() {
		return shipToAddressId;
	}

	public void setShipToAddressId(int shipToAddressId) {
		this.shipToAddressId = shipToAddressId;
	}

	public int getCreditcardid() {
		return creditcardid;
	}

	public void setCreditcardid(int creditcardid) {
		this.creditcardid = creditcardid;
	}

	public int getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(int subTotal) {
		this.subTotal = subTotal;
	}

	public int getTaxAmt() {
		return taxAmt;
	}

	public void setTaxAmt(int taxAmt) {
		this.taxAmt = taxAmt;
	}

	public int getFreight() {
		return freight;
	}

	public void setFreight(int freight) {
		this.freight = freight;
	}

	public int getTotaldue() {
		return totaldue;
	}

	public void setTotaldue(int totaldue) {
		this.totaldue = totaldue;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (businessEntityId ^ (businessEntityId >>> 32));
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
		SalesOrderHeader other = (SalesOrderHeader) obj;
		if (businessEntityId != other.businessEntityId)
			return false;
		return true;
	}

}
