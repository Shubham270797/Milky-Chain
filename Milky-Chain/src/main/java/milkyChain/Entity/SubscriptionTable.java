package milkyChain.Entity;
// Generated Mar 25, 2022 9:17:47 PM by Hibernate Tools 3.5.0.Final

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * SubscriptionTable generated by hbm2java
 */
@Entity
@Table(name = "subscription_table", catalog = "milk_management")
public class SubscriptionTable implements java.io.Serializable {

	private Integer subscriptionId;
	private CustomerInfoTable customerInfoTable;
	private MilkProductionTable milkProductionTable;
	private SupplierInfoTable supplierInfoTable;
	private Date subscriptionStartDate;
	private Date subscriptionEndDate;
	private String subscriptionStatus;
	private int milkQuantityLtr;
	private List<NonDeliverRecord> nonDeliverRecords;

	public SubscriptionTable() {
	}

	public SubscriptionTable(CustomerInfoTable customerInfoTable, MilkProductionTable milkProductionTable,
			SupplierInfoTable supplierInfoTable, Date subscriptionStartDate, Date subscriptionEndDate,
			String subscriptionStatus, int milkQuantityLtr) {
		this.customerInfoTable = customerInfoTable;
		this.milkProductionTable = milkProductionTable;
		this.supplierInfoTable = supplierInfoTable;
		this.subscriptionStartDate = subscriptionStartDate;
		this.subscriptionEndDate = subscriptionEndDate;
		this.subscriptionStatus = subscriptionStatus;
		this.milkQuantityLtr = milkQuantityLtr;
	}

	public SubscriptionTable(CustomerInfoTable customerInfoTable, MilkProductionTable milkProductionTable,
			SupplierInfoTable supplierInfoTable, Date subscriptionStartDate, Date subscriptionEndDate,
			String subscriptionStatus, int milkQuantityLtr, List<NonDeliverRecord> nonDeliverRecords) {
		this.customerInfoTable = customerInfoTable;
		this.milkProductionTable = milkProductionTable;
		this.supplierInfoTable = supplierInfoTable;
		this.subscriptionStartDate = subscriptionStartDate;
		this.subscriptionEndDate = subscriptionEndDate;
		this.subscriptionStatus = subscriptionStatus;
		this.milkQuantityLtr = milkQuantityLtr;
		this.nonDeliverRecords = nonDeliverRecords;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "subscription_id", unique = true, nullable = false)
	public Integer getSubscriptionId() {
		return this.subscriptionId;
	}

	public void setSubscriptionId(Integer subscriptionId) {
		this.subscriptionId = subscriptionId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "customer_id", nullable = false)
	public CustomerInfoTable getCustomerInfoTable() {
		return this.customerInfoTable;
	}

	public void setCustomerInfoTable(CustomerInfoTable customerInfoTable) {
		this.customerInfoTable = customerInfoTable;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "product_id", nullable = false)
	public MilkProductionTable getMilkProductionTable() {
		return this.milkProductionTable;
	}

	public void setMilkProductionTable(MilkProductionTable milkProductionTable) {
		this.milkProductionTable = milkProductionTable;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "supplier_id", nullable = false)
	public SupplierInfoTable getSupplierInfoTable() {
		return this.supplierInfoTable;
	}

	public void setSupplierInfoTable(SupplierInfoTable supplierInfoTable) {
		this.supplierInfoTable = supplierInfoTable;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "subscription_start_date", nullable = false, length = 10)
	public Date getSubscriptionStartDate() {
		return this.subscriptionStartDate;
	}

	public void setSubscriptionStartDate(Date subscriptionStartDate) {
		this.subscriptionStartDate = subscriptionStartDate;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "subscription_end_date", nullable = false, length = 10)
	public Date getSubscriptionEndDate() {
		return this.subscriptionEndDate;
	}

	public void setSubscriptionEndDate(Date subscriptionEndDate) {
		this.subscriptionEndDate = subscriptionEndDate;
	}

	@Column(name = "subscription_status", nullable = false, length = 100)
	public String getSubscriptionStatus() {
		return this.subscriptionStatus;
	}

	public void setSubscriptionStatus(String subscriptionStatus) {
		this.subscriptionStatus = subscriptionStatus;
	}

	@Column(name = "milk_quantity_ltr", nullable = false)
	public int getMilkQuantityLtr() {
		return this.milkQuantityLtr;
	}

	public void setMilkQuantityLtr(int milkQuantityLtr) {
		this.milkQuantityLtr = milkQuantityLtr;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "subscriptionTable")
	public List<NonDeliverRecord> getNonDeliverRecords() {
		return this.nonDeliverRecords;
	}

	public void setNonDeliverRecords(List<NonDeliverRecord> nonDeliverRecords) {
		this.nonDeliverRecords = nonDeliverRecords;
	}

}
