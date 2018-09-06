package com.netsuite.suitetalk.proxy.v2018_1.platform.common;

import com.netsuite.suitetalk.proxy.v2018_1.platform.core.RecordRef;
import java.io.Serializable;
import java.util.Calendar;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class InventoryAssignment implements Serializable {
   private String internalId;
   private RecordRef issueInventoryNumber;
   private String receiptInventoryNumber;
   private RecordRef binNumber;
   private RecordRef toBinNumber;
   private Double quantity;
   private Calendar expirationDate;
   private Double quantityAvailable;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(InventoryAssignment.class, true);

   public InventoryAssignment() {
      super();
   }

   public InventoryAssignment(String internalId, RecordRef issueInventoryNumber, String receiptInventoryNumber, RecordRef binNumber, RecordRef toBinNumber, Double quantity, Calendar expirationDate, Double quantityAvailable) {
      super();
      this.internalId = internalId;
      this.issueInventoryNumber = issueInventoryNumber;
      this.receiptInventoryNumber = receiptInventoryNumber;
      this.binNumber = binNumber;
      this.toBinNumber = toBinNumber;
      this.quantity = quantity;
      this.expirationDate = expirationDate;
      this.quantityAvailable = quantityAvailable;
   }

   public String getInternalId() {
      return this.internalId;
   }

   public void setInternalId(String internalId) {
      this.internalId = internalId;
   }

   public RecordRef getIssueInventoryNumber() {
      return this.issueInventoryNumber;
   }

   public void setIssueInventoryNumber(RecordRef issueInventoryNumber) {
      this.issueInventoryNumber = issueInventoryNumber;
   }

   public String getReceiptInventoryNumber() {
      return this.receiptInventoryNumber;
   }

   public void setReceiptInventoryNumber(String receiptInventoryNumber) {
      this.receiptInventoryNumber = receiptInventoryNumber;
   }

   public RecordRef getBinNumber() {
      return this.binNumber;
   }

   public void setBinNumber(RecordRef binNumber) {
      this.binNumber = binNumber;
   }

   public RecordRef getToBinNumber() {
      return this.toBinNumber;
   }

   public void setToBinNumber(RecordRef toBinNumber) {
      this.toBinNumber = toBinNumber;
   }

   public Double getQuantity() {
      return this.quantity;
   }

   public void setQuantity(Double quantity) {
      this.quantity = quantity;
   }

   public Calendar getExpirationDate() {
      return this.expirationDate;
   }

   public void setExpirationDate(Calendar expirationDate) {
      this.expirationDate = expirationDate;
   }

   public Double getQuantityAvailable() {
      return this.quantityAvailable;
   }

   public void setQuantityAvailable(Double quantityAvailable) {
      this.quantityAvailable = quantityAvailable;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof InventoryAssignment)) {
         return false;
      } else {
         InventoryAssignment other = (InventoryAssignment)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = (this.internalId == null && other.getInternalId() == null || this.internalId != null && this.internalId.equals(other.getInternalId())) && (this.issueInventoryNumber == null && other.getIssueInventoryNumber() == null || this.issueInventoryNumber != null && this.issueInventoryNumber.equals(other.getIssueInventoryNumber())) && (this.receiptInventoryNumber == null && other.getReceiptInventoryNumber() == null || this.receiptInventoryNumber != null && this.receiptInventoryNumber.equals(other.getReceiptInventoryNumber())) && (this.binNumber == null && other.getBinNumber() == null || this.binNumber != null && this.binNumber.equals(other.getBinNumber())) && (this.toBinNumber == null && other.getToBinNumber() == null || this.toBinNumber != null && this.toBinNumber.equals(other.getToBinNumber())) && (this.quantity == null && other.getQuantity() == null || this.quantity != null && this.quantity.equals(other.getQuantity())) && (this.expirationDate == null && other.getExpirationDate() == null || this.expirationDate != null && this.expirationDate.equals(other.getExpirationDate())) && (this.quantityAvailable == null && other.getQuantityAvailable() == null || this.quantityAvailable != null && this.quantityAvailable.equals(other.getQuantityAvailable()));
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
         int _hashCode = 1;
         if (this.getInternalId() != null) {
            _hashCode += this.getInternalId().hashCode();
         }

         if (this.getIssueInventoryNumber() != null) {
            _hashCode += this.getIssueInventoryNumber().hashCode();
         }

         if (this.getReceiptInventoryNumber() != null) {
            _hashCode += this.getReceiptInventoryNumber().hashCode();
         }

         if (this.getBinNumber() != null) {
            _hashCode += this.getBinNumber().hashCode();
         }

         if (this.getToBinNumber() != null) {
            _hashCode += this.getToBinNumber().hashCode();
         }

         if (this.getQuantity() != null) {
            _hashCode += this.getQuantity().hashCode();
         }

         if (this.getExpirationDate() != null) {
            _hashCode += this.getExpirationDate().hashCode();
         }

         if (this.getQuantityAvailable() != null) {
            _hashCode += this.getQuantityAvailable().hashCode();
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
      typeDesc.setXmlType(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "InventoryAssignment"));
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("internalId");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "internalId"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("issueInventoryNumber");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "issueInventoryNumber"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("receiptInventoryNumber");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "receiptInventoryNumber"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("binNumber");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "binNumber"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("toBinNumber");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "toBinNumber"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("quantity");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "quantity"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("expirationDate");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "expirationDate"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("quantityAvailable");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "quantityAvailable"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
   }
}
