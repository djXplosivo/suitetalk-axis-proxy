package com.netsuite.suitetalk.proxy.v2018_1.lists.website;

import com.netsuite.suitetalk.proxy.v2018_1.platform.common.CustomerSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2018_1.platform.common.EmployeeSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2018_1.platform.common.SiteCategorySearchRowBasic;
import com.netsuite.suitetalk.proxy.v2018_1.platform.core.SearchRow;
import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class SiteCategorySearchRow extends SearchRow implements Serializable {
   private SiteCategorySearchRowBasic basic;
   private CustomerSearchRowBasic shopperJoin;
   private EmployeeSearchRowBasic userJoin;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(SiteCategorySearchRow.class, true);

   public SiteCategorySearchRow() {
      super();
   }

   public SiteCategorySearchRow(SiteCategorySearchRowBasic basic, CustomerSearchRowBasic shopperJoin, EmployeeSearchRowBasic userJoin) {
      super();
      this.basic = basic;
      this.shopperJoin = shopperJoin;
      this.userJoin = userJoin;
   }

   public SiteCategorySearchRowBasic getBasic() {
      return this.basic;
   }

   public void setBasic(SiteCategorySearchRowBasic basic) {
      this.basic = basic;
   }

   public CustomerSearchRowBasic getShopperJoin() {
      return this.shopperJoin;
   }

   public void setShopperJoin(CustomerSearchRowBasic shopperJoin) {
      this.shopperJoin = shopperJoin;
   }

   public EmployeeSearchRowBasic getUserJoin() {
      return this.userJoin;
   }

   public void setUserJoin(EmployeeSearchRowBasic userJoin) {
      this.userJoin = userJoin;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof SiteCategorySearchRow)) {
         return false;
      } else {
         SiteCategorySearchRow other = (SiteCategorySearchRow)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = super.equals(obj) && (this.basic == null && other.getBasic() == null || this.basic != null && this.basic.equals(other.getBasic())) && (this.shopperJoin == null && other.getShopperJoin() == null || this.shopperJoin != null && this.shopperJoin.equals(other.getShopperJoin())) && (this.userJoin == null && other.getUserJoin() == null || this.userJoin != null && this.userJoin.equals(other.getUserJoin()));
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

         if (this.getShopperJoin() != null) {
            _hashCode += this.getShopperJoin().hashCode();
         }

         if (this.getUserJoin() != null) {
            _hashCode += this.getUserJoin().hashCode();
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
      typeDesc.setXmlType(new QName("urn:website_2018_1.lists.webservices.netsuite.com", "SiteCategorySearchRow"));
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("basic");
      elemField.setXmlName(new QName("urn:website_2018_1.lists.webservices.netsuite.com", "basic"));
      elemField.setXmlType(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "SiteCategorySearchRowBasic"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("shopperJoin");
      elemField.setXmlName(new QName("urn:website_2018_1.lists.webservices.netsuite.com", "shopperJoin"));
      elemField.setXmlType(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "CustomerSearchRowBasic"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("userJoin");
      elemField.setXmlName(new QName("urn:website_2018_1.lists.webservices.netsuite.com", "userJoin"));
      elemField.setXmlType(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "EmployeeSearchRowBasic"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
   }
}
