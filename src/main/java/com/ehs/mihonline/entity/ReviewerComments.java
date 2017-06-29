/**
 * 
 */
package com.ehs.mihonline.entity;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author vsubramaniyan
 *
 */
@Entity
@Table(name="tbl_Reviewer_Comment")
public class ReviewerComments  {

	public ReviewerComments(){
	}
	
	
	int id;
	int applicationId;
	String pdfAppId;
	String comments;
	String createdBy;
	Date createdTime;
	/**
	 * @return the id
	 */
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the applicationId
	 */
	@Column(name = "Application_Id")
	public int getApplicationId() {
		return applicationId;
	}
	/**
	 * @param applicationId the applicationId to set
	 */
	public void setApplicationId(int applicationId) {
		this.applicationId = applicationId;
	}
	/**
	 * @return the pdfAppId
	 */
	@Column(name = "pdf_app_id")
	public String getPdfAppId() {
		return pdfAppId;
	}
	/**
	 * @param pdfAppId the pdfAppId to set
	 */
	public void setPdfAppId(String pdfAppId) {
		this.pdfAppId = pdfAppId;
	}
	/**
	 * @return the comments
	 */
	@Column(name = "comments")
	public String getComments() {
		return comments;
	}
	/**
	 * @param comments the comments to set
	 */
	public void setComments(String comments) {
		this.comments = comments;
	}
	/**
	 * @return the createdBy
	 */
	@Column(name = "created_by")
	public String getCreatedBy() {
		return createdBy;
	}
	/**
	 * @param createdBy the createdBy to set
	 */
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	/**
	 * @return the createdTime
	 */
	@Column(name = "created_time")
	public Date getCreatedTime() {
		return createdTime;
	}
	/**
	 * @param createdTime the createdTime to set
	 */
	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((comments == null) ? 0 : comments.hashCode());
		result = prime * result + applicationId;
		result = prime * result + ((createdBy == null) ? 0 : createdBy.hashCode());
		result = prime * result + ((createdTime == null) ? 0 : createdTime.hashCode());
		result = prime * result + id;
		result = prime * result + ((pdfAppId == null) ? 0 : pdfAppId.hashCode());
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		ReviewerComments other = (ReviewerComments) obj;
		if (comments == null) {
			if (other.comments != null) {
				return false;
			}
		} else if (!comments.equals(other.comments)) {
			return false;
		}
		if (applicationId != other.applicationId) {
			return false;
		}
		if (createdBy == null) {
			if (other.createdBy != null) {
				return false;
			}
		} else if (!createdBy.equals(other.createdBy)) {
			return false;
		}
		if (createdTime == null) {
			if (other.createdTime != null) {
				return false;
			}
		} else if (!createdTime.equals(other.createdTime)) {
			return false;
		}
		if (id != other.id) {
			return false;
		}
		if (pdfAppId == null) {
			if (other.pdfAppId != null) {
				return false;
			}
		} else if (!pdfAppId.equals(other.pdfAppId)) {
			return false;
		}
		return true;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ReviewerComments [id=");
		builder.append(id);
		builder.append(", applicationId=");
		builder.append(applicationId);
		builder.append(", pdfAppId=");
		builder.append(pdfAppId);
		builder.append(", Comments=");
		builder.append(comments);
		builder.append(", createdBy=");
		builder.append(createdBy);
		builder.append(", createdTime=");
		builder.append(createdTime);
		builder.append("]");
		return builder.toString();
	}

	
}
