package com.netsuite.suitetalk.proxy.v2018_1.transactions.demandplanning;

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

public class DemandPlanMatrix implements Serializable {
   private DemandPlan[] demandPlan;
   private boolean replaceAll;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(DemandPlanMatrix.class, true);

   public DemandPlanMatrix() {
      super();
   }

   public DemandPlanMatrix(DemandPlan[] demandPlan, boolean replaceAll) {
      super();
      this.demandPlan = demandPlan;
      this.replaceAll = replaceAll;
   }

   public DemandPlan[] getDemandPlan() {
      return this.demandPlan;
   }

   public void setDemandPlan(DemandPlan[] demandPlan) {
      this.demandPlan = demandPlan;
   }

   public DemandPlan getDemandPlan(int i) {
      return this.demandPlan[i];
   }

   public void setDemandPlan(int i, DemandPlan _value) {
      this.demandPlan[i] = _value;
   }

   public boolean isReplaceAll() {
      return this.replaceAll;
   }

   public void setReplaceAll(boolean replaceAll) {
      this.replaceAll = replaceAll;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof DemandPlanMatrix)) {
         return false;
      } else {
         DemandPlanMatrix other = (DemandPlanMatrix)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = (this.demandPlan == null && other.getDemandPlan() == null || this.demandPlan != null && Arrays.equals(this.demandPlan, other.getDemandPlan())) && this.replaceAll == other.isReplaceAll();
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
         if (this.getDemandPlan() != null) {
            for(int i = 0; i < Array.getLength(this.getDemandPlan()); ++i) {
               Object obj = Array.get(this.getDemandPlan(), i);
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
      typeDesc.setXmlType(new QName("urn:demandplanning_2018_1.transactions.webservices.netsuite.com", "DemandPlanMatrix"));
      AttributeDesc attrField = new AttributeDesc();
      attrField.setFieldName("replaceAll");
      attrField.setXmlName(new QName("", "replaceAll"));
      attrField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
      typeDesc.addFieldDesc(attrField);
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("demandPlan");
      elemField.setXmlName(new QName("urn:demandplanning_2018_1.transactions.webservices.netsuite.com", "demandPlan"));
      elemField.setXmlType(new QName("urn:demandplanning_2018_1.transactions.webservices.netsuite.com", "DemandPlan"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      elemField.setMaxOccursUnbounded(true);
      typeDesc.addFieldDesc(elemField);
   }
}
