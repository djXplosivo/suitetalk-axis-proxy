package com.netsuite.suitetalk.proxy.v2018_1.lists.accounting;

import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class InventoryNumberLocations implements Serializable {
   private String location;
   private Double quantityOnHand;
   private Double quantityAvailable;
   private Double quantityOnOrder;
   private Double quantityInTransit;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(InventoryNumberLocations.class, true);

   public InventoryNumberLocations() {
      super();
   }

   public InventoryNumberLocations(String location, Double quantityOnHand, Double quantityAvailable, Double quantityOnOrder, Double quantityInTransit) {
      super();
      this.location = location;
      this.quantityOnHand = quantityOnHand;
      this.quantityAvailable = quantityAvailable;
      this.quantityOnOrder = quantityOnOrder;
      this.quantityInTransit = quantityInTransit;
   }

   public String getLocation() {
      return this.location;
   }

   public void setLocation(String location) {
      this.location = location;
   }

   public Double getQuantityOnHand() {
      return this.quantityOnHand;
   }

   public void setQuantityOnHand(Double quantityOnHand) {
      this.quantityOnHand = quantityOnHand;
   }

   public Double getQuantityAvailable() {
      return this.quantityAvailable;
   }

   public void setQuantityAvailable(Double quantityAvailable) {
      this.quantityAvailable = quantityAvailable;
   }

   public Double getQuantityOnOrder() {
      return this.quantityOnOrder;
   }

   public void setQuantityOnOrder(Double quantityOnOrder) {
      this.quantityOnOrder = quantityOnOrder;
   }

   public Double getQuantityInTransit() {
      return this.quantityInTransit;
   }

   public void setQuantityInTransit(Double quantityInTransit) {
      this.quantityInTransit = quantityInTransit;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof InventoryNumberLocations)) {
         return false;
      } else {
         InventoryNumberLocations other = (InventoryNumberLocations)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = (this.location == null && other.getLocation() == null || this.location != null && this.location.equals(other.getLocation())) && (this.quantityOnHand == null && other.getQuantityOnHand() == null || this.quantityOnHand != null && this.quantityOnHand.equals(other.getQuantityOnHand())) && (this.quantityAvailable == null && other.getQuantityAvailable() == null || this.quantityAvailable != null && this.quantityAvailable.equals(other.getQuantityAvailable())) && (this.quantityOnOrder == null && other.getQuantityOnOrder() == null || this.quantityOnOrder != null && this.quantityOnOrder.equals(other.getQuantityOnOrder())) && (this.quantityInTransit == null && other.getQuantityInTransit() == null || this.quantityInTransit != null && this.quantityInTransit.equals(other.getQuantityInTransit()));
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
         if (this.getLocation() != null) {
            _hashCode += this.getLocation().hashCode();
         }

         if (this.getQuantityOnHand() != null) {
            _hashCode += this.getQuantityOnHand().hashCode();
         }

         if (this.getQuantityAvailable() != null) {
            _hashCode += this.getQuantityAvailable().hashCode();
         }

         if (this.getQuantityOnOrder() != null) {
            _hashCode += this.getQuantityOnOrder().hashCode();
         }

         if (this.getQuantityInTransit() != null) {
            _hashCode += this.getQuantityInTransit().hashCode();
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
      typeDesc.setXmlType(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "InventoryNumberLocations"));
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("location");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "location"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("quantityOnHand");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "quantityOnHand"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("quantityAvailable");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "quantityAvailable"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("quantityOnOrder");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "quantityOnOrder"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("quantityInTransit");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "quantityInTransit"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
   }
}
