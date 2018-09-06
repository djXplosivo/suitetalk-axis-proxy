package com.netsuite.suitetalk.proxy.v2018_1.platform.common;

import com.netsuite.suitetalk.proxy.v2018_1.platform.core.SearchCustomFieldList;
import com.netsuite.suitetalk.proxy.v2018_1.platform.core.SearchDateField;
import com.netsuite.suitetalk.proxy.v2018_1.platform.core.SearchDoubleField;
import com.netsuite.suitetalk.proxy.v2018_1.platform.core.SearchEnumMultiSelectField;
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

public class InboundShipmentSearchBasic extends SearchRecordBasic implements Serializable {
   private SearchDateField actualDeliveryDate;
   private SearchDateField actualShippingDate;
   private SearchStringField billOfLading;
   private SearchDateField createdDate;
   private SearchMultiSelectField currency;
   private SearchStringField description;
   private SearchDateField expectedDeliveryDate;
   private SearchDoubleField expectedRate;
   private SearchDateField expectedShippingDate;
   private SearchMultiSelectField externalDocumentNumber;
   private SearchMultiSelectField externalId;
   private SearchStringField externalIdString;
   private SearchMultiSelectField incoterm;
   private SearchMultiSelectField internalId;
   private SearchLongField internalIdNumber;
   private SearchMultiSelectField item;
   private SearchStringField memo;
   private SearchDoubleField poAmount;
   private SearchDoubleField poRate;
   private SearchMultiSelectField purchaseOrder;
   private SearchDoubleField quantityBilled;
   private SearchDoubleField quantityExpected;
   private SearchDoubleField quantityReceived;
   private SearchDoubleField quantityRemaining;
   private SearchMultiSelectField receivingLocation;
   private SearchMultiSelectField shipmentNumber;
   private SearchEnumMultiSelectField status;
   private SearchMultiSelectField unit;
   private SearchMultiSelectField vendor;
   private SearchStringField vesselNumber;
   private SearchCustomFieldList customFieldList;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(InboundShipmentSearchBasic.class, true);

   public InboundShipmentSearchBasic() {
      super();
   }

   public InboundShipmentSearchBasic(SearchDateField actualDeliveryDate, SearchDateField actualShippingDate, SearchStringField billOfLading, SearchDateField createdDate, SearchMultiSelectField currency, SearchStringField description, SearchDateField expectedDeliveryDate, SearchDoubleField expectedRate, SearchDateField expectedShippingDate, SearchMultiSelectField externalDocumentNumber, SearchMultiSelectField externalId, SearchStringField externalIdString, SearchMultiSelectField incoterm, SearchMultiSelectField internalId, SearchLongField internalIdNumber, SearchMultiSelectField item, SearchStringField memo, SearchDoubleField poAmount, SearchDoubleField poRate, SearchMultiSelectField purchaseOrder, SearchDoubleField quantityBilled, SearchDoubleField quantityExpected, SearchDoubleField quantityReceived, SearchDoubleField quantityRemaining, SearchMultiSelectField receivingLocation, SearchMultiSelectField shipmentNumber, SearchEnumMultiSelectField status, SearchMultiSelectField unit, SearchMultiSelectField vendor, SearchStringField vesselNumber, SearchCustomFieldList customFieldList) {
      super();
      this.actualDeliveryDate = actualDeliveryDate;
      this.actualShippingDate = actualShippingDate;
      this.billOfLading = billOfLading;
      this.createdDate = createdDate;
      this.currency = currency;
      this.description = description;
      this.expectedDeliveryDate = expectedDeliveryDate;
      this.expectedRate = expectedRate;
      this.expectedShippingDate = expectedShippingDate;
      this.externalDocumentNumber = externalDocumentNumber;
      this.externalId = externalId;
      this.externalIdString = externalIdString;
      this.incoterm = incoterm;
      this.internalId = internalId;
      this.internalIdNumber = internalIdNumber;
      this.item = item;
      this.memo = memo;
      this.poAmount = poAmount;
      this.poRate = poRate;
      this.purchaseOrder = purchaseOrder;
      this.quantityBilled = quantityBilled;
      this.quantityExpected = quantityExpected;
      this.quantityReceived = quantityReceived;
      this.quantityRemaining = quantityRemaining;
      this.receivingLocation = receivingLocation;
      this.shipmentNumber = shipmentNumber;
      this.status = status;
      this.unit = unit;
      this.vendor = vendor;
      this.vesselNumber = vesselNumber;
      this.customFieldList = customFieldList;
   }

   public SearchDateField getActualDeliveryDate() {
      return this.actualDeliveryDate;
   }

   public void setActualDeliveryDate(SearchDateField actualDeliveryDate) {
      this.actualDeliveryDate = actualDeliveryDate;
   }

   public SearchDateField getActualShippingDate() {
      return this.actualShippingDate;
   }

   public void setActualShippingDate(SearchDateField actualShippingDate) {
      this.actualShippingDate = actualShippingDate;
   }

   public SearchStringField getBillOfLading() {
      return this.billOfLading;
   }

   public void setBillOfLading(SearchStringField billOfLading) {
      this.billOfLading = billOfLading;
   }

   public SearchDateField getCreatedDate() {
      return this.createdDate;
   }

   public void setCreatedDate(SearchDateField createdDate) {
      this.createdDate = createdDate;
   }

   public SearchMultiSelectField getCurrency() {
      return this.currency;
   }

   public void setCurrency(SearchMultiSelectField currency) {
      this.currency = currency;
   }

   public SearchStringField getDescription() {
      return this.description;
   }

   public void setDescription(SearchStringField description) {
      this.description = description;
   }

   public SearchDateField getExpectedDeliveryDate() {
      return this.expectedDeliveryDate;
   }

   public void setExpectedDeliveryDate(SearchDateField expectedDeliveryDate) {
      this.expectedDeliveryDate = expectedDeliveryDate;
   }

   public SearchDoubleField getExpectedRate() {
      return this.expectedRate;
   }

   public void setExpectedRate(SearchDoubleField expectedRate) {
      this.expectedRate = expectedRate;
   }

   public SearchDateField getExpectedShippingDate() {
      return this.expectedShippingDate;
   }

   public void setExpectedShippingDate(SearchDateField expectedShippingDate) {
      this.expectedShippingDate = expectedShippingDate;
   }

   public SearchMultiSelectField getExternalDocumentNumber() {
      return this.externalDocumentNumber;
   }

   public void setExternalDocumentNumber(SearchMultiSelectField externalDocumentNumber) {
      this.externalDocumentNumber = externalDocumentNumber;
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

   public SearchMultiSelectField getIncoterm() {
      return this.incoterm;
   }

   public void setIncoterm(SearchMultiSelectField incoterm) {
      this.incoterm = incoterm;
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

   public SearchMultiSelectField getItem() {
      return this.item;
   }

   public void setItem(SearchMultiSelectField item) {
      this.item = item;
   }

   public SearchStringField getMemo() {
      return this.memo;
   }

   public void setMemo(SearchStringField memo) {
      this.memo = memo;
   }

   public SearchDoubleField getPoAmount() {
      return this.poAmount;
   }

   public void setPoAmount(SearchDoubleField poAmount) {
      this.poAmount = poAmount;
   }

   public SearchDoubleField getPoRate() {
      return this.poRate;
   }

   public void setPoRate(SearchDoubleField poRate) {
      this.poRate = poRate;
   }

   public SearchMultiSelectField getPurchaseOrder() {
      return this.purchaseOrder;
   }

   public void setPurchaseOrder(SearchMultiSelectField purchaseOrder) {
      this.purchaseOrder = purchaseOrder;
   }

   public SearchDoubleField getQuantityBilled() {
      return this.quantityBilled;
   }

   public void setQuantityBilled(SearchDoubleField quantityBilled) {
      this.quantityBilled = quantityBilled;
   }

   public SearchDoubleField getQuantityExpected() {
      return this.quantityExpected;
   }

   public void setQuantityExpected(SearchDoubleField quantityExpected) {
      this.quantityExpected = quantityExpected;
   }

   public SearchDoubleField getQuantityReceived() {
      return this.quantityReceived;
   }

   public void setQuantityReceived(SearchDoubleField quantityReceived) {
      this.quantityReceived = quantityReceived;
   }

   public SearchDoubleField getQuantityRemaining() {
      return this.quantityRemaining;
   }

   public void setQuantityRemaining(SearchDoubleField quantityRemaining) {
      this.quantityRemaining = quantityRemaining;
   }

   public SearchMultiSelectField getReceivingLocation() {
      return this.receivingLocation;
   }

   public void setReceivingLocation(SearchMultiSelectField receivingLocation) {
      this.receivingLocation = receivingLocation;
   }

   public SearchMultiSelectField getShipmentNumber() {
      return this.shipmentNumber;
   }

   public void setShipmentNumber(SearchMultiSelectField shipmentNumber) {
      this.shipmentNumber = shipmentNumber;
   }

   public SearchEnumMultiSelectField getStatus() {
      return this.status;
   }

   public void setStatus(SearchEnumMultiSelectField status) {
      this.status = status;
   }

   public SearchMultiSelectField getUnit() {
      return this.unit;
   }

   public void setUnit(SearchMultiSelectField unit) {
      this.unit = unit;
   }

   public SearchMultiSelectField getVendor() {
      return this.vendor;
   }

   public void setVendor(SearchMultiSelectField vendor) {
      this.vendor = vendor;
   }

   public SearchStringField getVesselNumber() {
      return this.vesselNumber;
   }

   public void setVesselNumber(SearchStringField vesselNumber) {
      this.vesselNumber = vesselNumber;
   }

   public SearchCustomFieldList getCustomFieldList() {
      return this.customFieldList;
   }

   public void setCustomFieldList(SearchCustomFieldList customFieldList) {
      this.customFieldList = customFieldList;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof InboundShipmentSearchBasic)) {
         return false;
      } else {
         InboundShipmentSearchBasic other = (InboundShipmentSearchBasic)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = super.equals(obj) && (this.actualDeliveryDate == null && other.getActualDeliveryDate() == null || this.actualDeliveryDate != null && this.actualDeliveryDate.equals(other.getActualDeliveryDate())) && (this.actualShippingDate == null && other.getActualShippingDate() == null || this.actualShippingDate != null && this.actualShippingDate.equals(other.getActualShippingDate())) && (this.billOfLading == null && other.getBillOfLading() == null || this.billOfLading != null && this.billOfLading.equals(other.getBillOfLading())) && (this.createdDate == null && other.getCreatedDate() == null || this.createdDate != null && this.createdDate.equals(other.getCreatedDate())) && (this.currency == null && other.getCurrency() == null || this.currency != null && this.currency.equals(other.getCurrency())) && (this.description == null && other.getDescription() == null || this.description != null && this.description.equals(other.getDescription())) && (this.expectedDeliveryDate == null && other.getExpectedDeliveryDate() == null || this.expectedDeliveryDate != null && this.expectedDeliveryDate.equals(other.getExpectedDeliveryDate())) && (this.expectedRate == null && other.getExpectedRate() == null || this.expectedRate != null && this.expectedRate.equals(other.getExpectedRate())) && (this.expectedShippingDate == null && other.getExpectedShippingDate() == null || this.expectedShippingDate != null && this.expectedShippingDate.equals(other.getExpectedShippingDate())) && (this.externalDocumentNumber == null && other.getExternalDocumentNumber() == null || this.externalDocumentNumber != null && this.externalDocumentNumber.equals(other.getExternalDocumentNumber())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && this.externalId.equals(other.getExternalId())) && (this.externalIdString == null && other.getExternalIdString() == null || this.externalIdString != null && this.externalIdString.equals(other.getExternalIdString())) && (this.incoterm == null && other.getIncoterm() == null || this.incoterm != null && this.incoterm.equals(other.getIncoterm())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && this.internalId.equals(other.getInternalId())) && (this.internalIdNumber == null && other.getInternalIdNumber() == null || this.internalIdNumber != null && this.internalIdNumber.equals(other.getInternalIdNumber())) && (this.item == null && other.getItem() == null || this.item != null && this.item.equals(other.getItem())) && (this.memo == null && other.getMemo() == null || this.memo != null && this.memo.equals(other.getMemo())) && (this.poAmount == null && other.getPoAmount() == null || this.poAmount != null && this.poAmount.equals(other.getPoAmount())) && (this.poRate == null && other.getPoRate() == null || this.poRate != null && this.poRate.equals(other.getPoRate())) && (this.purchaseOrder == null && other.getPurchaseOrder() == null || this.purchaseOrder != null && this.purchaseOrder.equals(other.getPurchaseOrder())) && (this.quantityBilled == null && other.getQuantityBilled() == null || this.quantityBilled != null && this.quantityBilled.equals(other.getQuantityBilled())) && (this.quantityExpected == null && other.getQuantityExpected() == null || this.quantityExpected != null && this.quantityExpected.equals(other.getQuantityExpected())) && (this.quantityReceived == null && other.getQuantityReceived() == null || this.quantityReceived != null && this.quantityReceived.equals(other.getQuantityReceived())) && (this.quantityRemaining == null && other.getQuantityRemaining() == null || this.quantityRemaining != null && this.quantityRemaining.equals(other.getQuantityRemaining())) && (this.receivingLocation == null && other.getReceivingLocation() == null || this.receivingLocation != null && this.receivingLocation.equals(other.getReceivingLocation())) && (this.shipmentNumber == null && other.getShipmentNumber() == null || this.shipmentNumber != null && this.shipmentNumber.equals(other.getShipmentNumber())) && (this.status == null && other.getStatus() == null || this.status != null && this.status.equals(other.getStatus())) && (this.unit == null && other.getUnit() == null || this.unit != null && this.unit.equals(other.getUnit())) && (this.vendor == null && other.getVendor() == null || this.vendor != null && this.vendor.equals(other.getVendor())) && (this.vesselNumber == null && other.getVesselNumber() == null || this.vesselNumber != null && this.vesselNumber.equals(other.getVesselNumber())) && (this.customFieldList == null && other.getCustomFieldList() == null || this.customFieldList != null && this.customFieldList.equals(other.getCustomFieldList()));
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
         if (this.getActualDeliveryDate() != null) {
            _hashCode += this.getActualDeliveryDate().hashCode();
         }

         if (this.getActualShippingDate() != null) {
            _hashCode += this.getActualShippingDate().hashCode();
         }

         if (this.getBillOfLading() != null) {
            _hashCode += this.getBillOfLading().hashCode();
         }

         if (this.getCreatedDate() != null) {
            _hashCode += this.getCreatedDate().hashCode();
         }

         if (this.getCurrency() != null) {
            _hashCode += this.getCurrency().hashCode();
         }

         if (this.getDescription() != null) {
            _hashCode += this.getDescription().hashCode();
         }

         if (this.getExpectedDeliveryDate() != null) {
            _hashCode += this.getExpectedDeliveryDate().hashCode();
         }

         if (this.getExpectedRate() != null) {
            _hashCode += this.getExpectedRate().hashCode();
         }

         if (this.getExpectedShippingDate() != null) {
            _hashCode += this.getExpectedShippingDate().hashCode();
         }

         if (this.getExternalDocumentNumber() != null) {
            _hashCode += this.getExternalDocumentNumber().hashCode();
         }

         if (this.getExternalId() != null) {
            _hashCode += this.getExternalId().hashCode();
         }

         if (this.getExternalIdString() != null) {
            _hashCode += this.getExternalIdString().hashCode();
         }

         if (this.getIncoterm() != null) {
            _hashCode += this.getIncoterm().hashCode();
         }

         if (this.getInternalId() != null) {
            _hashCode += this.getInternalId().hashCode();
         }

         if (this.getInternalIdNumber() != null) {
            _hashCode += this.getInternalIdNumber().hashCode();
         }

         if (this.getItem() != null) {
            _hashCode += this.getItem().hashCode();
         }

         if (this.getMemo() != null) {
            _hashCode += this.getMemo().hashCode();
         }

         if (this.getPoAmount() != null) {
            _hashCode += this.getPoAmount().hashCode();
         }

         if (this.getPoRate() != null) {
            _hashCode += this.getPoRate().hashCode();
         }

         if (this.getPurchaseOrder() != null) {
            _hashCode += this.getPurchaseOrder().hashCode();
         }

         if (this.getQuantityBilled() != null) {
            _hashCode += this.getQuantityBilled().hashCode();
         }

         if (this.getQuantityExpected() != null) {
            _hashCode += this.getQuantityExpected().hashCode();
         }

         if (this.getQuantityReceived() != null) {
            _hashCode += this.getQuantityReceived().hashCode();
         }

         if (this.getQuantityRemaining() != null) {
            _hashCode += this.getQuantityRemaining().hashCode();
         }

         if (this.getReceivingLocation() != null) {
            _hashCode += this.getReceivingLocation().hashCode();
         }

         if (this.getShipmentNumber() != null) {
            _hashCode += this.getShipmentNumber().hashCode();
         }

         if (this.getStatus() != null) {
            _hashCode += this.getStatus().hashCode();
         }

         if (this.getUnit() != null) {
            _hashCode += this.getUnit().hashCode();
         }

         if (this.getVendor() != null) {
            _hashCode += this.getVendor().hashCode();
         }

         if (this.getVesselNumber() != null) {
            _hashCode += this.getVesselNumber().hashCode();
         }

         if (this.getCustomFieldList() != null) {
            _hashCode += this.getCustomFieldList().hashCode();
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
      typeDesc.setXmlType(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "InboundShipmentSearchBasic"));
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("actualDeliveryDate");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "actualDeliveryDate"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchDateField"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("actualShippingDate");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "actualShippingDate"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchDateField"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("billOfLading");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "billOfLading"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchStringField"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("createdDate");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "createdDate"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchDateField"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("currency");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "currency"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("description");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "description"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchStringField"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("expectedDeliveryDate");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "expectedDeliveryDate"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchDateField"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("expectedRate");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "expectedRate"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchDoubleField"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("expectedShippingDate");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "expectedShippingDate"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchDateField"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("externalDocumentNumber");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "externalDocumentNumber"));
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
      elemField.setFieldName("incoterm");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "incoterm"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
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
      elemField.setFieldName("item");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "item"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("memo");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "memo"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchStringField"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("poAmount");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "poAmount"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchDoubleField"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("poRate");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "poRate"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchDoubleField"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("purchaseOrder");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "purchaseOrder"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("quantityBilled");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "quantityBilled"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchDoubleField"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("quantityExpected");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "quantityExpected"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchDoubleField"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("quantityReceived");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "quantityReceived"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchDoubleField"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("quantityRemaining");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "quantityRemaining"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchDoubleField"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("receivingLocation");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "receivingLocation"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("shipmentNumber");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "shipmentNumber"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("status");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "status"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("unit");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "unit"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("vendor");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "vendor"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("vesselNumber");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "vesselNumber"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchStringField"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("customFieldList");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "customFieldList"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchCustomFieldList"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
   }
}
