package com.netsuite.suitetalk.proxy.v2018_1.platform.common;

import com.netsuite.suitetalk.proxy.v2018_1.platform.core.SearchColumnBooleanField;
import com.netsuite.suitetalk.proxy.v2018_1.platform.core.SearchColumnDoubleField;
import com.netsuite.suitetalk.proxy.v2018_1.platform.core.SearchColumnLongField;
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

public class TermSearchRowBasic extends SearchRowBasic implements Serializable {
   private SearchColumnBooleanField[] dateDriven;
   private SearchColumnLongField[] dayDiscountExpires;
   private SearchColumnLongField[] dayOfMonthNetDue;
   private SearchColumnLongField[] daysUntilExpiry;
   private SearchColumnLongField[] daysUntilNetDue;
   private SearchColumnDoubleField[] discountPercent;
   private SearchColumnDoubleField[] discountPercentDateDriven;
   private SearchColumnLongField[] dueNextMonthIfWithinDays;
   private SearchColumnSelectField[] externalId;
   private SearchColumnSelectField[] internalId;
   private SearchColumnBooleanField[] isInactive;
   private SearchColumnStringField[] name;
   private SearchColumnBooleanField[] preferred;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(TermSearchRowBasic.class, true);

   public TermSearchRowBasic() {
      super();
   }

   public TermSearchRowBasic(SearchColumnBooleanField[] dateDriven, SearchColumnLongField[] dayDiscountExpires, SearchColumnLongField[] dayOfMonthNetDue, SearchColumnLongField[] daysUntilExpiry, SearchColumnLongField[] daysUntilNetDue, SearchColumnDoubleField[] discountPercent, SearchColumnDoubleField[] discountPercentDateDriven, SearchColumnLongField[] dueNextMonthIfWithinDays, SearchColumnSelectField[] externalId, SearchColumnSelectField[] internalId, SearchColumnBooleanField[] isInactive, SearchColumnStringField[] name, SearchColumnBooleanField[] preferred) {
      super();
      this.dateDriven = dateDriven;
      this.dayDiscountExpires = dayDiscountExpires;
      this.dayOfMonthNetDue = dayOfMonthNetDue;
      this.daysUntilExpiry = daysUntilExpiry;
      this.daysUntilNetDue = daysUntilNetDue;
      this.discountPercent = discountPercent;
      this.discountPercentDateDriven = discountPercentDateDriven;
      this.dueNextMonthIfWithinDays = dueNextMonthIfWithinDays;
      this.externalId = externalId;
      this.internalId = internalId;
      this.isInactive = isInactive;
      this.name = name;
      this.preferred = preferred;
   }

   public SearchColumnBooleanField[] getDateDriven() {
      return this.dateDriven;
   }

   public void setDateDriven(SearchColumnBooleanField[] dateDriven) {
      this.dateDriven = dateDriven;
   }

   public SearchColumnBooleanField getDateDriven(int i) {
      return this.dateDriven[i];
   }

   public void setDateDriven(int i, SearchColumnBooleanField _value) {
      this.dateDriven[i] = _value;
   }

   public SearchColumnLongField[] getDayDiscountExpires() {
      return this.dayDiscountExpires;
   }

   public void setDayDiscountExpires(SearchColumnLongField[] dayDiscountExpires) {
      this.dayDiscountExpires = dayDiscountExpires;
   }

   public SearchColumnLongField getDayDiscountExpires(int i) {
      return this.dayDiscountExpires[i];
   }

   public void setDayDiscountExpires(int i, SearchColumnLongField _value) {
      this.dayDiscountExpires[i] = _value;
   }

   public SearchColumnLongField[] getDayOfMonthNetDue() {
      return this.dayOfMonthNetDue;
   }

   public void setDayOfMonthNetDue(SearchColumnLongField[] dayOfMonthNetDue) {
      this.dayOfMonthNetDue = dayOfMonthNetDue;
   }

   public SearchColumnLongField getDayOfMonthNetDue(int i) {
      return this.dayOfMonthNetDue[i];
   }

   public void setDayOfMonthNetDue(int i, SearchColumnLongField _value) {
      this.dayOfMonthNetDue[i] = _value;
   }

   public SearchColumnLongField[] getDaysUntilExpiry() {
      return this.daysUntilExpiry;
   }

   public void setDaysUntilExpiry(SearchColumnLongField[] daysUntilExpiry) {
      this.daysUntilExpiry = daysUntilExpiry;
   }

   public SearchColumnLongField getDaysUntilExpiry(int i) {
      return this.daysUntilExpiry[i];
   }

   public void setDaysUntilExpiry(int i, SearchColumnLongField _value) {
      this.daysUntilExpiry[i] = _value;
   }

   public SearchColumnLongField[] getDaysUntilNetDue() {
      return this.daysUntilNetDue;
   }

   public void setDaysUntilNetDue(SearchColumnLongField[] daysUntilNetDue) {
      this.daysUntilNetDue = daysUntilNetDue;
   }

   public SearchColumnLongField getDaysUntilNetDue(int i) {
      return this.daysUntilNetDue[i];
   }

   public void setDaysUntilNetDue(int i, SearchColumnLongField _value) {
      this.daysUntilNetDue[i] = _value;
   }

   public SearchColumnDoubleField[] getDiscountPercent() {
      return this.discountPercent;
   }

   public void setDiscountPercent(SearchColumnDoubleField[] discountPercent) {
      this.discountPercent = discountPercent;
   }

   public SearchColumnDoubleField getDiscountPercent(int i) {
      return this.discountPercent[i];
   }

   public void setDiscountPercent(int i, SearchColumnDoubleField _value) {
      this.discountPercent[i] = _value;
   }

   public SearchColumnDoubleField[] getDiscountPercentDateDriven() {
      return this.discountPercentDateDriven;
   }

   public void setDiscountPercentDateDriven(SearchColumnDoubleField[] discountPercentDateDriven) {
      this.discountPercentDateDriven = discountPercentDateDriven;
   }

   public SearchColumnDoubleField getDiscountPercentDateDriven(int i) {
      return this.discountPercentDateDriven[i];
   }

   public void setDiscountPercentDateDriven(int i, SearchColumnDoubleField _value) {
      this.discountPercentDateDriven[i] = _value;
   }

   public SearchColumnLongField[] getDueNextMonthIfWithinDays() {
      return this.dueNextMonthIfWithinDays;
   }

   public void setDueNextMonthIfWithinDays(SearchColumnLongField[] dueNextMonthIfWithinDays) {
      this.dueNextMonthIfWithinDays = dueNextMonthIfWithinDays;
   }

   public SearchColumnLongField getDueNextMonthIfWithinDays(int i) {
      return this.dueNextMonthIfWithinDays[i];
   }

   public void setDueNextMonthIfWithinDays(int i, SearchColumnLongField _value) {
      this.dueNextMonthIfWithinDays[i] = _value;
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

   public SearchColumnBooleanField[] getPreferred() {
      return this.preferred;
   }

   public void setPreferred(SearchColumnBooleanField[] preferred) {
      this.preferred = preferred;
   }

   public SearchColumnBooleanField getPreferred(int i) {
      return this.preferred[i];
   }

   public void setPreferred(int i, SearchColumnBooleanField _value) {
      this.preferred[i] = _value;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof TermSearchRowBasic)) {
         return false;
      } else {
         TermSearchRowBasic other = (TermSearchRowBasic)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = super.equals(obj) && (this.dateDriven == null && other.getDateDriven() == null || this.dateDriven != null && Arrays.equals(this.dateDriven, other.getDateDriven())) && (this.dayDiscountExpires == null && other.getDayDiscountExpires() == null || this.dayDiscountExpires != null && Arrays.equals(this.dayDiscountExpires, other.getDayDiscountExpires())) && (this.dayOfMonthNetDue == null && other.getDayOfMonthNetDue() == null || this.dayOfMonthNetDue != null && Arrays.equals(this.dayOfMonthNetDue, other.getDayOfMonthNetDue())) && (this.daysUntilExpiry == null && other.getDaysUntilExpiry() == null || this.daysUntilExpiry != null && Arrays.equals(this.daysUntilExpiry, other.getDaysUntilExpiry())) && (this.daysUntilNetDue == null && other.getDaysUntilNetDue() == null || this.daysUntilNetDue != null && Arrays.equals(this.daysUntilNetDue, other.getDaysUntilNetDue())) && (this.discountPercent == null && other.getDiscountPercent() == null || this.discountPercent != null && Arrays.equals(this.discountPercent, other.getDiscountPercent())) && (this.discountPercentDateDriven == null && other.getDiscountPercentDateDriven() == null || this.discountPercentDateDriven != null && Arrays.equals(this.discountPercentDateDriven, other.getDiscountPercentDateDriven())) && (this.dueNextMonthIfWithinDays == null && other.getDueNextMonthIfWithinDays() == null || this.dueNextMonthIfWithinDays != null && Arrays.equals(this.dueNextMonthIfWithinDays, other.getDueNextMonthIfWithinDays())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && Arrays.equals(this.externalId, other.getExternalId())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && Arrays.equals(this.internalId, other.getInternalId())) && (this.isInactive == null && other.getIsInactive() == null || this.isInactive != null && Arrays.equals(this.isInactive, other.getIsInactive())) && (this.name == null && other.getName() == null || this.name != null && Arrays.equals(this.name, other.getName())) && (this.preferred == null && other.getPreferred() == null || this.preferred != null && Arrays.equals(this.preferred, other.getPreferred()));
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
         if (this.getDateDriven() != null) {
            for(i = 0; i < Array.getLength(this.getDateDriven()); ++i) {
               obj = Array.get(this.getDateDriven(), i);
               if (obj != null && !obj.getClass().isArray()) {
                  _hashCode += obj.hashCode();
               }
            }
         }

         if (this.getDayDiscountExpires() != null) {
            for(i = 0; i < Array.getLength(this.getDayDiscountExpires()); ++i) {
               obj = Array.get(this.getDayDiscountExpires(), i);
               if (obj != null && !obj.getClass().isArray()) {
                  _hashCode += obj.hashCode();
               }
            }
         }

         if (this.getDayOfMonthNetDue() != null) {
            for(i = 0; i < Array.getLength(this.getDayOfMonthNetDue()); ++i) {
               obj = Array.get(this.getDayOfMonthNetDue(), i);
               if (obj != null && !obj.getClass().isArray()) {
                  _hashCode += obj.hashCode();
               }
            }
         }

         if (this.getDaysUntilExpiry() != null) {
            for(i = 0; i < Array.getLength(this.getDaysUntilExpiry()); ++i) {
               obj = Array.get(this.getDaysUntilExpiry(), i);
               if (obj != null && !obj.getClass().isArray()) {
                  _hashCode += obj.hashCode();
               }
            }
         }

         if (this.getDaysUntilNetDue() != null) {
            for(i = 0; i < Array.getLength(this.getDaysUntilNetDue()); ++i) {
               obj = Array.get(this.getDaysUntilNetDue(), i);
               if (obj != null && !obj.getClass().isArray()) {
                  _hashCode += obj.hashCode();
               }
            }
         }

         if (this.getDiscountPercent() != null) {
            for(i = 0; i < Array.getLength(this.getDiscountPercent()); ++i) {
               obj = Array.get(this.getDiscountPercent(), i);
               if (obj != null && !obj.getClass().isArray()) {
                  _hashCode += obj.hashCode();
               }
            }
         }

         if (this.getDiscountPercentDateDriven() != null) {
            for(i = 0; i < Array.getLength(this.getDiscountPercentDateDriven()); ++i) {
               obj = Array.get(this.getDiscountPercentDateDriven(), i);
               if (obj != null && !obj.getClass().isArray()) {
                  _hashCode += obj.hashCode();
               }
            }
         }

         if (this.getDueNextMonthIfWithinDays() != null) {
            for(i = 0; i < Array.getLength(this.getDueNextMonthIfWithinDays()); ++i) {
               obj = Array.get(this.getDueNextMonthIfWithinDays(), i);
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

         if (this.getName() != null) {
            for(i = 0; i < Array.getLength(this.getName()); ++i) {
               obj = Array.get(this.getName(), i);
               if (obj != null && !obj.getClass().isArray()) {
                  _hashCode += obj.hashCode();
               }
            }
         }

         if (this.getPreferred() != null) {
            for(i = 0; i < Array.getLength(this.getPreferred()); ++i) {
               obj = Array.get(this.getPreferred(), i);
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
      typeDesc.setXmlType(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "TermSearchRowBasic"));
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("dateDriven");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "dateDriven"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      elemField.setMaxOccursUnbounded(true);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("dayDiscountExpires");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "dayDiscountExpires"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      elemField.setMaxOccursUnbounded(true);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("dayOfMonthNetDue");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "dayOfMonthNetDue"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      elemField.setMaxOccursUnbounded(true);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("daysUntilExpiry");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "daysUntilExpiry"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      elemField.setMaxOccursUnbounded(true);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("daysUntilNetDue");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "daysUntilNetDue"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      elemField.setMaxOccursUnbounded(true);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("discountPercent");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "discountPercent"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      elemField.setMaxOccursUnbounded(true);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("discountPercentDateDriven");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "discountPercentDateDriven"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      elemField.setMaxOccursUnbounded(true);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("dueNextMonthIfWithinDays");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "dueNextMonthIfWithinDays"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
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
      elemField.setFieldName("name");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "name"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      elemField.setMaxOccursUnbounded(true);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("preferred");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "preferred"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      elemField.setMaxOccursUnbounded(true);
      typeDesc.addFieldDesc(elemField);
   }
}
