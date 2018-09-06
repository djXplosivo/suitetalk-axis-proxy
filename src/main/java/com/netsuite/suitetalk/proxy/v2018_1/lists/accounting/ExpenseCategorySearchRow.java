package com.netsuite.suitetalk.proxy.v2018_1.lists.accounting;

import com.netsuite.suitetalk.proxy.v2018_1.platform.common.CustomSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2018_1.platform.common.EmployeeSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2018_1.platform.common.ExpenseCategorySearchRowBasic;
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

public class ExpenseCategorySearchRow extends SearchRow implements Serializable {
   private ExpenseCategorySearchRowBasic basic;
   private EmployeeSearchRowBasic userJoin;
   private CustomSearchRowBasic[] customSearchJoin;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(ExpenseCategorySearchRow.class, true);

   public ExpenseCategorySearchRow() {
      super();
   }

   public ExpenseCategorySearchRow(ExpenseCategorySearchRowBasic basic, EmployeeSearchRowBasic userJoin, CustomSearchRowBasic[] customSearchJoin) {
      super();
      this.basic = basic;
      this.userJoin = userJoin;
      this.customSearchJoin = customSearchJoin;
   }

   public ExpenseCategorySearchRowBasic getBasic() {
      return this.basic;
   }

   public void setBasic(ExpenseCategorySearchRowBasic basic) {
      this.basic = basic;
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
      if (!(obj instanceof ExpenseCategorySearchRow)) {
         return false;
      } else {
         ExpenseCategorySearchRow other = (ExpenseCategorySearchRow)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = super.equals(obj) && (this.basic == null && other.getBasic() == null || this.basic != null && this.basic.equals(other.getBasic())) && (this.userJoin == null && other.getUserJoin() == null || this.userJoin != null && this.userJoin.equals(other.getUserJoin())) && (this.customSearchJoin == null && other.getCustomSearchJoin() == null || this.customSearchJoin != null && Arrays.equals(this.customSearchJoin, other.getCustomSearchJoin()));
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
      typeDesc.setXmlType(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "ExpenseCategorySearchRow"));
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("basic");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "basic"));
      elemField.setXmlType(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "ExpenseCategorySearchRowBasic"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("userJoin");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "userJoin"));
      elemField.setXmlType(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "EmployeeSearchRowBasic"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("customSearchJoin");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "customSearchJoin"));
      elemField.setXmlType(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "CustomSearchRowBasic"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      elemField.setMaxOccursUnbounded(true);
      typeDesc.addFieldDesc(elemField);
   }
}
