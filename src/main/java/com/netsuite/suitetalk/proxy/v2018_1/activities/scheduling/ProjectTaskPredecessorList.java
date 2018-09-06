package com.netsuite.suitetalk.proxy.v2018_1.activities.scheduling;

import org.apache.axis.description.AttributeDesc;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

import javax.xml.namespace.QName;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Arrays;

public class ProjectTaskPredecessorList implements Serializable {
   private ProjectTaskPredecessor[] projectTaskPredecessor;
   private boolean replaceAll;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(ProjectTaskPredecessorList.class, true);

   public ProjectTaskPredecessorList() {
      super();
   }

   public ProjectTaskPredecessorList(ProjectTaskPredecessor[] projectTaskPredecessor, boolean replaceAll) {
      super();
      this.projectTaskPredecessor = projectTaskPredecessor;
      this.replaceAll = replaceAll;
   }

   public ProjectTaskPredecessor[] getProjectTaskPredecessor() {
      return this.projectTaskPredecessor;
   }

   public void setProjectTaskPredecessor(ProjectTaskPredecessor[] projectTaskPredecessor) {
      this.projectTaskPredecessor = projectTaskPredecessor;
   }

   public ProjectTaskPredecessor getProjectTaskPredecessor(int i) {
      return this.projectTaskPredecessor[i];
   }

   public void setProjectTaskPredecessor(int i, ProjectTaskPredecessor _value) {
      this.projectTaskPredecessor[i] = _value;
   }

   public boolean isReplaceAll() {
      return this.replaceAll;
   }

   public void setReplaceAll(boolean replaceAll) {
      this.replaceAll = replaceAll;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof ProjectTaskPredecessorList)) {
         return false;
      } else {
         ProjectTaskPredecessorList other = (ProjectTaskPredecessorList)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = (this.projectTaskPredecessor == null && other.getProjectTaskPredecessor() == null || this.projectTaskPredecessor != null && Arrays.equals(this.projectTaskPredecessor, other.getProjectTaskPredecessor())) && this.replaceAll == other.isReplaceAll();
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
         if (this.getProjectTaskPredecessor() != null) {
            for(int i = 0; i < Array.getLength(this.getProjectTaskPredecessor()); ++i) {
               Object obj = Array.get(this.getProjectTaskPredecessor(), i);
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
      typeDesc.setXmlType(new QName("urn:scheduling_2018_1.activities.webservices.netsuite.com", "ProjectTaskPredecessorList"));
      AttributeDesc attrField = new AttributeDesc();
      attrField.setFieldName("replaceAll");
      attrField.setXmlName(new QName("", "replaceAll"));
      attrField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
      typeDesc.addFieldDesc(attrField);
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("projectTaskPredecessor");
      elemField.setXmlName(new QName("urn:scheduling_2018_1.activities.webservices.netsuite.com", "projectTaskPredecessor"));
      elemField.setXmlType(new QName("urn:scheduling_2018_1.activities.webservices.netsuite.com", "ProjectTaskPredecessor"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      elemField.setMaxOccursUnbounded(true);
      typeDesc.addFieldDesc(elemField);
   }
}
