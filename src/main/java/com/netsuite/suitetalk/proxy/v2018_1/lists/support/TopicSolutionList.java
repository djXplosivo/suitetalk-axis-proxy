package com.netsuite.suitetalk.proxy.v2018_1.lists.support;

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

public class TopicSolutionList implements Serializable {
   private TopicSolution[] solution;
   private boolean replaceAll;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(TopicSolutionList.class, true);

   public TopicSolutionList() {
      super();
   }

   public TopicSolutionList(TopicSolution[] solution, boolean replaceAll) {
      super();
      this.solution = solution;
      this.replaceAll = replaceAll;
   }

   public TopicSolution[] getSolution() {
      return this.solution;
   }

   public void setSolution(TopicSolution[] solution) {
      this.solution = solution;
   }

   public TopicSolution getSolution(int i) {
      return this.solution[i];
   }

   public void setSolution(int i, TopicSolution _value) {
      this.solution[i] = _value;
   }

   public boolean isReplaceAll() {
      return this.replaceAll;
   }

   public void setReplaceAll(boolean replaceAll) {
      this.replaceAll = replaceAll;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof TopicSolutionList)) {
         return false;
      } else {
         TopicSolutionList other = (TopicSolutionList)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = (this.solution == null && other.getSolution() == null || this.solution != null && Arrays.equals(this.solution, other.getSolution())) && this.replaceAll == other.isReplaceAll();
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
         if (this.getSolution() != null) {
            for(int i = 0; i < Array.getLength(this.getSolution()); ++i) {
               Object obj = Array.get(this.getSolution(), i);
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
      typeDesc.setXmlType(new QName("urn:support_2018_1.lists.webservices.netsuite.com", "TopicSolutionList"));
      AttributeDesc attrField = new AttributeDesc();
      attrField.setFieldName("replaceAll");
      attrField.setXmlName(new QName("", "replaceAll"));
      attrField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
      typeDesc.addFieldDesc(attrField);
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("solution");
      elemField.setXmlName(new QName("urn:support_2018_1.lists.webservices.netsuite.com", "solution"));
      elemField.setXmlType(new QName("urn:support_2018_1.lists.webservices.netsuite.com", "TopicSolution"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      elemField.setMaxOccursUnbounded(true);
      typeDesc.addFieldDesc(elemField);
   }
}
