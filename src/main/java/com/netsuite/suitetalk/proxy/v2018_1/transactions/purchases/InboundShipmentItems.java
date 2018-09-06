package com.netsuite.suitetalk.proxy.v2018_1.transactions.purchases;

import com.netsuite.suitetalk.proxy.v2018_1.platform.core.RecordRef;
import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class InboundShipmentItems implements Serializable {
   private Long id;
   private RecordRef purchaseOrder;
   private RecordRef shipmentItem;
   private String shipmentItemDescription;
   private String poVendor;
   private RecordRef receivingLocation;
   private Double quantityReceived;
   private Double quantityExpected;
   private Double quantityRemaining;
   private RecordRef unit;
   private Double poRate;
   private Double expectedRate;
   private Double shipmentItemAmount;
   private RecordRef poCurrency;
   private RecordRef incoterm;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(InboundShipmentItems.class, true);

   public InboundShipmentItems() {
      super();
   }

   public InboundShipmentItems(Long id, RecordRef purchaseOrder, RecordRef shipmentItem, String shipmentItemDescription, String poVendor, RecordRef receivingLocation, Double quantityReceived, Double quantityExpected, Double quantityRemaining, RecordRef unit, Double poRate, Double expectedRate, Double shipmentItemAmount, RecordRef poCurrency, RecordRef incoterm) {
      super();
      this.id = id;
      this.purchaseOrder = purchaseOrder;
      this.shipmentItem = shipmentItem;
      this.shipmentItemDescription = shipmentItemDescription;
      this.poVendor = poVendor;
      this.receivingLocation = receivingLocation;
      this.quantityReceived = quantityReceived;
      this.quantityExpected = quantityExpected;
      this.quantityRemaining = quantityRemaining;
      this.unit = unit;
      this.poRate = poRate;
      this.expectedRate = expectedRate;
      this.shipmentItemAmount = shipmentItemAmount;
      this.poCurrency = poCurrency;
      this.incoterm = incoterm;
   }

   public Long getId() {
      return this.id;
   }

   public void setId(Long id) {
      this.id = id;
   }

   public RecordRef getPurchaseOrder() {
      return this.purchaseOrder;
   }

   public void setPurchaseOrder(RecordRef purchaseOrder) {
      this.purchaseOrder = purchaseOrder;
   }

   public RecordRef getShipmentItem() {
      return this.shipmentItem;
   }

   public void setShipmentItem(RecordRef shipmentItem) {
      this.shipmentItem = shipmentItem;
   }

   public String getShipmentItemDescription() {
      return this.shipmentItemDescription;
   }

   public void setShipmentItemDescription(String shipmentItemDescription) {
      this.shipmentItemDescription = shipmentItemDescription;
   }

   public String getPoVendor() {
      return this.poVendor;
   }

   public void setPoVendor(String poVendor) {
      this.poVendor = poVendor;
   }

   public RecordRef getReceivingLocation() {
      return this.receivingLocation;
   }

   public void setReceivingLocation(RecordRef receivingLocation) {
      this.receivingLocation = receivingLocation;
   }

   public Double getQuantityReceived() {
      return this.quantityReceived;
   }

   public void setQuantityReceived(Double quantityReceived) {
      this.quantityReceived = quantityReceived;
   }

   public Double getQuantityExpected() {
      return this.quantityExpected;
   }

   public void setQuantityExpected(Double quantityExpected) {
      this.quantityExpected = quantityExpected;
   }

   public Double getQuantityRemaining() {
      return this.quantityRemaining;
   }

   public void setQuantityRemaining(Double quantityRemaining) {
      this.quantityRemaining = quantityRemaining;
   }

   public RecordRef getUnit() {
      return this.unit;
   }

   public void setUnit(RecordRef unit) {
      this.unit = unit;
   }

   public Double getPoRate() {
      return this.poRate;
   }

   public void setPoRate(Double poRate) {
      this.poRate = poRate;
   }

   public Double getExpectedRate() {
      return this.expectedRate;
   }

   public void setExpectedRate(Double expectedRate) {
      this.expectedRate = expectedRate;
   }

   public Double getShipmentItemAmount() {
      return this.shipmentItemAmount;
   }

   public void setShipmentItemAmount(Double shipmentItemAmount) {
      this.shipmentItemAmount = shipmentItemAmount;
   }

   public RecordRef getPoCurrency() {
      return this.poCurrency;
   }

   public void setPoCurrency(RecordRef poCurrency) {
      this.poCurrency = poCurrency;
   }

   public RecordRef getIncoterm() {
      return this.incoterm;
   }

   public void setIncoterm(RecordRef incoterm) {
      this.incoterm = incoterm;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof InboundShipmentItems)) {
         return false;
      } else {
         InboundShipmentItems other = (InboundShipmentItems)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = (this.id == null && other.getId() == null || this.id != null && this.id.equals(other.getId())) && (this.purchaseOrder == null && other.getPurchaseOrder() == null || this.purchaseOrder != null && this.purchaseOrder.equals(other.getPurchaseOrder())) && (this.shipmentItem == null && other.getShipmentItem() == null || this.shipmentItem != null && this.shipmentItem.equals(other.getShipmentItem())) && (this.shipmentItemDescription == null && other.getShipmentItemDescription() == null || this.shipmentItemDescription != null && this.shipmentItemDescription.equals(other.getShipmentItemDescription())) && (this.poVendor == null && other.getPoVendor() == null || this.poVendor != null && this.poVendor.equals(other.getPoVendor())) && (this.receivingLocation == null && other.getReceivingLocation() == null || this.receivingLocation != null && this.receivingLocation.equals(other.getReceivingLocation())) && (this.quantityReceived == null && other.getQuantityReceived() == null || this.quantityReceived != null && this.quantityReceived.equals(other.getQuantityReceived())) && (this.quantityExpected == null && other.getQuantityExpected() == null || this.quantityExpected != null && this.quantityExpected.equals(other.getQuantityExpected())) && (this.quantityRemaining == null && other.getQuantityRemaining() == null || this.quantityRemaining != null && this.quantityRemaining.equals(other.getQuantityRemaining())) && (this.unit == null && other.getUnit() == null || this.unit != null && this.unit.equals(other.getUnit())) && (this.poRate == null && other.getPoRate() == null || this.poRate != null && this.poRate.equals(other.getPoRate())) && (this.expectedRate == null && other.getExpectedRate() == null || this.expectedRate != null && this.expectedRate.equals(other.getExpectedRate())) && (this.shipmentItemAmount == null && other.getShipmentItemAmount() == null || this.shipmentItemAmount != null && this.shipmentItemAmount.equals(other.getShipmentItemAmount())) && (this.poCurrency == null && other.getPoCurrency() == null || this.poCurrency != null && this.poCurrency.equals(other.getPoCurrency())) && (this.incoterm == null && other.getIncoterm() == null || this.incoterm != null && this.incoterm.equals(other.getIncoterm()));
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
         if (this.getId() != null) {
            _hashCode += this.getId().hashCode();
         }

         if (this.getPurchaseOrder() != null) {
            _hashCode += this.getPurchaseOrder().hashCode();
         }

         if (this.getShipmentItem() != null) {
            _hashCode += this.getShipmentItem().hashCode();
         }

         if (this.getShipmentItemDescription() != null) {
            _hashCode += this.getShipmentItemDescription().hashCode();
         }

         if (this.getPoVendor() != null) {
            _hashCode += this.getPoVendor().hashCode();
         }

         if (this.getReceivingLocation() != null) {
            _hashCode += this.getReceivingLocation().hashCode();
         }

         if (this.getQuantityReceived() != null) {
            _hashCode += this.getQuantityReceived().hashCode();
         }

         if (this.getQuantityExpected() != null) {
            _hashCode += this.getQuantityExpected().hashCode();
         }

         if (this.getQuantityRemaining() != null) {
            _hashCode += this.getQuantityRemaining().hashCode();
         }

         if (this.getUnit() != null) {
            _hashCode += this.getUnit().hashCode();
         }

         if (this.getPoRate() != null) {
            _hashCode += this.getPoRate().hashCode();
         }

         if (this.getExpectedRate() != null) {
            _hashCode += this.getExpectedRate().hashCode();
         }

         if (this.getShipmentItemAmount() != null) {
            _hashCode += this.getShipmentItemAmount().hashCode();
         }

         if (this.getPoCurrency() != null) {
            _hashCode += this.getPoCurrency().hashCode();
         }

         if (this.getIncoterm() != null) {
            _hashCode += this.getIncoterm().hashCode();
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
      typeDesc.setXmlType(new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "InboundShipmentItems"));
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("id");
      elemField.setXmlName(new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "id"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "long"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("purchaseOrder");
      elemField.setXmlName(new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "purchaseOrder"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("shipmentItem");
      elemField.setXmlName(new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "shipmentItem"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("shipmentItemDescription");
      elemField.setXmlName(new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "shipmentItemDescription"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("poVendor");
      elemField.setXmlName(new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "poVendor"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("receivingLocation");
      elemField.setXmlName(new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "receivingLocation"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("quantityReceived");
      elemField.setXmlName(new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "quantityReceived"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("quantityExpected");
      elemField.setXmlName(new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "quantityExpected"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("quantityRemaining");
      elemField.setXmlName(new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "quantityRemaining"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("unit");
      elemField.setXmlName(new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "unit"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("poRate");
      elemField.setXmlName(new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "poRate"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("expectedRate");
      elemField.setXmlName(new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "expectedRate"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("shipmentItemAmount");
      elemField.setXmlName(new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "shipmentItemAmount"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("poCurrency");
      elemField.setXmlName(new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "poCurrency"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("incoterm");
      elemField.setXmlName(new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "incoterm"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
   }
}
