package com.netsuite.suitetalk.proxy.v2018_1.lists.supplychain;

import com.netsuite.suitetalk.proxy.v2018_1.platform.core.RecordRef;
import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class ManufacturingCostDetail implements Serializable {
   private RecordRef costCategory;
   private RecordRef item;
   private Double fixedRate;
   private Double runRate;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(ManufacturingCostDetail.class, true);

   public ManufacturingCostDetail() {
      super();
   }

   public ManufacturingCostDetail(RecordRef costCategory, RecordRef item, Double fixedRate, Double runRate) {
      super();
      this.costCategory = costCategory;
      this.item = item;
      this.fixedRate = fixedRate;
      this.runRate = runRate;
   }

   public RecordRef getCostCategory() {
      return this.costCategory;
   }

   public void setCostCategory(RecordRef costCategory) {
      this.costCategory = costCategory;
   }

   public RecordRef getItem() {
      return this.item;
   }

   public void setItem(RecordRef item) {
      this.item = item;
   }

   public Double getFixedRate() {
      return this.fixedRate;
   }

   public void setFixedRate(Double fixedRate) {
      this.fixedRate = fixedRate;
   }

   public Double getRunRate() {
      return this.runRate;
   }

   public void setRunRate(Double runRate) {
      this.runRate = runRate;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof ManufacturingCostDetail)) {
         return false;
      } else {
         ManufacturingCostDetail other = (ManufacturingCostDetail)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = (this.costCategory == null && other.getCostCategory() == null || this.costCategory != null && this.costCategory.equals(other.getCostCategory())) && (this.item == null && other.getItem() == null || this.item != null && this.item.equals(other.getItem())) && (this.fixedRate == null && other.getFixedRate() == null || this.fixedRate != null && this.fixedRate.equals(other.getFixedRate())) && (this.runRate == null && other.getRunRate() == null || this.runRate != null && this.runRate.equals(other.getRunRate()));
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
         if (this.getCostCategory() != null) {
            _hashCode += this.getCostCategory().hashCode();
         }

         if (this.getItem() != null) {
            _hashCode += this.getItem().hashCode();
         }

         if (this.getFixedRate() != null) {
            _hashCode += this.getFixedRate().hashCode();
         }

         if (this.getRunRate() != null) {
            _hashCode += this.getRunRate().hashCode();
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
      typeDesc.setXmlType(new QName("urn:supplychain_2018_1.lists.webservices.netsuite.com", "ManufacturingCostDetail"));
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("costCategory");
      elemField.setXmlName(new QName("urn:supplychain_2018_1.lists.webservices.netsuite.com", "costCategory"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("item");
      elemField.setXmlName(new QName("urn:supplychain_2018_1.lists.webservices.netsuite.com", "item"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("fixedRate");
      elemField.setXmlName(new QName("urn:supplychain_2018_1.lists.webservices.netsuite.com", "fixedRate"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("runRate");
      elemField.setXmlName(new QName("urn:supplychain_2018_1.lists.webservices.netsuite.com", "runRate"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
   }
}
