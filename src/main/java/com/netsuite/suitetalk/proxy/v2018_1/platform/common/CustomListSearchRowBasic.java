package com.netsuite.suitetalk.proxy.v2018_1.platform.common;

import com.netsuite.suitetalk.proxy.v2018_1.platform.core.SearchColumnBooleanField;
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

public class CustomListSearchRowBasic extends SearchRowBasic implements Serializable {
   private SearchColumnStringField[] description;
   private SearchColumnSelectField[] internalId;
   private SearchColumnBooleanField[] isInactive;
   private SearchColumnBooleanField[] isOrdered;
   private SearchColumnStringField[] name;
   private SearchColumnSelectField[] owner;
   private SearchColumnStringField[] scriptId;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(CustomListSearchRowBasic.class, true);

   public CustomListSearchRowBasic() {
      super();
   }

   public CustomListSearchRowBasic(SearchColumnStringField[] description, SearchColumnSelectField[] internalId, SearchColumnBooleanField[] isInactive, SearchColumnBooleanField[] isOrdered, SearchColumnStringField[] name, SearchColumnSelectField[] owner, SearchColumnStringField[] scriptId) {
      super();
      this.description = description;
      this.internalId = internalId;
      this.isInactive = isInactive;
      this.isOrdered = isOrdered;
      this.name = name;
      this.owner = owner;
      this.scriptId = scriptId;
   }

   public SearchColumnStringField[] getDescription() {
      return this.description;
   }

   public void setDescription(SearchColumnStringField[] description) {
      this.description = description;
   }

   public SearchColumnStringField getDescription(int i) {
      return this.description[i];
   }

   public void setDescription(int i, SearchColumnStringField _value) {
      this.description[i] = _value;
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

   public SearchColumnBooleanField[] getIsOrdered() {
      return this.isOrdered;
   }

   public void setIsOrdered(SearchColumnBooleanField[] isOrdered) {
      this.isOrdered = isOrdered;
   }

   public SearchColumnBooleanField getIsOrdered(int i) {
      return this.isOrdered[i];
   }

   public void setIsOrdered(int i, SearchColumnBooleanField _value) {
      this.isOrdered[i] = _value;
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

   public SearchColumnSelectField[] getOwner() {
      return this.owner;
   }

   public void setOwner(SearchColumnSelectField[] owner) {
      this.owner = owner;
   }

   public SearchColumnSelectField getOwner(int i) {
      return this.owner[i];
   }

   public void setOwner(int i, SearchColumnSelectField _value) {
      this.owner[i] = _value;
   }

   public SearchColumnStringField[] getScriptId() {
      return this.scriptId;
   }

   public void setScriptId(SearchColumnStringField[] scriptId) {
      this.scriptId = scriptId;
   }

   public SearchColumnStringField getScriptId(int i) {
      return this.scriptId[i];
   }

   public void setScriptId(int i, SearchColumnStringField _value) {
      this.scriptId[i] = _value;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof CustomListSearchRowBasic)) {
         return false;
      } else {
         CustomListSearchRowBasic other = (CustomListSearchRowBasic)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = super.equals(obj) && (this.description == null && other.getDescription() == null || this.description != null && Arrays.equals(this.description, other.getDescription())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && Arrays.equals(this.internalId, other.getInternalId())) && (this.isInactive == null && other.getIsInactive() == null || this.isInactive != null && Arrays.equals(this.isInactive, other.getIsInactive())) && (this.isOrdered == null && other.getIsOrdered() == null || this.isOrdered != null && Arrays.equals(this.isOrdered, other.getIsOrdered())) && (this.name == null && other.getName() == null || this.name != null && Arrays.equals(this.name, other.getName())) && (this.owner == null && other.getOwner() == null || this.owner != null && Arrays.equals(this.owner, other.getOwner())) && (this.scriptId == null && other.getScriptId() == null || this.scriptId != null && Arrays.equals(this.scriptId, other.getScriptId()));
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
         if (this.getDescription() != null) {
            for(i = 0; i < Array.getLength(this.getDescription()); ++i) {
               obj = Array.get(this.getDescription(), i);
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

         if (this.getIsOrdered() != null) {
            for(i = 0; i < Array.getLength(this.getIsOrdered()); ++i) {
               obj = Array.get(this.getIsOrdered(), i);
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

         if (this.getOwner() != null) {
            for(i = 0; i < Array.getLength(this.getOwner()); ++i) {
               obj = Array.get(this.getOwner(), i);
               if (obj != null && !obj.getClass().isArray()) {
                  _hashCode += obj.hashCode();
               }
            }
         }

         if (this.getScriptId() != null) {
            for(i = 0; i < Array.getLength(this.getScriptId()); ++i) {
               obj = Array.get(this.getScriptId(), i);
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
      typeDesc.setXmlType(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "CustomListSearchRowBasic"));
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("description");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "description"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
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
      elemField.setFieldName("isOrdered");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "isOrdered"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
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
      elemField.setFieldName("owner");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "owner"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      elemField.setMaxOccursUnbounded(true);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("scriptId");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "scriptId"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      elemField.setMaxOccursUnbounded(true);
      typeDesc.addFieldDesc(elemField);
   }
}
