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
@Table(name="tbl_Validation")
public class FormValidation {

	
	private int fieldId;
	private String fieldName;
	private int appType;
	private String  isMandatory;
	private int dependantOn;
	private String dataType;
	private String fieldDescription;
	private String createdBy;
	private Date createdTime;
	/**
	 * @return the fieldId
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getFieldId() {
		return fieldId;
	}
	/**
	 * @param fieldId the fieldId to set
	 */
	public void setFieldId(int fieldId) {
		this.fieldId = fieldId;
	}
	/**
	 * @return the fieldName
	 */
	@Column(name="Field_name")
	public String getFieldName() {
		return fieldName;
	}
	/**
	 * @param fieldName the fieldName to set
	 */
	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}
	/**
	 * @return the appType
	 */
	@Column(name="App_type")
	public int getAppType() {
		return appType;
	}
	/**
	 * @param appType the appType to set
	 */
	public void setAppType(int appType) {
		this.appType = appType;
	}
	/**
	 * @return the isMandatory
	 */
	@Column(name="Mandatory")
	public String getIsMandatory() {
		return isMandatory;
	}
	/**
	 * @param isMandatory the isMandatory to set
	 */
	public void setIsMandatory(String isMandatory) {
		this.isMandatory = isMandatory;
	}
	/**
	 * @return the dependantOn
	 */
	@Column(name="Dependant")
	public int getDependantOn() {
		return dependantOn;
	}
	/**
	 * @param dependantOn the dependantOn to set
	 */
	public void setDependantOn(int dependantOn) {
		this.dependantOn = dependantOn;
	}
	/**
	 * @return the dataType
	 */
	@Column(name="Data_type")
	public String getDataType() {
		return dataType;
	}
	/**
	 * @param dataType the dataType to set
	 */
	public void setDataType(String dataType) {
		this.dataType = dataType;
	}
	/**
	 * @return the fieldDescription
	 */
	@Column(name="Field_Description")
	public String getFieldDescription() {
		return fieldDescription;
	}
	/**
	 * @param fieldDescription the fieldDescription to set
	 */
	public void setFieldDescription(String fieldDescription) {
		this.fieldDescription = fieldDescription;
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
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + appType;
		result = prime * result + ((createdBy == null) ? 0 : createdBy.hashCode());
		result = prime * result + ((createdTime == null) ? 0 : createdTime.hashCode());
		result = prime * result + ((dataType == null) ? 0 : dataType.hashCode());
		result = prime * result + dependantOn;
		result = prime * result + ((fieldDescription == null) ? 0 : fieldDescription.hashCode());
		result = prime * result + fieldId;
		result = prime * result + ((fieldName == null) ? 0 : fieldName.hashCode());
		result = prime * result + ((isMandatory == null) ? 0 : isMandatory.hashCode());
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
		FormValidation other = (FormValidation) obj;
		if (appType != other.appType) {
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
		if (dataType == null) {
			if (other.dataType != null) {
				return false;
			}
		} else if (!dataType.equals(other.dataType)) {
			return false;
		}
		if (dependantOn != other.dependantOn) {
			return false;
		}
		if (fieldDescription == null) {
			if (other.fieldDescription != null) {
				return false;
			}
		} else if (!fieldDescription.equals(other.fieldDescription)) {
			return false;
		}
		if (fieldId != other.fieldId) {
			return false;
		}
		if (fieldName == null) {
			if (other.fieldName != null) {
				return false;
			}
		} else if (!fieldName.equals(other.fieldName)) {
			return false;
		}
		if (isMandatory == null) {
			if (other.isMandatory != null) {
				return false;
			}
		} else if (!isMandatory.equals(other.isMandatory)) {
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
		builder.append("FormValidation [fieldId=");
		builder.append(fieldId);
		builder.append(", fieldName=");
		builder.append(fieldName);
		builder.append(", appType=");
		builder.append(appType);
		builder.append(", isMandatory=");
		builder.append(isMandatory);
		builder.append(", dependantOn=");
		builder.append(dependantOn);
		builder.append(", dataType=");
		builder.append(dataType);
		builder.append(", fieldDescription=");
		builder.append(fieldDescription);
		builder.append(", createdBy=");
		builder.append(createdBy);
		builder.append(", createdTime=");
		builder.append(createdTime);
		builder.append("]");
		return builder.toString();
	}
	
	
}
