package com.netsuite.suitetalk.proxy.v2018_1.transactions.sales;

import com.netsuite.suitetalk.proxy.v2018_1.platform.common.CustomerSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2018_1.platform.common.ItemSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2018_1.platform.common.UsageSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2018_1.platform.core.SearchRow;
import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class UsageSearchRow extends SearchRow implements Serializable {
   private UsageSearchRowBasic basic;
   private CustomerSearchRowBasic customerJoin;
   private ItemSearchRowBasic itemJoin;
   private ItemSearchRowBasic subscriptionPlanJoin;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(UsageSearchRow.class, true);

   public UsageSearchRow() {
      super();
   }

   public UsageSearchRow(UsageSearchRowBasic basic, CustomerSearchRowBasic customerJoin, ItemSearchRowBasic itemJoin, ItemSearchRowBasic subscriptionPlanJoin) {
      super();
      this.basic = basic;
      this.customerJoin = customerJoin;
      this.itemJoin = itemJoin;
      this.subscriptionPlanJoin = subscriptionPlanJoin;
   }

   public UsageSearchRowBasic getBasic() {
      return this.basic;
   }

   public void setBasic(UsageSearchRowBasic basic) {
      this.basic = basic;
   }

   public CustomerSearchRowBasic getCustomerJoin() {
      return this.customerJoin;
   }

   public void setCustomerJoin(CustomerSearchRowBasic customerJoin) {
      this.customerJoin = customerJoin;
   }

   public ItemSearchRowBasic getItemJoin() {
      return this.itemJoin;
   }

   public void setItemJoin(ItemSearchRowBasic itemJoin) {
      this.itemJoin = itemJoin;
   }

   public ItemSearchRowBasic getSubscriptionPlanJoin() {
      return this.subscriptionPlanJoin;
   }

   public void setSubscriptionPlanJoin(ItemSearchRowBasic subscriptionPlanJoin) {
      this.subscriptionPlanJoin = subscriptionPlanJoin;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof UsageSearchRow)) {
         return false;
      } else {
         UsageSearchRow other = (UsageSearchRow)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = super.equals(obj) && (this.basic == null && other.getBasic() == null || this.basic != null && this.basic.equals(other.getBasic())) && (this.customerJoin == null && other.getCustomerJoin() == null || this.customerJoin != null && this.customerJoin.equals(other.getCustomerJoin())) && (this.itemJoin == null && other.getItemJoin() == null || this.itemJoin != null && this.itemJoin.equals(other.getItemJoin())) && (this.subscriptionPlanJoin == null && other.getSubscriptionPlanJoin() == null || this.subscriptionPlanJoin != null && this.subscriptionPlanJoin.equals(other.getSubscriptionPlanJoin()));
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

         if (this.getCustomerJoin() != null) {
            _hashCode += this.getCustomerJoin().hashCode();
         }

         if (this.getItemJoin() != null) {
            _hashCode += this.getItemJoin().hashCode();
         }

         if (this.getSubscriptionPlanJoin() != null) {
            _hashCode += this.getSubscriptionPlanJoin().hashCode();
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
      typeDesc.setXmlType(new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "UsageSearchRow"));
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("basic");
      elemField.setXmlName(new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "basic"));
      elemField.setXmlType(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "UsageSearchRowBasic"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("customerJoin");
      elemField.setXmlName(new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "customerJoin"));
      elemField.setXmlType(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "CustomerSearchRowBasic"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("itemJoin");
      elemField.setXmlName(new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "itemJoin"));
      elemField.setXmlType(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "ItemSearchRowBasic"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("subscriptionPlanJoin");
      elemField.setXmlName(new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "subscriptionPlanJoin"));
      elemField.setXmlType(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "ItemSearchRowBasic"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
   }
}
