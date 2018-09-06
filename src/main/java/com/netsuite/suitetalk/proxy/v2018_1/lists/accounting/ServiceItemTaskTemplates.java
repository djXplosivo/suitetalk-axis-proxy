package com.netsuite.suitetalk.proxy.v2018_1.lists.accounting;

import com.netsuite.suitetalk.proxy.v2018_1.platform.core.Duration;
import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class ServiceItemTaskTemplates implements Serializable {
   private String taskName;
   private Long taskStartOffset;
   private Duration taskDuration;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(ServiceItemTaskTemplates.class, true);

   public ServiceItemTaskTemplates() {
      super();
   }

   public ServiceItemTaskTemplates(String taskName, Long taskStartOffset, Duration taskDuration) {
      super();
      this.taskName = taskName;
      this.taskStartOffset = taskStartOffset;
      this.taskDuration = taskDuration;
   }

   public String getTaskName() {
      return this.taskName;
   }

   public void setTaskName(String taskName) {
      this.taskName = taskName;
   }

   public Long getTaskStartOffset() {
      return this.taskStartOffset;
   }

   public void setTaskStartOffset(Long taskStartOffset) {
      this.taskStartOffset = taskStartOffset;
   }

   public Duration getTaskDuration() {
      return this.taskDuration;
   }

   public void setTaskDuration(Duration taskDuration) {
      this.taskDuration = taskDuration;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof ServiceItemTaskTemplates)) {
         return false;
      } else {
         ServiceItemTaskTemplates other = (ServiceItemTaskTemplates)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = (this.taskName == null && other.getTaskName() == null || this.taskName != null && this.taskName.equals(other.getTaskName())) && (this.taskStartOffset == null && other.getTaskStartOffset() == null || this.taskStartOffset != null && this.taskStartOffset.equals(other.getTaskStartOffset())) && (this.taskDuration == null && other.getTaskDuration() == null || this.taskDuration != null && this.taskDuration.equals(other.getTaskDuration()));
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
         if (this.getTaskName() != null) {
            _hashCode += this.getTaskName().hashCode();
         }

         if (this.getTaskStartOffset() != null) {
            _hashCode += this.getTaskStartOffset().hashCode();
         }

         if (this.getTaskDuration() != null) {
            _hashCode += this.getTaskDuration().hashCode();
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
      typeDesc.setXmlType(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "ServiceItemTaskTemplates"));
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("taskName");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "taskName"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("taskStartOffset");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "taskStartOffset"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "long"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("taskDuration");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "taskDuration"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "Duration"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
   }
}
