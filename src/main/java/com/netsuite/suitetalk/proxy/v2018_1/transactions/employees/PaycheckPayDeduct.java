package com.netsuite.suitetalk.proxy.v2018_1.transactions.employees;

import com.netsuite.suitetalk.proxy.v2018_1.platform.core.RecordRef;
import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class PaycheckPayDeduct implements Serializable {
   private RecordRef payItem;
   private Long line;
   private Double wageBase;
   private Double amount;
   private Boolean manualEntry;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(PaycheckPayDeduct.class, true);

   public PaycheckPayDeduct() {
      super();
   }

   public PaycheckPayDeduct(RecordRef payItem, Long line, Double wageBase, Double amount, Boolean manualEntry) {
      super();
      this.payItem = payItem;
      this.line = line;
      this.wageBase = wageBase;
      this.amount = amount;
      this.manualEntry = manualEntry;
   }

   public RecordRef getPayItem() {
      return this.payItem;
   }

   public void setPayItem(RecordRef payItem) {
      this.payItem = payItem;
   }

   public Long getLine() {
      return this.line;
   }

   public void setLine(Long line) {
      this.line = line;
   }

   public Double getWageBase() {
      return this.wageBase;
   }

   public void setWageBase(Double wageBase) {
      this.wageBase = wageBase;
   }

   public Double getAmount() {
      return this.amount;
   }

   public void setAmount(Double amount) {
      this.amount = amount;
   }

   public Boolean getManualEntry() {
      return this.manualEntry;
   }

   public void setManualEntry(Boolean manualEntry) {
      this.manualEntry = manualEntry;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof PaycheckPayDeduct)) {
         return false;
      } else {
         PaycheckPayDeduct other = (PaycheckPayDeduct)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = (this.payItem == null && other.getPayItem() == null || this.payItem != null && this.payItem.equals(other.getPayItem())) && (this.line == null && other.getLine() == null || this.line != null && this.line.equals(other.getLine())) && (this.wageBase == null && other.getWageBase() == null || this.wageBase != null && this.wageBase.equals(other.getWageBase())) && (this.amount == null && other.getAmount() == null || this.amount != null && this.amount.equals(other.getAmount())) && (this.manualEntry == null && other.getManualEntry() == null || this.manualEntry != null && this.manualEntry.equals(other.getManualEntry()));
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
         if (this.getPayItem() != null) {
            _hashCode += this.getPayItem().hashCode();
         }

         if (this.getLine() != null) {
            _hashCode += this.getLine().hashCode();
         }

         if (this.getWageBase() != null) {
            _hashCode += this.getWageBase().hashCode();
         }

         if (this.getAmount() != null) {
            _hashCode += this.getAmount().hashCode();
         }

         if (this.getManualEntry() != null) {
            _hashCode += this.getManualEntry().hashCode();
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
      typeDesc.setXmlType(new QName("urn:employees_2018_1.transactions.webservices.netsuite.com", "PaycheckPayDeduct"));
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("payItem");
      elemField.setXmlName(new QName("urn:employees_2018_1.transactions.webservices.netsuite.com", "payItem"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("line");
      elemField.setXmlName(new QName("urn:employees_2018_1.transactions.webservices.netsuite.com", "line"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "long"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("wageBase");
      elemField.setXmlName(new QName("urn:employees_2018_1.transactions.webservices.netsuite.com", "wageBase"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("amount");
      elemField.setXmlName(new QName("urn:employees_2018_1.transactions.webservices.netsuite.com", "amount"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("manualEntry");
      elemField.setXmlName(new QName("urn:employees_2018_1.transactions.webservices.netsuite.com", "manualEntry"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
   }
}
