package com.netsuite.suitetalk.proxy.v2018_1.platform.core;

import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class GetItemAvailabilityResult implements Serializable {
   private Status status;
   private ItemAvailabilityList itemAvailabilityList;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(GetItemAvailabilityResult.class, true);

   public GetItemAvailabilityResult() {
      super();
   }

   public GetItemAvailabilityResult(Status status, ItemAvailabilityList itemAvailabilityList) {
      super();
      this.status = status;
      this.itemAvailabilityList = itemAvailabilityList;
   }

   public Status getStatus() {
      return this.status;
   }

   public void setStatus(Status status) {
      this.status = status;
   }

   public ItemAvailabilityList getItemAvailabilityList() {
      return this.itemAvailabilityList;
   }

   public void setItemAvailabilityList(ItemAvailabilityList itemAvailabilityList) {
      this.itemAvailabilityList = itemAvailabilityList;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof GetItemAvailabilityResult)) {
         return false;
      } else {
         GetItemAvailabilityResult other = (GetItemAvailabilityResult)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = (this.status == null && other.getStatus() == null || this.status != null && this.status.equals(other.getStatus())) && (this.itemAvailabilityList == null && other.getItemAvailabilityList() == null || this.itemAvailabilityList != null && this.itemAvailabilityList.equals(other.getItemAvailabilityList()));
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
         if (this.getStatus() != null) {
            _hashCode += this.getStatus().hashCode();
         }

         if (this.getItemAvailabilityList() != null) {
            _hashCode += this.getItemAvailabilityList().hashCode();
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
      typeDesc.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "GetItemAvailabilityResult"));
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("status");
      elemField.setXmlName(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "status"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "Status"));
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("itemAvailabilityList");
      elemField.setXmlName(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "itemAvailabilityList"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "ItemAvailabilityList"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
   }
}
