package com.netsuite.suitetalk.proxy.v2018_1.platform.common;

import com.netsuite.suitetalk.proxy.v2018_1.platform.core.SearchColumnDoubleField;
import com.netsuite.suitetalk.proxy.v2018_1.platform.core.SearchColumnSelectField;
import com.netsuite.suitetalk.proxy.v2018_1.platform.core.SearchRowBasic;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Arrays;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class InventoryDetailSearchRowBasic extends SearchRowBasic implements Serializable {
   private SearchColumnSelectField[] binNumber;
   private SearchColumnSelectField[] externalId;
   private SearchColumnSelectField[] internalId;
   private SearchColumnSelectField[] inventoryNumber;
   private SearchColumnDoubleField[] quantity;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(InventoryDetailSearchRowBasic.class, true);

   public InventoryDetailSearchRowBasic() {
      super();
   }

   public InventoryDetailSearchRowBasic(SearchColumnSelectField[] binNumber, SearchColumnSelectField[] externalId, SearchColumnSelectField[] internalId, SearchColumnSelectField[] inventoryNumber, SearchColumnDoubleField[] quantity) {
      super();
      this.binNumber = binNumber;
      this.externalId = externalId;
      this.internalId = internalId;
      this.inventoryNumber = inventoryNumber;
      this.quantity = quantity;
   }

   public SearchColumnSelectField[] getBinNumber() {
      return this.binNumber;
   }

   public void setBinNumber(SearchColumnSelectField[] binNumber) {
      this.binNumber = binNumber;
   }

   public SearchColumnSelectField getBinNumber(int i) {
      return this.binNumber[i];
   }

   public void setBinNumber(int i, SearchColumnSelectField _value) {
      this.binNumber[i] = _value;
   }

   public SearchColumnSelectField[] getExternalId() {
      return this.externalId;
   }

   public void setExternalId(SearchColumnSelectField[] externalId) {
      this.externalId = externalId;
   }

   public SearchColumnSelectField getExternalId(int i) {
      return this.externalId[i];
   }

   public void setExternalId(int i, SearchColumnSelectField _value) {
      this.externalId[i] = _value;
   }

   public SearchColumnSelectField[] getInternalId() {
      return this.internalId;
   }

   public void setInternalId(SearchColumnSelectField[] internalId) {
      this.internalId = internalId;
   }

   public SearchColumnSelectField getInternalId(int i) {
      return this.internalId[i];
   }

   public void setInternalId(int i, SearchColumnSelectField _value) {
      this.internalId[i] = _value;
   }

   public SearchColumnSelectField[] getInventoryNumber() {
      return this.inventoryNumber;
   }

   public void setInventoryNumber(SearchColumnSelectField[] inventoryNumber) {
      this.inventoryNumber = inventoryNumber;
   }

   public SearchColumnSelectField getInventoryNumber(int i) {
      return this.inventoryNumber[i];
   }

   public void setInventoryNumber(int i, SearchColumnSelectField _value) {
      this.inventoryNumber[i] = _value;
   }

   public SearchColumnDoubleField[] getQuantity() {
      return this.quantity;
   }

   public void setQuantity(SearchColumnDoubleField[] quantity) {
      this.quantity = quantity;
   }

   public SearchColumnDoubleField getQuantity(int i) {
      return this.quantity[i];
   }

   public void setQuantity(int i, SearchColumnDoubleField _value) {
      this.quantity[i] = _value;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof InventoryDetailSearchRowBasic)) {
         return false;
      } else {
         InventoryDetailSearchRowBasic other = (InventoryDetailSearchRowBasic)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = super.equals(obj) && (this.binNumber == null && other.getBinNumber() == null || this.binNumber != null && Arrays.equals(this.binNumber, other.getBinNumber())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && Arrays.equals(this.externalId, other.getExternalId())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && Arrays.equals(this.internalId, other.getInternalId())) && (this.inventoryNumber == null && other.getInventoryNumber() == null || this.inventoryNumber != null && Arrays.equals(this.inventoryNumber, other.getInventoryNumber())) && (this.quantity == null && other.getQuantity() == null || this.quantity != null && Arrays.equals(this.quantity, other.getQuantity()));
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
         int i;
         Object obj;
         if (this.getBinNumber() != null) {
            for(i = 0; i < Array.getLength(this.getBinNumber()); ++i) {
               obj = Array.get(this.getBinNumber(), i);
               if (obj != null && !obj.getClass().isArray()) {
                  _hashCode += obj.hashCode();
               }
            }
         }

         if (this.getExternalId() != null) {
            for(i = 0; i < Array.getLength(this.getExternalId()); ++i) {
               obj = Array.get(this.getExternalId(), i);
               if (obj != null && !obj.getClass().isArray()) {
                  _hashCode += obj.hashCode();
               }
            }
         }

         if (this.getInternalId() != null) {
            for(i = 0; i < Array.getLength(this.getInternalId()); ++i) {
               obj = Array.get(this.getInternalId(), i);
               if (obj != null && !obj.getClass().isArray()) {
                  _hashCode += obj.hashCode();
               }
            }
         }

         if (this.getInventoryNumber() != null) {
            for(i = 0; i < Array.getLength(this.getInventoryNumber()); ++i) {
               obj = Array.get(this.getInventoryNumber(), i);
               if (obj != null && !obj.getClass().isArray()) {
                  _hashCode += obj.hashCode();
               }
            }
         }

         if (this.getQuantity() != null) {
            for(i = 0; i < Array.getLength(this.getQuantity()); ++i) {
               obj = Array.get(this.getQuantity(), i);
               if (obj != null && !obj.getClass().isArray()) {
                  _hashCode += obj.hashCode();
               }
            }
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
      typeDesc.setXmlType(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "InventoryDetailSearchRowBasic"));
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("binNumber");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "binNumber"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      elemField.setMaxOccursUnbounded(true);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("externalId");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "externalId"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      elemField.setMaxOccursUnbounded(true);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("internalId");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "internalId"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      elemField.setMaxOccursUnbounded(true);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("inventoryNumber");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "inventoryNumber"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      elemField.setMaxOccursUnbounded(true);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("quantity");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "quantity"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      elemField.setMaxOccursUnbounded(true);
      typeDesc.addFieldDesc(elemField);
   }
}
