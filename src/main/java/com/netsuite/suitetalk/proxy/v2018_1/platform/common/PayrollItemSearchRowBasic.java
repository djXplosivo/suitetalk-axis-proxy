package com.netsuite.suitetalk.proxy.v2018_1.platform.common;

import com.netsuite.suitetalk.proxy.v2018_1.platform.core.SearchColumnBooleanField;
import com.netsuite.suitetalk.proxy.v2018_1.platform.core.SearchColumnCustomFieldList;
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

public class PayrollItemSearchRowBasic extends SearchRowBasic implements Serializable {
   private SearchColumnSelectField[] externalId;
   private SearchColumnSelectField[] internalId;
   private SearchColumnStringField[] expenseAccount;
   private SearchColumnBooleanField[] isInactive;
   private SearchColumnStringField[] itemTypeNoHierarchy;
   private SearchColumnStringField[] liabilityAccount;
   private SearchColumnStringField[] name;
   private SearchColumnStringField[] vendor;
   private SearchColumnCustomFieldList customFieldList;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(PayrollItemSearchRowBasic.class, true);

   public PayrollItemSearchRowBasic() {
      super();
   }

   public PayrollItemSearchRowBasic(SearchColumnSelectField[] externalId, SearchColumnSelectField[] internalId, SearchColumnStringField[] expenseAccount, SearchColumnBooleanField[] isInactive, SearchColumnStringField[] itemTypeNoHierarchy, SearchColumnStringField[] liabilityAccount, SearchColumnStringField[] name, SearchColumnStringField[] vendor, SearchColumnCustomFieldList customFieldList) {
      super();
      this.externalId = externalId;
      this.internalId = internalId;
      this.expenseAccount = expenseAccount;
      this.isInactive = isInactive;
      this.itemTypeNoHierarchy = itemTypeNoHierarchy;
      this.liabilityAccount = liabilityAccount;
      this.name = name;
      this.vendor = vendor;
      this.customFieldList = customFieldList;
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

   public SearchColumnStringField[] getExpenseAccount() {
      return this.expenseAccount;
   }

   public void setExpenseAccount(SearchColumnStringField[] expenseAccount) {
      this.expenseAccount = expenseAccount;
   }

   public SearchColumnStringField getExpenseAccount(int i) {
      return this.expenseAccount[i];
   }

   public void setExpenseAccount(int i, SearchColumnStringField _value) {
      this.expenseAccount[i] = _value;
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

   public SearchColumnStringField[] getItemTypeNoHierarchy() {
      return this.itemTypeNoHierarchy;
   }

   public void setItemTypeNoHierarchy(SearchColumnStringField[] itemTypeNoHierarchy) {
      this.itemTypeNoHierarchy = itemTypeNoHierarchy;
   }

   public SearchColumnStringField getItemTypeNoHierarchy(int i) {
      return this.itemTypeNoHierarchy[i];
   }

   public void setItemTypeNoHierarchy(int i, SearchColumnStringField _value) {
      this.itemTypeNoHierarchy[i] = _value;
   }

   public SearchColumnStringField[] getLiabilityAccount() {
      return this.liabilityAccount;
   }

   public void setLiabilityAccount(SearchColumnStringField[] liabilityAccount) {
      this.liabilityAccount = liabilityAccount;
   }

   public SearchColumnStringField getLiabilityAccount(int i) {
      return this.liabilityAccount[i];
   }

   public void setLiabilityAccount(int i, SearchColumnStringField _value) {
      this.liabilityAccount[i] = _value;
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

   public SearchColumnStringField[] getVendor() {
      return this.vendor;
   }

   public void setVendor(SearchColumnStringField[] vendor) {
      this.vendor = vendor;
   }

   public SearchColumnStringField getVendor(int i) {
      return this.vendor[i];
   }

   public void setVendor(int i, SearchColumnStringField _value) {
      this.vendor[i] = _value;
   }

   public SearchColumnCustomFieldList getCustomFieldList() {
      return this.customFieldList;
   }

   public void setCustomFieldList(SearchColumnCustomFieldList customFieldList) {
      this.customFieldList = customFieldList;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof PayrollItemSearchRowBasic)) {
         return false;
      } else {
         PayrollItemSearchRowBasic other = (PayrollItemSearchRowBasic)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = super.equals(obj) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && Arrays.equals(this.externalId, other.getExternalId())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && Arrays.equals(this.internalId, other.getInternalId())) && (this.expenseAccount == null && other.getExpenseAccount() == null || this.expenseAccount != null && Arrays.equals(this.expenseAccount, other.getExpenseAccount())) && (this.isInactive == null && other.getIsInactive() == null || this.isInactive != null && Arrays.equals(this.isInactive, other.getIsInactive())) && (this.itemTypeNoHierarchy == null && other.getItemTypeNoHierarchy() == null || this.itemTypeNoHierarchy != null && Arrays.equals(this.itemTypeNoHierarchy, other.getItemTypeNoHierarchy())) && (this.liabilityAccount == null && other.getLiabilityAccount() == null || this.liabilityAccount != null && Arrays.equals(this.liabilityAccount, other.getLiabilityAccount())) && (this.name == null && other.getName() == null || this.name != null && Arrays.equals(this.name, other.getName())) && (this.vendor == null && other.getVendor() == null || this.vendor != null && Arrays.equals(this.vendor, other.getVendor())) && (this.customFieldList == null && other.getCustomFieldList() == null || this.customFieldList != null && this.customFieldList.equals(other.getCustomFieldList()));
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

         if (this.getExpenseAccount() != null) {
            for(i = 0; i < Array.getLength(this.getExpenseAccount()); ++i) {
               obj = Array.get(this.getExpenseAccount(), i);
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

         if (this.getItemTypeNoHierarchy() != null) {
            for(i = 0; i < Array.getLength(this.getItemTypeNoHierarchy()); ++i) {
               obj = Array.get(this.getItemTypeNoHierarchy(), i);
               if (obj != null && !obj.getClass().isArray()) {
                  _hashCode += obj.hashCode();
               }
            }
         }

         if (this.getLiabilityAccount() != null) {
            for(i = 0; i < Array.getLength(this.getLiabilityAccount()); ++i) {
               obj = Array.get(this.getLiabilityAccount(), i);
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

         if (this.getVendor() != null) {
            for(i = 0; i < Array.getLength(this.getVendor()); ++i) {
               obj = Array.get(this.getVendor(), i);
               if (obj != null && !obj.getClass().isArray()) {
                  _hashCode += obj.hashCode();
               }
            }
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
      typeDesc.setXmlType(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "PayrollItemSearchRowBasic"));
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
      elemField.setFieldName("expenseAccount");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "expenseAccount"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
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
      elemField.setFieldName("itemTypeNoHierarchy");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "itemTypeNoHierarchy"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      elemField.setMaxOccursUnbounded(true);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("liabilityAccount");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "liabilityAccount"));
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
      elemField.setFieldName("vendor");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "vendor"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      elemField.setMaxOccursUnbounded(true);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("customFieldList");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "customFieldList"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchColumnCustomFieldList"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
   }
}
