package com.netsuite.suitetalk.proxy.v2018_1.platform.common;

import com.netsuite.suitetalk.proxy.v2018_1.platform.core.SearchColumnBooleanField;
import com.netsuite.suitetalk.proxy.v2018_1.platform.core.SearchColumnDateField;
import com.netsuite.suitetalk.proxy.v2018_1.platform.core.SearchColumnSelectField;
import com.netsuite.suitetalk.proxy.v2018_1.platform.core.SearchColumnStringField;
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

public class ItemRevisionSearchRowBasic extends SearchRowBasic implements Serializable {
   private SearchColumnDateField[] effectiveDate;
   private SearchColumnSelectField[] externalId;
   private SearchColumnSelectField[] internalId;
   private SearchColumnBooleanField[] isInactive;
   private SearchColumnSelectField[] item;
   private SearchColumnStringField[] memo;
   private SearchColumnStringField[] name;
   private SearchColumnDateField[] obsoleteDate;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(ItemRevisionSearchRowBasic.class, true);

   public ItemRevisionSearchRowBasic() {
      super();
   }

   public ItemRevisionSearchRowBasic(SearchColumnDateField[] effectiveDate, SearchColumnSelectField[] externalId, SearchColumnSelectField[] internalId, SearchColumnBooleanField[] isInactive, SearchColumnSelectField[] item, SearchColumnStringField[] memo, SearchColumnStringField[] name, SearchColumnDateField[] obsoleteDate) {
      super();
      this.effectiveDate = effectiveDate;
      this.externalId = externalId;
      this.internalId = internalId;
      this.isInactive = isInactive;
      this.item = item;
      this.memo = memo;
      this.name = name;
      this.obsoleteDate = obsoleteDate;
   }

   public SearchColumnDateField[] getEffectiveDate() {
      return this.effectiveDate;
   }

   public void setEffectiveDate(SearchColumnDateField[] effectiveDate) {
      this.effectiveDate = effectiveDate;
   }

   public SearchColumnDateField getEffectiveDate(int i) {
      return this.effectiveDate[i];
   }

   public void setEffectiveDate(int i, SearchColumnDateField _value) {
      this.effectiveDate[i] = _value;
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

   public SearchColumnBooleanField[] getIsInactive() {
      return this.isInactive;
   }

   public void setIsInactive(SearchColumnBooleanField[] isInactive) {
      this.isInactive = isInactive;
   }

   public SearchColumnBooleanField getIsInactive(int i) {
      return this.isInactive[i];
   }

   public void setIsInactive(int i, SearchColumnBooleanField _value) {
      this.isInactive[i] = _value;
   }

   public SearchColumnSelectField[] getItem() {
      return this.item;
   }

   public void setItem(SearchColumnSelectField[] item) {
      this.item = item;
   }

   public SearchColumnSelectField getItem(int i) {
      return this.item[i];
   }

   public void setItem(int i, SearchColumnSelectField _value) {
      this.item[i] = _value;
   }

   public SearchColumnStringField[] getMemo() {
      return this.memo;
   }

   public void setMemo(SearchColumnStringField[] memo) {
      this.memo = memo;
   }

   public SearchColumnStringField getMemo(int i) {
      return this.memo[i];
   }

   public void setMemo(int i, SearchColumnStringField _value) {
      this.memo[i] = _value;
   }

   public SearchColumnStringField[] getName() {
      return this.name;
   }

   public void setName(SearchColumnStringField[] name) {
      this.name = name;
   }

   public SearchColumnStringField getName(int i) {
      return this.name[i];
   }

   public void setName(int i, SearchColumnStringField _value) {
      this.name[i] = _value;
   }

   public SearchColumnDateField[] getObsoleteDate() {
      return this.obsoleteDate;
   }

   public void setObsoleteDate(SearchColumnDateField[] obsoleteDate) {
      this.obsoleteDate = obsoleteDate;
   }

   public SearchColumnDateField getObsoleteDate(int i) {
      return this.obsoleteDate[i];
   }

   public void setObsoleteDate(int i, SearchColumnDateField _value) {
      this.obsoleteDate[i] = _value;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof ItemRevisionSearchRowBasic)) {
         return false;
      } else {
         ItemRevisionSearchRowBasic other = (ItemRevisionSearchRowBasic)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = super.equals(obj) && (this.effectiveDate == null && other.getEffectiveDate() == null || this.effectiveDate != null && Arrays.equals(this.effectiveDate, other.getEffectiveDate())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && Arrays.equals(this.externalId, other.getExternalId())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && Arrays.equals(this.internalId, other.getInternalId())) && (this.isInactive == null && other.getIsInactive() == null || this.isInactive != null && Arrays.equals(this.isInactive, other.getIsInactive())) && (this.item == null && other.getItem() == null || this.item != null && Arrays.equals(this.item, other.getItem())) && (this.memo == null && other.getMemo() == null || this.memo != null && Arrays.equals(this.memo, other.getMemo())) && (this.name == null && other.getName() == null || this.name != null && Arrays.equals(this.name, other.getName())) && (this.obsoleteDate == null && other.getObsoleteDate() == null || this.obsoleteDate != null && Arrays.equals(this.obsoleteDate, other.getObsoleteDate()));
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
         if (this.getEffectiveDate() != null) {
            for(i = 0; i < Array.getLength(this.getEffectiveDate()); ++i) {
               obj = Array.get(this.getEffectiveDate(), i);
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

         if (this.getIsInactive() != null) {
            for(i = 0; i < Array.getLength(this.getIsInactive()); ++i) {
               obj = Array.get(this.getIsInactive(), i);
               if (obj != null && !obj.getClass().isArray()) {
                  _hashCode += obj.hashCode();
               }
            }
         }

         if (this.getItem() != null) {
            for(i = 0; i < Array.getLength(this.getItem()); ++i) {
               obj = Array.get(this.getItem(), i);
               if (obj != null && !obj.getClass().isArray()) {
                  _hashCode += obj.hashCode();
               }
            }
         }

         if (this.getMemo() != null) {
            for(i = 0; i < Array.getLength(this.getMemo()); ++i) {
               obj = Array.get(this.getMemo(), i);
               if (obj != null && !obj.getClass().isArray()) {
                  _hashCode += obj.hashCode();
               }
            }
         }

         if (this.getName() != null) {
            for(i = 0; i < Array.getLength(this.getName()); ++i) {
               obj = Array.get(this.getName(), i);
               if (obj != null && !obj.getClass().isArray()) {
                  _hashCode += obj.hashCode();
               }
            }
         }

         if (this.getObsoleteDate() != null) {
            for(i = 0; i < Array.getLength(this.getObsoleteDate()); ++i) {
               obj = Array.get(this.getObsoleteDate(), i);
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
      typeDesc.setXmlType(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "ItemRevisionSearchRowBasic"));
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("effectiveDate");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "effectiveDate"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
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
      elemField.setFieldName("isInactive");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "isInactive"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      elemField.setMaxOccursUnbounded(true);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("item");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "item"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      elemField.setMaxOccursUnbounded(true);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("memo");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "memo"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      elemField.setMaxOccursUnbounded(true);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("name");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "name"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      elemField.setMaxOccursUnbounded(true);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("obsoleteDate");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "obsoleteDate"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      elemField.setMaxOccursUnbounded(true);
      typeDesc.addFieldDesc(elemField);
   }
}
