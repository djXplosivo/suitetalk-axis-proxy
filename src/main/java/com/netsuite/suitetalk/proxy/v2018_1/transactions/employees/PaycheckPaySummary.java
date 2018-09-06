package com.netsuite.suitetalk.proxy.v2018_1.transactions.employees;

import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class PaycheckPaySummary implements Serializable {
   private String payItem;
   private String payItemType;
   private Double amount;
   private Double ytdAmount;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(PaycheckPaySummary.class, true);

   public PaycheckPaySummary() {
      super();
   }

   public PaycheckPaySummary(String payItem, String payItemType, Double amount, Double ytdAmount) {
      super();
      this.payItem = payItem;
      this.payItemType = payItemType;
      this.amount = amount;
      this.ytdAmount = ytdAmount;
   }

   public String getPayItem() {
      return this.payItem;
   }

   public void setPayItem(String payItem) {
      this.payItem = payItem;
   }

   public String getPayItemType() {
      return this.payItemType;
   }

   public void setPayItemType(String payItemType) {
      this.payItemType = payItemType;
   }

   public Double getAmount() {
      return this.amount;
   }

   public void setAmount(Double amount) {
      this.amount = amount;
   }

   public Double getYtdAmount() {
      return this.ytdAmount;
   }

   public void setYtdAmount(Double ytdAmount) {
      this.ytdAmount = ytdAmount;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof PaycheckPaySummary)) {
         return false;
      } else {
         PaycheckPaySummary other = (PaycheckPaySummary)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = (this.payItem == null && other.getPayItem() == null || this.payItem != null && this.payItem.equals(other.getPayItem())) && (this.payItemType == null && other.getPayItemType() == null || this.payItemType != null && this.payItemType.equals(other.getPayItemType())) && (this.amount == null && other.getAmount() == null || this.amount != null && this.amount.equals(other.getAmount())) && (this.ytdAmount == null && other.getYtdAmount() == null || this.ytdAmount != null && this.ytdAmount.equals(other.getYtdAmount()));
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

         if (this.getPayItemType() != null) {
            _hashCode += this.getPayItemType().hashCode();
         }

         if (this.getAmount() != null) {
            _hashCode += this.getAmount().hashCode();
         }

         if (this.getYtdAmount() != null) {
            _hashCode += this.getYtdAmount().hashCode();
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
      typeDesc.setXmlType(new QName("urn:employees_2018_1.transactions.webservices.netsuite.com", "PaycheckPaySummary"));
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("payItem");
      elemField.setXmlName(new QName("urn:employees_2018_1.transactions.webservices.netsuite.com", "payItem"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("payItemType");
      elemField.setXmlName(new QName("urn:employees_2018_1.transactions.webservices.netsuite.com", "payItemType"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
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
      elemField.setFieldName("ytdAmount");
      elemField.setXmlName(new QName("urn:employees_2018_1.transactions.webservices.netsuite.com", "ytdAmount"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
   }
}
