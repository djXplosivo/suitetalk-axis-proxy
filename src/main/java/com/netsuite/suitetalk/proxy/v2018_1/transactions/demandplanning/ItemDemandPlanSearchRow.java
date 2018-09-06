package com.netsuite.suitetalk.proxy.v2018_1.transactions.demandplanning;

import com.netsuite.suitetalk.proxy.v2018_1.platform.common.CustomSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2018_1.platform.common.EmployeeSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2018_1.platform.common.ItemDemandPlanSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2018_1.platform.common.ItemSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2018_1.platform.common.LocationSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2018_1.platform.core.SearchRow;
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

public class ItemDemandPlanSearchRow extends SearchRow implements Serializable {
   private ItemDemandPlanSearchRowBasic basic;
   private ItemSearchRowBasic itemJoin;
   private ItemSearchRowBasic lastAlternateSourceItemJoin;
   private LocationSearchRowBasic locationJoin;
   private EmployeeSearchRowBasic userJoin;
   private CustomSearchRowBasic[] customSearchJoin;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(ItemDemandPlanSearchRow.class, true);

   public ItemDemandPlanSearchRow() {
      super();
   }

   public ItemDemandPlanSearchRow(ItemDemandPlanSearchRowBasic basic, ItemSearchRowBasic itemJoin, ItemSearchRowBasic lastAlternateSourceItemJoin, LocationSearchRowBasic locationJoin, EmployeeSearchRowBasic userJoin, CustomSearchRowBasic[] customSearchJoin) {
      super();
      this.basic = basic;
      this.itemJoin = itemJoin;
      this.lastAlternateSourceItemJoin = lastAlternateSourceItemJoin;
      this.locationJoin = locationJoin;
      this.userJoin = userJoin;
      this.customSearchJoin = customSearchJoin;
   }

   public ItemDemandPlanSearchRowBasic getBasic() {
      return this.basic;
   }

   public void setBasic(ItemDemandPlanSearchRowBasic basic) {
      this.basic = basic;
   }

   public ItemSearchRowBasic getItemJoin() {
      return this.itemJoin;
   }

   public void setItemJoin(ItemSearchRowBasic itemJoin) {
      this.itemJoin = itemJoin;
   }

   public ItemSearchRowBasic getLastAlternateSourceItemJoin() {
      return this.lastAlternateSourceItemJoin;
   }

   public void setLastAlternateSourceItemJoin(ItemSearchRowBasic lastAlternateSourceItemJoin) {
      this.lastAlternateSourceItemJoin = lastAlternateSourceItemJoin;
   }

   public LocationSearchRowBasic getLocationJoin() {
      return this.locationJoin;
   }

   public void setLocationJoin(LocationSearchRowBasic locationJoin) {
      this.locationJoin = locationJoin;
   }

   public EmployeeSearchRowBasic getUserJoin() {
      return this.userJoin;
   }

   public void setUserJoin(EmployeeSearchRowBasic userJoin) {
      this.userJoin = userJoin;
   }

   public CustomSearchRowBasic[] getCustomSearchJoin() {
      return this.customSearchJoin;
   }

   public void setCustomSearchJoin(CustomSearchRowBasic[] customSearchJoin) {
      this.customSearchJoin = customSearchJoin;
   }

   public CustomSearchRowBasic getCustomSearchJoin(int i) {
      return this.customSearchJoin[i];
   }

   public void setCustomSearchJoin(int i, CustomSearchRowBasic _value) {
      this.customSearchJoin[i] = _value;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof ItemDemandPlanSearchRow)) {
         return false;
      } else {
         ItemDemandPlanSearchRow other = (ItemDemandPlanSearchRow)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = super.equals(obj) && (this.basic == null && other.getBasic() == null || this.basic != null && this.basic.equals(other.getBasic())) && (this.itemJoin == null && other.getItemJoin() == null || this.itemJoin != null && this.itemJoin.equals(other.getItemJoin())) && (this.lastAlternateSourceItemJoin == null && other.getLastAlternateSourceItemJoin() == null || this.lastAlternateSourceItemJoin != null && this.lastAlternateSourceItemJoin.equals(other.getLastAlternateSourceItemJoin())) && (this.locationJoin == null && other.getLocationJoin() == null || this.locationJoin != null && this.locationJoin.equals(other.getLocationJoin())) && (this.userJoin == null && other.getUserJoin() == null || this.userJoin != null && this.userJoin.equals(other.getUserJoin())) && (this.customSearchJoin == null && other.getCustomSearchJoin() == null || this.customSearchJoin != null && Arrays.equals(this.customSearchJoin, other.getCustomSearchJoin()));
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
         if (this.getBasic() != null) {
            _hashCode += this.getBasic().hashCode();
         }

         if (this.getItemJoin() != null) {
            _hashCode += this.getItemJoin().hashCode();
         }

         if (this.getLastAlternateSourceItemJoin() != null) {
            _hashCode += this.getLastAlternateSourceItemJoin().hashCode();
         }

         if (this.getLocationJoin() != null) {
            _hashCode += this.getLocationJoin().hashCode();
         }

         if (this.getUserJoin() != null) {
            _hashCode += this.getUserJoin().hashCode();
         }

         if (this.getCustomSearchJoin() != null) {
            for(int i = 0; i < Array.getLength(this.getCustomSearchJoin()); ++i) {
               Object obj = Array.get(this.getCustomSearchJoin(), i);
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
      typeDesc.setXmlType(new QName("urn:demandplanning_2018_1.transactions.webservices.netsuite.com", "ItemDemandPlanSearchRow"));
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("basic");
      elemField.setXmlName(new QName("urn:demandplanning_2018_1.transactions.webservices.netsuite.com", "basic"));
      elemField.setXmlType(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "ItemDemandPlanSearchRowBasic"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("itemJoin");
      elemField.setXmlName(new QName("urn:demandplanning_2018_1.transactions.webservices.netsuite.com", "itemJoin"));
      elemField.setXmlType(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "ItemSearchRowBasic"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("lastAlternateSourceItemJoin");
      elemField.setXmlName(new QName("urn:demandplanning_2018_1.transactions.webservices.netsuite.com", "lastAlternateSourceItemJoin"));
      elemField.setXmlType(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "ItemSearchRowBasic"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("locationJoin");
      elemField.setXmlName(new QName("urn:demandplanning_2018_1.transactions.webservices.netsuite.com", "locationJoin"));
      elemField.setXmlType(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "LocationSearchRowBasic"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("userJoin");
      elemField.setXmlName(new QName("urn:demandplanning_2018_1.transactions.webservices.netsuite.com", "userJoin"));
      elemField.setXmlType(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "EmployeeSearchRowBasic"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("customSearchJoin");
      elemField.setXmlName(new QName("urn:demandplanning_2018_1.transactions.webservices.netsuite.com", "customSearchJoin"));
      elemField.setXmlType(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "CustomSearchRowBasic"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      elemField.setMaxOccursUnbounded(true);
      typeDesc.addFieldDesc(elemField);
   }
}
