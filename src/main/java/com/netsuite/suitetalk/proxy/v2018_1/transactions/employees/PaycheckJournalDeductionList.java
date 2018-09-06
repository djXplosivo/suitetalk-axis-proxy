package com.netsuite.suitetalk.proxy.v2018_1.transactions.employees;

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

public class PaycheckJournalDeductionList implements Serializable {
   private PaycheckJournalDeduction[] paycheckJournalDeduction;
   private boolean replaceAll;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(PaycheckJournalDeductionList.class, true);

   public PaycheckJournalDeductionList() {
      super();
   }

   public PaycheckJournalDeductionList(PaycheckJournalDeduction[] paycheckJournalDeduction, boolean replaceAll) {
      super();
      this.paycheckJournalDeduction = paycheckJournalDeduction;
      this.replaceAll = replaceAll;
   }

   public PaycheckJournalDeduction[] getPaycheckJournalDeduction() {
      return this.paycheckJournalDeduction;
   }

   public void setPaycheckJournalDeduction(PaycheckJournalDeduction[] paycheckJournalDeduction) {
      this.paycheckJournalDeduction = paycheckJournalDeduction;
   }

   public PaycheckJournalDeduction getPaycheckJournalDeduction(int i) {
      return this.paycheckJournalDeduction[i];
   }

   public void setPaycheckJournalDeduction(int i, PaycheckJournalDeduction _value) {
      this.paycheckJournalDeduction[i] = _value;
   }

   public boolean isReplaceAll() {
      return this.replaceAll;
   }

   public void setReplaceAll(boolean replaceAll) {
      this.replaceAll = replaceAll;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof PaycheckJournalDeductionList)) {
         return false;
      } else {
         PaycheckJournalDeductionList other = (PaycheckJournalDeductionList)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = (this.paycheckJournalDeduction == null && other.getPaycheckJournalDeduction() == null || this.paycheckJournalDeduction != null && Arrays.equals(this.paycheckJournalDeduction, other.getPaycheckJournalDeduction())) && this.replaceAll == other.isReplaceAll();
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
         if (this.getPaycheckJournalDeduction() != null) {
            for(int i = 0; i < Array.getLength(this.getPaycheckJournalDeduction()); ++i) {
               Object obj = Array.get(this.getPaycheckJournalDeduction(), i);
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
      typeDesc.setXmlType(new QName("urn:employees_2018_1.transactions.webservices.netsuite.com", "PaycheckJournalDeductionList"));
      AttributeDesc attrField = new AttributeDesc();
      attrField.setFieldName("replaceAll");
      attrField.setXmlName(new QName("", "replaceAll"));
      attrField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
      typeDesc.addFieldDesc(attrField);
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("paycheckJournalDeduction");
      elemField.setXmlName(new QName("urn:employees_2018_1.transactions.webservices.netsuite.com", "paycheckJournalDeduction"));
      elemField.setXmlType(new QName("urn:employees_2018_1.transactions.webservices.netsuite.com", "PaycheckJournalDeduction"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      elemField.setMaxOccursUnbounded(true);
      typeDesc.addFieldDesc(elemField);
   }
}
