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

/**
 * @author vsubramaniyan
 *
 */
@Entity(name="tbl_File")
public class FileDetails {
	
	public FileDetails(){}

	/**
	 * @param applicationId
	 * @param uniqueid
	 * @param fileName
	 * @param createdBy
	 * @param createdTime
	 * @param uploadStatus
	 * @param uploadComments
	 */
	public FileDetails(int applicationId, String uniqueid, String fileName, String createdBy, Date createdTime,
			String uploadStatus, String uploadComments) {
		super();
		this.applicationId = applicationId;
		this.uniquePdfAppid = uniqueid;
		this.fileName = fileName;
		this.createdBy = createdBy;
		this.createdTime = createdTime;
		this.uploadStatus = uploadStatus;
		this.uploadComments = uploadComments;
	}
	
	private int fileId;
	private int applicationId;
	private String uniquePdfAppid;
	private String fileName;
	private String createdBy;
	private Date createdTime;
	private String uploadStatus;
	private String uploadComments;
	
	/**
	 * @return the fileId
	 */
	@Id
	@Column(name="File_Id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getFileId() {
		return fileId;
	}
	/**
	 * @param fileId the fileId to set
	 */
	public void setFileId(int fileId) {
		this.fileId = fileId;
	}
	/**
	 * @return the applicationId
	 */
	@Column(name="Application_id")
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
	 * @return the uniqueid
	 */
	@Column(name="Unique_Pdf_App_Id")
	public String getUniquePdfAppid() {
		return uniquePdfAppid;
	}
	/**
	 * @param uniqueid the uniqueid to set
	 */
	public void setUniquePdfAppid(String uniquePdfAppid) {
		this.uniquePdfAppid = uniquePdfAppid;
	}
	/**
	 * @return the fileName
	 */
	@Column(name="File_Name")
	public String getFileName() {
		return fileName;
	}
	/**
	 * @param fileName the fileName to set
	 */
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	/**
	 * @return the createdBy
	 */
	@Column(name="Created_by")
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
	@Column(name="Created_time")
	public Date getCreatedTime() {
		return createdTime;
	}
	/**
	 * @param createdTime the createdTime to set
	 */
	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}
	/**
	 * @return the uploadStatus
	 */
	@Column(name="Upload_Status")
	public String getUploadStatus() {
		return uploadStatus;
	}
	/**
	 * @param uploadStatus the uploadStatus to set
	 */
	public void setUploadStatus(String uploadStatus) {
		this.uploadStatus = uploadStatus;
	}
	/**
	 * @return the uploadComments
	 */
	@Column(name="Upload_Comments")
	public String getUploadComments() {
		return uploadComments;
	}
	/**
	 * @param uploadComments the uploadComments to set
	 */
	public void setUploadComments(String uploadComments) {
		this.uploadComments = uploadComments;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + applicationId;
		result = prime * result + ((createdBy == null) ? 0 : createdBy.hashCode());
		result = prime * result + ((createdTime == null) ? 0 : createdTime.hashCode());
		result = prime * result + fileId;
		result = prime * result + ((fileName == null) ? 0 : fileName.hashCode());
		result = prime * result + ((uniquePdfAppid == null) ? 0 : uniquePdfAppid.hashCode()); ;
		result = prime * result + ((uploadComments == null) ? 0 : uploadComments.hashCode());
		result = prime * result + ((uploadStatus == null) ? 0 : uploadStatus.hashCode());
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
		FileDetails other = (FileDetails) obj;
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
		if (fileId != other.fileId) {
			return false;
		}
		if (fileName == null) {
			if (other.fileName != null) {
				return false;
			}
		} else if (!fileName.equals(other.fileName)) {
			return false;
		}
		if (uniquePdfAppid != other.uniquePdfAppid) {
			return false;
		}
		if (uploadComments == null) {
			if (other.uploadComments != null) {
				return false;
			}
		} else if (!uploadComments.equals(other.uploadComments)) {
			return false;
		}
		if (uploadStatus == null) {
			if (other.uploadStatus != null) {
				return false;
			}
		} else if (!uploadStatus.equals(other.uploadStatus)) {
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
		builder.append("FileDetails [fileId=");
		builder.append(fileId);
		builder.append(", applicationId=");
		builder.append(applicationId);
		builder.append(", uniqueid=");
		builder.append(uniquePdfAppid);
		builder.append(", fileName=");
		builder.append(fileName);
		builder.append(", createdBy=");
		builder.append(createdBy);
		builder.append(", createdTime=");
		builder.append(createdTime);
		builder.append(", uploadStatus=");
		builder.append(uploadStatus);
		builder.append(", uploadComments=");
		builder.append(uploadComments);
		builder.append("]");
		return builder.toString();
	}
}
