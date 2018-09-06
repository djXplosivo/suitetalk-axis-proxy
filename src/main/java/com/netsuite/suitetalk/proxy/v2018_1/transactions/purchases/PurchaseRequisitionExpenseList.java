package com.netsuite.suitetalk.proxy.v2018_1.transactions.purchases;

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

public class PurchaseRequisitionExpenseList implements Serializable {
   private PurchaseRequisitionExpense[] purchaseRequisitionExpense;
   private boolean replaceAll;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(PurchaseRequisitionExpenseList.class, true);

   public PurchaseRequisitionExpenseList() {
      super();
   }

   public PurchaseRequisitionExpenseList(PurchaseRequisitionExpense[] purchaseRequisitionExpense, boolean replaceAll) {
      super();
      this.purchaseRequisitionExpense = purchaseRequisitionExpense;
      this.replaceAll = replaceAll;
   }

   public PurchaseRequisitionExpense[] getPurchaseRequisitionExpense() {
      return this.purchaseRequisitionExpense;
   }

   public void setPurchaseRequisitionExpense(PurchaseRequisitionExpense[] purchaseRequisitionExpense) {
      this.purchaseRequisitionExpense = purchaseRequisitionExpense;
   }

   public PurchaseRequisitionExpense getPurchaseRequisitionExpense(int i) {
      return this.purchaseRequisitionExpense[i];
   }

   public void setPurchaseRequisitionExpense(int i, PurchaseRequisitionExpense _value) {
      this.purchaseRequisitionExpense[i] = _value;
   }

   public boolean isReplaceAll() {
      return this.replaceAll;
   }

   public void setReplaceAll(boolean replaceAll) {
      this.replaceAll = replaceAll;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof PurchaseRequisitionExpenseList)) {
         return false;
      } else {
         PurchaseRequisitionExpenseList other = (PurchaseRequisitionExpenseList)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = (this.purchaseRequisitionExpense == null && other.getPurchaseRequisitionExpense() == null || this.purchaseRequisitionExpense != null && Arrays.equals(this.purchaseRequisitionExpense, other.getPurchaseRequisitionExpense())) && this.replaceAll == other.isReplaceAll();
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
         if (this.getPurchaseRequisitionExpense() != null) {
            for(int i = 0; i < Array.getLength(this.getPurchaseRequisitionExpense()); ++i) {
               Object obj = Array.get(this.getPurchaseRequisitionExpense(), i);
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
      typeDesc.setXmlType(new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "PurchaseRequisitionExpenseList"));
      AttributeDesc attrField = new AttributeDesc();
      attrField.setFieldName("replaceAll");
      attrField.setXmlName(new QName("", "replaceAll"));
      attrField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
      typeDesc.addFieldDesc(attrField);
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("purchaseRequisitionExpense");
      elemField.setXmlName(new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "purchaseRequisitionExpense"));
      elemField.setXmlType(new QName("urn:purchases_2018_1.transactions.webservices.netsuite.com", "PurchaseRequisitionExpense"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      elemField.setMaxOccursUnbounded(true);
      typeDesc.addFieldDesc(elemField);
   }
}
