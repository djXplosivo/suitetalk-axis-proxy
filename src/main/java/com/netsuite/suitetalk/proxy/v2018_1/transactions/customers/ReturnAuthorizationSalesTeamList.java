package com.netsuite.suitetalk.proxy.v2018_1.transactions.customers;

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

public class ReturnAuthorizationSalesTeamList implements Serializable {
   private ReturnAuthorizationSalesTeam[] salesTeam;
   private boolean replaceAll;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(ReturnAuthorizationSalesTeamList.class, true);

   public ReturnAuthorizationSalesTeamList() {
      super();
   }

   public ReturnAuthorizationSalesTeamList(ReturnAuthorizationSalesTeam[] salesTeam, boolean replaceAll) {
      super();
      this.salesTeam = salesTeam;
      this.replaceAll = replaceAll;
   }

   public ReturnAuthorizationSalesTeam[] getSalesTeam() {
      return this.salesTeam;
   }

   public void setSalesTeam(ReturnAuthorizationSalesTeam[] salesTeam) {
      this.salesTeam = salesTeam;
   }

   public ReturnAuthorizationSalesTeam getSalesTeam(int i) {
      return this.salesTeam[i];
   }

   public void setSalesTeam(int i, ReturnAuthorizationSalesTeam _value) {
      this.salesTeam[i] = _value;
   }

   public boolean isReplaceAll() {
      return this.replaceAll;
   }

   public void setReplaceAll(boolean replaceAll) {
      this.replaceAll = replaceAll;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof ReturnAuthorizationSalesTeamList)) {
         return false;
      } else {
         ReturnAuthorizationSalesTeamList other = (ReturnAuthorizationSalesTeamList)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = (this.salesTeam == null && other.getSalesTeam() == null || this.salesTeam != null && Arrays.equals(this.salesTeam, other.getSalesTeam())) && this.replaceAll == other.isReplaceAll();
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
         if (this.getSalesTeam() != null) {
            for(int i = 0; i < Array.getLength(this.getSalesTeam()); ++i) {
               Object obj = Array.get(this.getSalesTeam(), i);
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
      typeDesc.setXmlType(new QName("urn:customers_2018_1.transactions.webservices.netsuite.com", "ReturnAuthorizationSalesTeamList"));
      AttributeDesc attrField = new AttributeDesc();
      attrField.setFieldName("replaceAll");
      attrField.setXmlName(new QName("", "replaceAll"));
      attrField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
      typeDesc.addFieldDesc(attrField);
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("salesTeam");
      elemField.setXmlName(new QName("urn:customers_2018_1.transactions.webservices.netsuite.com", "salesTeam"));
      elemField.setXmlType(new QName("urn:customers_2018_1.transactions.webservices.netsuite.com", "ReturnAuthorizationSalesTeam"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      elemField.setMaxOccursUnbounded(true);
      typeDesc.addFieldDesc(elemField);
   }
}
