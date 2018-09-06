package com.netsuite.suitetalk.proxy.v2018_1.transactions.sales;

import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class ItemFulfillmentPackage implements Serializable {
   private Double packageWeight;
   private String packageDescr;
   private String packageTrackingNumber;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(ItemFulfillmentPackage.class, true);

   public ItemFulfillmentPackage() {
      super();
   }

   public ItemFulfillmentPackage(Double packageWeight, String packageDescr, String packageTrackingNumber) {
      super();
      this.packageWeight = packageWeight;
      this.packageDescr = packageDescr;
      this.packageTrackingNumber = packageTrackingNumber;
   }

   public Double getPackageWeight() {
      return this.packageWeight;
   }

   public void setPackageWeight(Double packageWeight) {
      this.packageWeight = packageWeight;
   }

   public String getPackageDescr() {
      return this.packageDescr;
   }

   public void setPackageDescr(String packageDescr) {
      this.packageDescr = packageDescr;
   }

   public String getPackageTrackingNumber() {
      return this.packageTrackingNumber;
   }

   public void setPackageTrackingNumber(String packageTrackingNumber) {
      this.packageTrackingNumber = packageTrackingNumber;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof ItemFulfillmentPackage)) {
         return false;
      } else {
         ItemFulfillmentPackage other = (ItemFulfillmentPackage)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = (this.packageWeight == null && other.getPackageWeight() == null || this.packageWeight != null && this.packageWeight.equals(other.getPackageWeight())) && (this.packageDescr == null && other.getPackageDescr() == null || this.packageDescr != null && this.packageDescr.equals(other.getPackageDescr())) && (this.packageTrackingNumber == null && other.getPackageTrackingNumber() == null || this.packageTrackingNumber != null && this.packageTrackingNumber.equals(other.getPackageTrackingNumber()));
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
         if (this.getPackageWeight() != null) {
            _hashCode += this.getPackageWeight().hashCode();
         }

         if (this.getPackageDescr() != null) {
            _hashCode += this.getPackageDescr().hashCode();
         }

         if (this.getPackageTrackingNumber() != null) {
            _hashCode += this.getPackageTrackingNumber().hashCode();
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
      typeDesc.setXmlType(new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "ItemFulfillmentPackage"));
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("packageWeight");
      elemField.setXmlName(new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "packageWeight"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("packageDescr");
      elemField.setXmlName(new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "packageDescr"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("packageTrackingNumber");
      elemField.setXmlName(new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "packageTrackingNumber"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
   }
}
