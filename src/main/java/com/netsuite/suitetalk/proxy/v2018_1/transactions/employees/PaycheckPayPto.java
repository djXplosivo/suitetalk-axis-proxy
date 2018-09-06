package com.netsuite.suitetalk.proxy.v2018_1.transactions.employees;

import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class PaycheckPayPto implements Serializable {
   private Long payItem;
   private String payItemName;
   private Double hoursAccrued;
   private Double hoursUsed;
   private Double hoursBalance;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(PaycheckPayPto.class, true);

   public PaycheckPayPto() {
      super();
   }

   public PaycheckPayPto(Long payItem, String payItemName, Double hoursAccrued, Double hoursUsed, Double hoursBalance) {
      super();
      this.payItem = payItem;
      this.payItemName = payItemName;
      this.hoursAccrued = hoursAccrued;
      this.hoursUsed = hoursUsed;
      this.hoursBalance = hoursBalance;
   }

   public Long getPayItem() {
      return this.payItem;
   }

   public void setPayItem(Long payItem) {
      this.payItem = payItem;
   }

   public String getPayItemName() {
      return this.payItemName;
   }

   public void setPayItemName(String payItemName) {
      this.payItemName = payItemName;
   }

   public Double getHoursAccrued() {
      return this.hoursAccrued;
   }

   public void setHoursAccrued(Double hoursAccrued) {
      this.hoursAccrued = hoursAccrued;
   }

   public Double getHoursUsed() {
      return this.hoursUsed;
   }

   public void setHoursUsed(Double hoursUsed) {
      this.hoursUsed = hoursUsed;
   }

   public Double getHoursBalance() {
      return this.hoursBalance;
   }

   public void setHoursBalance(Double hoursBalance) {
      this.hoursBalance = hoursBalance;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof PaycheckPayPto)) {
         return false;
      } else {
         PaycheckPayPto other = (PaycheckPayPto)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = (this.payItem == null && other.getPayItem() == null || this.payItem != null && this.payItem.equals(other.getPayItem())) && (this.payItemName == null && other.getPayItemName() == null || this.payItemName != null && this.payItemName.equals(other.getPayItemName())) && (this.hoursAccrued == null && other.getHoursAccrued() == null || this.hoursAccrued != null && this.hoursAccrued.equals(other.getHoursAccrued())) && (this.hoursUsed == null && other.getHoursUsed() == null || this.hoursUsed != null && this.hoursUsed.equals(other.getHoursUsed())) && (this.hoursBalance == null && other.getHoursBalance() == null || this.hoursBalance != null && this.hoursBalance.equals(other.getHoursBalance()));
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

         if (this.getPayItemName() != null) {
            _hashCode += this.getPayItemName().hashCode();
         }

         if (this.getHoursAccrued() != null) {
            _hashCode += this.getHoursAccrued().hashCode();
         }

         if (this.getHoursUsed() != null) {
            _hashCode += this.getHoursUsed().hashCode();
         }

         if (this.getHoursBalance() != null) {
            _hashCode += this.getHoursBalance().hashCode();
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
      typeDesc.setXmlType(new QName("urn:employees_2018_1.transactions.webservices.netsuite.com", "PaycheckPayPto"));
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("payItem");
      elemField.setXmlName(new QName("urn:employees_2018_1.transactions.webservices.netsuite.com", "payItem"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "long"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("payItemName");
      elemField.setXmlName(new QName("urn:employees_2018_1.transactions.webservices.netsuite.com", "payItemName"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("hoursAccrued");
      elemField.setXmlName(new QName("urn:employees_2018_1.transactions.webservices.netsuite.com", "hoursAccrued"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("hoursUsed");
      elemField.setXmlName(new QName("urn:employees_2018_1.transactions.webservices.netsuite.com", "hoursUsed"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("hoursBalance");
      elemField.setXmlName(new QName("urn:employees_2018_1.transactions.webservices.netsuite.com", "hoursBalance"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
   }
}
