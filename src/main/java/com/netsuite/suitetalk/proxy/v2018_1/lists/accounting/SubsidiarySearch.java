package com.netsuite.suitetalk.proxy.v2018_1.lists.accounting;

import com.netsuite.suitetalk.proxy.v2018_1.platform.common.AccountSearchBasic;
import com.netsuite.suitetalk.proxy.v2018_1.platform.common.AddressSearchBasic;
import com.netsuite.suitetalk.proxy.v2018_1.platform.common.CustomSearchJoin;
import com.netsuite.suitetalk.proxy.v2018_1.platform.common.EmployeeSearchBasic;
import com.netsuite.suitetalk.proxy.v2018_1.platform.common.SubsidiarySearchBasic;
import com.netsuite.suitetalk.proxy.v2018_1.platform.core.SearchRecord;
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

public class SubsidiarySearch extends SearchRecord implements Serializable {
   private SubsidiarySearchBasic basic;
   private AddressSearchBasic addressJoin;
   private AccountSearchBasic defaultAdvanceToApplyAccountJoin;
   private AddressSearchBasic returnAddressJoin;
   private AddressSearchBasic shippingAddressJoin;
   private EmployeeSearchBasic userJoin;
   private CustomSearchJoin[] customSearchJoin;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(SubsidiarySearch.class, true);

   public SubsidiarySearch() {
      super();
   }

   public SubsidiarySearch(SubsidiarySearchBasic basic, AddressSearchBasic addressJoin, AccountSearchBasic defaultAdvanceToApplyAccountJoin, AddressSearchBasic returnAddressJoin, AddressSearchBasic shippingAddressJoin, EmployeeSearchBasic userJoin, CustomSearchJoin[] customSearchJoin) {
      super();
      this.basic = basic;
      this.addressJoin = addressJoin;
      this.defaultAdvanceToApplyAccountJoin = defaultAdvanceToApplyAccountJoin;
      this.returnAddressJoin = returnAddressJoin;
      this.shippingAddressJoin = shippingAddressJoin;
      this.userJoin = userJoin;
      this.customSearchJoin = customSearchJoin;
   }

   public SubsidiarySearchBasic getBasic() {
      return this.basic;
   }

   public void setBasic(SubsidiarySearchBasic basic) {
      this.basic = basic;
   }

   public AddressSearchBasic getAddressJoin() {
      return this.addressJoin;
   }

   public void setAddressJoin(AddressSearchBasic addressJoin) {
      this.addressJoin = addressJoin;
   }

   public AccountSearchBasic getDefaultAdvanceToApplyAccountJoin() {
      return this.defaultAdvanceToApplyAccountJoin;
   }

   public void setDefaultAdvanceToApplyAccountJoin(AccountSearchBasic defaultAdvanceToApplyAccountJoin) {
      this.defaultAdvanceToApplyAccountJoin = defaultAdvanceToApplyAccountJoin;
   }

   public AddressSearchBasic getReturnAddressJoin() {
      return this.returnAddressJoin;
   }

   public void setReturnAddressJoin(AddressSearchBasic returnAddressJoin) {
      this.returnAddressJoin = returnAddressJoin;
   }

   public AddressSearchBasic getShippingAddressJoin() {
      return this.shippingAddressJoin;
   }

   public void setShippingAddressJoin(AddressSearchBasic shippingAddressJoin) {
      this.shippingAddressJoin = shippingAddressJoin;
   }

   public EmployeeSearchBasic getUserJoin() {
      return this.userJoin;
   }

   public void setUserJoin(EmployeeSearchBasic userJoin) {
      this.userJoin = userJoin;
   }

   public CustomSearchJoin[] getCustomSearchJoin() {
      return this.customSearchJoin;
   }

   public void setCustomSearchJoin(CustomSearchJoin[] customSearchJoin) {
      this.customSearchJoin = customSearchJoin;
   }

   public CustomSearchJoin getCustomSearchJoin(int i) {
      return this.customSearchJoin[i];
   }

   public void setCustomSearchJoin(int i, CustomSearchJoin _value) {
      this.customSearchJoin[i] = _value;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof SubsidiarySearch)) {
         return false;
      } else {
         SubsidiarySearch other = (SubsidiarySearch)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = super.equals(obj) && (this.basic == null && other.getBasic() == null || this.basic != null && this.basic.equals(other.getBasic())) && (this.addressJoin == null && other.getAddressJoin() == null || this.addressJoin != null && this.addressJoin.equals(other.getAddressJoin())) && (this.defaultAdvanceToApplyAccountJoin == null && other.getDefaultAdvanceToApplyAccountJoin() == null || this.defaultAdvanceToApplyAccountJoin != null && this.defaultAdvanceToApplyAccountJoin.equals(other.getDefaultAdvanceToApplyAccountJoin())) && (this.returnAddressJoin == null && other.getReturnAddressJoin() == null || this.returnAddressJoin != null && this.returnAddressJoin.equals(other.getReturnAddressJoin())) && (this.shippingAddressJoin == null && other.getShippingAddressJoin() == null || this.shippingAddressJoin != null && this.shippingAddressJoin.equals(other.getShippingAddressJoin())) && (this.userJoin == null && other.getUserJoin() == null || this.userJoin != null && this.userJoin.equals(other.getUserJoin())) && (this.customSearchJoin == null && other.getCustomSearchJoin() == null || this.customSearchJoin != null && Arrays.equals(this.customSearchJoin, other.getCustomSearchJoin()));
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

         if (this.getAddressJoin() != null) {
            _hashCode += this.getAddressJoin().hashCode();
         }

         if (this.getDefaultAdvanceToApplyAccountJoin() != null) {
            _hashCode += this.getDefaultAdvanceToApplyAccountJoin().hashCode();
         }

         if (this.getReturnAddressJoin() != null) {
            _hashCode += this.getReturnAddressJoin().hashCode();
         }

         if (this.getShippingAddressJoin() != null) {
            _hashCode += this.getShippingAddressJoin().hashCode();
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
      typeDesc.setXmlType(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "SubsidiarySearch"));
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("basic");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "basic"));
      elemField.setXmlType(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "SubsidiarySearchBasic"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("addressJoin");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "addressJoin"));
      elemField.setXmlType(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "AddressSearchBasic"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("defaultAdvanceToApplyAccountJoin");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "defaultAdvanceToApplyAccountJoin"));
      elemField.setXmlType(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "AccountSearchBasic"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("returnAddressJoin");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "returnAddressJoin"));
      elemField.setXmlType(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "AddressSearchBasic"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("shippingAddressJoin");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "shippingAddressJoin"));
      elemField.setXmlType(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "AddressSearchBasic"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("userJoin");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "userJoin"));
      elemField.setXmlType(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "EmployeeSearchBasic"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("customSearchJoin");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "customSearchJoin"));
      elemField.setXmlType(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "CustomSearchJoin"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      elemField.setMaxOccursUnbounded(true);
      typeDesc.addFieldDesc(elemField);
   }
}
