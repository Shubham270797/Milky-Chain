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
 * ComplaintTable generated by hbm2java
 */
@Entity
@Table(name = "complaint_table", catalog = "milk_management")
public class ComplaintTable implements java.io.Serializable {

	private Integer complaintId;
	private CustomerInfoTable customerInfoTable;
	private String complaintInfo;
	private Date complaintDate;
	private String complaintStatus;
	private List<ComplaintCommentTable> complaintCommentTables;

	public ComplaintTable() {
	}

	public ComplaintTable(CustomerInfoTable customerInfoTable, String complaintInfo, Date complaintDate,
			String complaintStatus) {
		this.customerInfoTable = customerInfoTable;
		this.complaintInfo = complaintInfo;
		this.complaintDate = complaintDate;
		this.complaintStatus = complaintStatus;
	}

	public ComplaintTable(CustomerInfoTable customerInfoTable, String complaintInfo, Date complaintDate,
			String complaintStatus, List<ComplaintCommentTable> complaintCommentTables) {
		this.customerInfoTable = customerInfoTable;
		this.complaintInfo = complaintInfo;
		this.complaintDate = complaintDate;
		this.complaintStatus = complaintStatus;
		this.complaintCommentTables = complaintCommentTables;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "complaint_id", unique = true, nullable = false)
	public Integer getComplaintId() {
		return this.complaintId;
	}

	public void setComplaintId(Integer complaintId) {
		this.complaintId = complaintId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "customer_id", nullable = false)
	public CustomerInfoTable getCustomerInfoTable() {
		return this.customerInfoTable;
	}

	public void setCustomerInfoTable(CustomerInfoTable customerInfoTable) {
		this.customerInfoTable = customerInfoTable;
	}

	@Column(name = "complaint_info", nullable = false, length = 300)
	public String getComplaintInfo() {
		return this.complaintInfo;
	}

	public void setComplaintInfo(String complaintInfo) {
		this.complaintInfo = complaintInfo;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "complaint_date", nullable = false, length = 19)
	public Date getComplaintDate() {
		return this.complaintDate;
	}

	public void setComplaintDate(Date complaintDate) {
		this.complaintDate = complaintDate;
	}

	@Column(name = "complaint_status", nullable = false, length = 100)
	public String getComplaintStatus() {
		return this.complaintStatus;
	}

	public void setComplaintStatus(String complaintStatus) {
		this.complaintStatus = complaintStatus;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "complaintTable")
	public List<ComplaintCommentTable> getComplaintCommentTables() {
		return this.complaintCommentTables;
	}

	public void setComplaintCommentTables(List<ComplaintCommentTable> complaintCommentTables) {
		this.complaintCommentTables = complaintCommentTables;
	}

}
