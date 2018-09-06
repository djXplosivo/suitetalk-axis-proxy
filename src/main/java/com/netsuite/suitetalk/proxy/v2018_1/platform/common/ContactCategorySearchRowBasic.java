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

public class ContactCategorySearchRowBasic extends SearchRowBasic implements Serializable {
   private SearchColumnSelectField[] externalId;
   private SearchColumnSelectField[] internalId;
   private SearchColumnBooleanField[] isInactive;
   private SearchColumnStringField[] name;
   private SearchColumnBooleanField[] _private;
   private SearchColumnBooleanField[] sync;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(ContactCategorySearchRowBasic.class, true);

   public ContactCategorySearchRowBasic() {
      super();
   }

   public ContactCategorySearchRowBasic(SearchColumnSelectField[] externalId, SearchColumnSelectField[] internalId, SearchColumnBooleanField[] isInactive, SearchColumnStringField[] name, SearchColumnBooleanField[] _private, SearchColumnBooleanField[] sync) {
      super();
      this.externalId = externalId;
      this.internalId = internalId;
      this.isInactive = isInactive;
      this.name = name;
      this._private = _private;
      this.sync = sync;
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

   public SearchColumnBooleanField[] get_private() {
      return this._private;
   }

   public void set_private(SearchColumnBooleanField[] _private) {
      this._private = _private;
   }

   public SearchColumnBooleanField get_private(int i) {
      return this._private[i];
   }

   public void set_private(int i, SearchColumnBooleanField _value) {
      this._private[i] = _value;
   }

   public SearchColumnBooleanField[] getSync() {
      return this.sync;
   }

   public void setSync(SearchColumnBooleanField[] sync) {
      this.sync = sync;
   }

   public SearchColumnBooleanField getSync(int i) {
      return this.sync[i];
   }

   public void setSync(int i, SearchColumnBooleanField _value) {
      this.sync[i] = _value;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof ContactCategorySearchRowBasic)) {
         return false;
      } else {
         ContactCategorySearchRowBasic other = (ContactCategorySearchRowBasic)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = super.equals(obj) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && Arrays.equals(this.externalId, other.getExternalId())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && Arrays.equals(this.internalId, other.getInternalId())) && (this.isInactive == null && other.getIsInactive() == null || this.isInactive != null && Arrays.equals(this.isInactive, other.getIsInactive())) && (this.name == null && other.getName() == null || this.name != null && Arrays.equals(this.name, other.getName())) && (this._private == null && other.get_private() == null || this._private != null && Arrays.equals(this._private, other.get_private())) && (this.sync == null && other.getSync() == null || this.sync != null && Arrays.equals(this.sync, other.getSync()));
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

         if (this.getName() != null) {
            for(i = 0; i < Array.getLength(this.getName()); ++i) {
               obj = Array.get(this.getName(), i);
               if (obj != null && !obj.getClass().isArray()) {
                  _hashCode += obj.hashCode();
               }
            }
         }

         if (this.get_private() != null) {
            for(i = 0; i < Array.getLength(this.get_private()); ++i) {
               obj = Array.get(this.get_private(), i);
               if (obj != null && !obj.getClass().isArray()) {
                  _hashCode += obj.hashCode();
               }
            }
         }

         if (this.getSync() != null) {
            for(i = 0; i < Array.getLength(this.getSync()); ++i) {
               obj = Array.get(this.getSync(), i);
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
      typeDesc.setXmlType(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "ContactCategorySearchRowBasic"));
      ElementDesc elemField = new ElementDesc();
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
      elemField.setFieldName("name");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "name"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      elemField.setMaxOccursUnbounded(true);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("_private");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "private"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      elemField.setMaxOccursUnbounded(true);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("sync");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "sync"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      elemField.setMaxOccursUnbounded(true);
      typeDesc.addFieldDesc(elemField);
   }
}
