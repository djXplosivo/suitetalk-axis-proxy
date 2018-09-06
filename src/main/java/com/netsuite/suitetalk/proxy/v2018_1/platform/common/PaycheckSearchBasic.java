package com.netsuite.suitetalk.proxy.v2018_1.platform.common;

import com.netsuite.suitetalk.proxy.v2018_1.platform.core.SearchBooleanField;
import com.netsuite.suitetalk.proxy.v2018_1.platform.core.SearchDateField;
import com.netsuite.suitetalk.proxy.v2018_1.platform.core.SearchLongField;
import com.netsuite.suitetalk.proxy.v2018_1.platform.core.SearchMultiSelectField;
import com.netsuite.suitetalk.proxy.v2018_1.platform.core.SearchRecordBasic;
import com.netsuite.suitetalk.proxy.v2018_1.platform.core.SearchStringField;
import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class PaycheckSearchBasic extends SearchRecordBasic implements Serializable {
   private SearchMultiSelectField account;
   private SearchLongField batchNumber;
   private SearchDateField checkDate;
   private SearchMultiSelectField employee;
   private SearchMultiSelectField externalId;
   private SearchStringField externalIdString;
   private SearchBooleanField hasGLImpact;
   private SearchMultiSelectField internalId;
   private SearchLongField internalIdNumber;
   private SearchMultiSelectField payrollItem;
   private SearchMultiSelectField payrollItemType;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(PaycheckSearchBasic.class, true);

   public PaycheckSearchBasic() {
      super();
   }

   public PaycheckSearchBasic(SearchMultiSelectField account, SearchLongField batchNumber, SearchDateField checkDate, SearchMultiSelectField employee, SearchMultiSelectField externalId, SearchStringField externalIdString, SearchBooleanField hasGLImpact, SearchMultiSelectField internalId, SearchLongField internalIdNumber, SearchMultiSelectField payrollItem, SearchMultiSelectField payrollItemType) {
      super();
      this.account = account;
      this.batchNumber = batchNumber;
      this.checkDate = checkDate;
      this.employee = employee;
      this.externalId = externalId;
      this.externalIdString = externalIdString;
      this.hasGLImpact = hasGLImpact;
      this.internalId = internalId;
      this.internalIdNumber = internalIdNumber;
      this.payrollItem = payrollItem;
      this.payrollItemType = payrollItemType;
   }

   public SearchMultiSelectField getAccount() {
      return this.account;
   }

   public void setAccount(SearchMultiSelectField account) {
      this.account = account;
   }

   public SearchLongField getBatchNumber() {
      return this.batchNumber;
   }

   public void setBatchNumber(SearchLongField batchNumber) {
      this.batchNumber = batchNumber;
   }

   public SearchDateField getCheckDate() {
      return this.checkDate;
   }

   public void setCheckDate(SearchDateField checkDate) {
      this.checkDate = checkDate;
   }

   public SearchMultiSelectField getEmployee() {
      return this.employee;
   }

   public void setEmployee(SearchMultiSelectField employee) {
      this.employee = employee;
   }

   public SearchMultiSelectField getExternalId() {
      return this.externalId;
   }

   public void setExternalId(SearchMultiSelectField externalId) {
      this.externalId = externalId;
   }

   public SearchStringField getExternalIdString() {
      return this.externalIdString;
   }

   public void setExternalIdString(SearchStringField externalIdString) {
      this.externalIdString = externalIdString;
   }

   public SearchBooleanField getHasGLImpact() {
      return this.hasGLImpact;
   }

   public void setHasGLImpact(SearchBooleanField hasGLImpact) {
      this.hasGLImpact = hasGLImpact;
   }

   public SearchMultiSelectField getInternalId() {
      return this.internalId;
   }

   public void setInternalId(SearchMultiSelectField internalId) {
      this.internalId = internalId;
   }

   public SearchLongField getInternalIdNumber() {
      return this.internalIdNumber;
   }

   public void setInternalIdNumber(SearchLongField internalIdNumber) {
      this.internalIdNumber = internalIdNumber;
   }

   public SearchMultiSelectField getPayrollItem() {
      return this.payrollItem;
   }

   public void setPayrollItem(SearchMultiSelectField payrollItem) {
      this.payrollItem = payrollItem;
   }

   public SearchMultiSelectField getPayrollItemType() {
      return this.payrollItemType;
   }

   public void setPayrollItemType(SearchMultiSelectField payrollItemType) {
      this.payrollItemType = payrollItemType;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof PaycheckSearchBasic)) {
         return false;
      } else {
         PaycheckSearchBasic other = (PaycheckSearchBasic)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = super.equals(obj) && (this.account == null && other.getAccount() == null || this.account != null && this.account.equals(other.getAccount())) && (this.batchNumber == null && other.getBatchNumber() == null || this.batchNumber != null && this.batchNumber.equals(other.getBatchNumber())) && (this.checkDate == null && other.getCheckDate() == null || this.checkDate != null && this.checkDate.equals(other.getCheckDate())) && (this.employee == null && other.getEmployee() == null || this.employee != null && this.employee.equals(other.getEmployee())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && this.externalId.equals(other.getExternalId())) && (this.externalIdString == null && other.getExternalIdString() == null || this.externalIdString != null && this.externalIdString.equals(other.getExternalIdString())) && (this.hasGLImpact == null && other.getHasGLImpact() == null || this.hasGLImpact != null && this.hasGLImpact.equals(other.getHasGLImpact())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && this.internalId.equals(other.getInternalId())) && (this.internalIdNumber == null && other.getInternalIdNumber() == null || this.internalIdNumber != null && this.internalIdNumber.equals(other.getInternalIdNumber())) && (this.payrollItem == null && other.getPayrollItem() == null || this.payrollItem != null && this.payrollItem.equals(other.getPayrollItem())) && (this.payrollItemType == null && other.getPayrollItemType() == null || this.payrollItemType != null && this.payrollItemType.equals(other.getPayrollItemType()));
            this.__equalsCalc = null;
            return _equals;
         }
      }
   }

   public synchronized int hashCode() {
      if (this.__hashCodeCalc) {
         return 0;
      } else {
         this.__hashCodeCalc = true;
         int _hashCode = super.hashCode();
         if (this.getAccount() != null) {
            _hashCode += this.getAccount().hashCode();
         }

         if (this.getBatchNumber() != null) {
            _hashCode += this.getBatchNumber().hashCode();
         }

         if (this.getCheckDate() != null) {
            _hashCode += this.getCheckDate().hashCode();
         }

         if (this.getEmployee() != null) {
            _hashCode += this.getEmployee().hashCode();
         }

         if (this.getExternalId() != null) {
            _hashCode += this.getExternalId().hashCode();
         }

         if (this.getExternalIdString() != null) {
            _hashCode += this.getExternalIdString().hashCode();
         }

         if (this.getHasGLImpact() != null) {
            _hashCode += this.getHasGLImpact().hashCode();
         }

         if (this.getInternalId() != null) {
            _hashCode += this.getInternalId().hashCode();
         }

         if (this.getInternalIdNumber() != null) {
            _hashCode += this.getInternalIdNumber().hashCode();
         }

         if (this.getPayrollItem() != null) {
            _hashCode += this.getPayrollItem().hashCode();
         }

         if (this.getPayrollItemType() != null) {
            _hashCode += this.getPayrollItemType().hashCode();
         }

         this.__hashCodeCalc = false;
         return _hashCode;
      }
   }

   public static TypeDesc getTypeDesc() {
      return typeDesc;
   }

   public static Serializer getSerializer(String mechType, Class _javaType, QName _xmlType) {
      return new BeanSerializer(_javaType, _xmlType, typeDesc);
   }

   public static Deserializer getDeserializer(String mechType, Class _javaType, QName _xmlType) {
      return new BeanDeserializer(_javaType, _xmlType, typeDesc);
   }

   static {
      typeDesc.setXmlType(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "PaycheckSearchBasic"));
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("account");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "account"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("batchNumber");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "batchNumber"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchLongField"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("checkDate");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "checkDate"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchDateField"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("employee");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "employee"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("externalId");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "externalId"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("externalIdString");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "externalIdString"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchStringField"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("hasGLImpact");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "hasGLImpact"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchBooleanField"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("internalId");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "internalId"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("internalIdNumber");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "internalIdNumber"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchLongField"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("payrollItem");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "payrollItem"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("payrollItemType");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "payrollItemType"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
   }
}
