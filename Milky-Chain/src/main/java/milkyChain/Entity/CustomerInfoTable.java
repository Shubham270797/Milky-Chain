package milkyChain.Entity;


import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * CustomerInfoTable generated by hbm2java
 */
@Entity
@Table(name = "customer_info_table", catalog = "milk_management", uniqueConstraints = {
		@UniqueConstraint(columnNames = "customer_password"), @UniqueConstraint(columnNames = "customer_username"),
		@UniqueConstraint(columnNames = "customer_email") })
public class CustomerInfoTable implements java.io.Serializable {

	private Integer customerId;
	private String customerFname;
	private String customerLname;
	private String customerAddress;
	private String customerMobileNo;
	private String customerEmail;
	private String customerUsername;
	private String customerPassword;
	private int customerPincode;
	private String customerArea;
	private List<OrderTable> orderTables ;
	private List<CustomerBillTable> customerBillTables;
	private List<ComplaintTable> complaintTables;
	private List<SubscriptionTable> subscriptionTables;

	public CustomerInfoTable() {
	}

	public CustomerInfoTable(String customerFname, String customerLname, String customerAddress,
			String customerMobileNo, String customerEmail, String customerUsername, String customerPassword,
			int customerPincode, String customerArea) {
		this.customerFname = customerFname;
		this.customerLname = customerLname;
		this.customerAddress = customerAddress;
		this.customerMobileNo = customerMobileNo;
		this.customerEmail = customerEmail;
		this.customerUsername = customerUsername;
		this.customerPassword = customerPassword;
		this.customerPincode = customerPincode;
		this.customerArea = customerArea;
	}

	public CustomerInfoTable(String customerFname, String customerLname, String customerAddress,
			String customerMobileNo, String customerEmail, String customerUsername, String customerPassword,
			int customerPincode, String customerArea, List<OrderTable> orderTables,
			List<CustomerBillTable> customerBillTables, List<ComplaintTable> complaintTables,
			List<SubscriptionTable> subscriptionTables) {
		this.customerFname = customerFname;
		this.customerLname = customerLname;
		this.customerAddress = customerAddress;
		this.customerMobileNo = customerMobileNo;
		this.customerEmail = customerEmail;
		this.customerUsername = customerUsername;
		this.customerPassword = customerPassword;
		this.customerPincode = customerPincode;
		this.customerArea = customerArea;
		this.orderTables = orderTables;
		this.customerBillTables = customerBillTables;
		this.complaintTables = complaintTables;
		this.subscriptionTables = subscriptionTables;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "customer_id", unique = true, nullable = false)
	public Integer getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	@Column(name = "customer_fname", nullable = false, length = 100)
	public String getCustomerFname() {
		return this.customerFname;
	}

	public void setCustomerFname(String customerFname) {
		this.customerFname = customerFname;
	}

	@Column(name = "customer_lname", nullable = false, length = 100)
	public String getCustomerLname() {
		return this.customerLname;
	}

	public void setCustomerLname(String customerLname) {
		this.customerLname = customerLname;
	}

	@Column(name = "customer_address", nullable = false, length = 500)
	public String getCustomerAddress() {
		return this.customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	@Column(name = "customer_mobile_no", nullable = false, length = 100)
	public String getCustomerMobileNo() {
		return this.customerMobileNo;
	}

	public void setCustomerMobileNo(String customerMobileNo) {
		this.customerMobileNo = customerMobileNo;
	}

	@Column(name = "customer_email", unique = true, nullable = false, length = 100)
	public String getCustomerEmail() {
		return this.customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	@Column(name = "customer_username", unique = true, nullable = false, length = 100)
	public String getCustomerUsername() {
		return this.customerUsername;
	}

	public void setCustomerUsername(String customerUsername) {
		this.customerUsername = customerUsername;
	}

	@Column(name = "customer_password", unique = true, nullable = false, length = 100)
	public String getCustomerPassword() {
		return this.customerPassword;
	}

	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}

	@Column(name = "customer_pincode", nullable = false)
	public int getCustomerPincode() {
		return this.customerPincode;
	}

	public void setCustomerPincode(int customerPincode) {
		this.customerPincode = customerPincode;
	}

	@Column(name = "customer_area", nullable = false, length = 100)
	public String getCustomerArea() {
		return this.customerArea;
	}

	public void setCustomerArea(String customerArea) {
		this.customerArea = customerArea;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "customerInfoTable")
	public List<OrderTable> getOrderTables() {
		return this.orderTables;
	}

	public void setOrderTables(List<OrderTable> orderTables) {
		this.orderTables = orderTables;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "customerInfoTable")
	public List<CustomerBillTable> getCustomerBillTables() {
		return this.customerBillTables;
	}

	public void setCustomerBillTables(List<CustomerBillTable> customerBillTables) {
		this.customerBillTables = customerBillTables;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "customerInfoTable")
	public List<ComplaintTable> getComplaintTables() {
		return this.complaintTables;
	}

	public void setComplaintTables(List<ComplaintTable> complaintTables) {
		this.complaintTables = complaintTables;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "customerInfoTable")
	public List<SubscriptionTable> getSubscriptionTables() {
		return this.subscriptionTables;
	}

	public void setSubscriptionTables(List<SubscriptionTable> subscriptionTables) {
		this.subscriptionTables = subscriptionTables;
	}

}
