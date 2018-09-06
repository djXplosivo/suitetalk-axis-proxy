package com.netsuite.suitetalk.proxy.v2018_1.transactions.bank;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Arrays;
import javax.xml.namespace.QName;
import org.apache.axis.description.AttributeDesc;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class DepositOtherList implements Serializable {
   private DepositOther[] depositOther;
   private boolean replaceAll;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(DepositOtherList.class, true);

   public DepositOtherList() {
      super();
   }

   public DepositOtherList(DepositOther[] depositOther, boolean replaceAll) {
      super();
      this.depositOther = depositOther;
      this.replaceAll = replaceAll;
   }

   public DepositOther[] getDepositOther() {
      return this.depositOther;
   }

   public void setDepositOther(DepositOther[] depositOther) {
      this.depositOther = depositOther;
   }

   public DepositOther getDepositOther(int i) {
      return this.depositOther[i];
   }

   public void setDepositOther(int i, DepositOther _value) {
      this.depositOther[i] = _value;
   }

   public boolean isReplaceAll() {
      return this.replaceAll;
   }

   public void setReplaceAll(boolean replaceAll) {
      this.replaceAll = replaceAll;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof DepositOtherList)) {
         return false;
      } else {
         DepositOtherList other = (DepositOtherList)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = (this.depositOther == null && other.getDepositOther() == null || this.depositOther != null && Arrays.equals(this.depositOther, other.getDepositOther())) && this.replaceAll == other.isReplaceAll();
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
         int _hashCode = 1;
         if (this.getDepositOther() != null) {
            for(int i = 0; i < Array.getLength(this.getDepositOther()); ++i) {
               Object obj = Array.get(this.getDepositOther(), i);
               if (obj != null && !obj.getClass().isArray()) {
                  _hashCode += obj.hashCode();
               }
            }
         }

         _hashCode += (this.isReplaceAll() ? Boolean.TRUE : Boolean.FALSE).hashCode();
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
      typeDesc.setXmlType(new QName("urn:bank_2018_1.transactions.webservices.netsuite.com", "DepositOtherList"));
      AttributeDesc attrField = new AttributeDesc();
      attrField.setFieldName("replaceAll");
      attrField.setXmlName(new QName("", "replaceAll"));
      attrField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
      typeDesc.addFieldDesc(attrField);
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("depositOther");
      elemField.setXmlName(new QName("urn:bank_2018_1.transactions.webservices.netsuite.com", "depositOther"));
      elemField.setXmlType(new QName("urn:bank_2018_1.transactions.webservices.netsuite.com", "DepositOther"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      elemField.setMaxOccursUnbounded(true);
      typeDesc.addFieldDesc(elemField);
   }
}
