package com.netsuite.suitetalk.proxy.v2018_1.activities.scheduling;

import com.netsuite.suitetalk.proxy.v2018_1.platform.core.RecordRef;
import com.netsuite.suitetalk.proxy.v2018_1.activities.scheduling.types.ProjectTaskPredecessorPredecessorType;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

import javax.xml.namespace.QName;
import java.io.Serializable;
import java.util.Calendar;

public class ProjectTaskPredecessor implements Serializable {
   private RecordRef task;
   private ProjectTaskPredecessorPredecessorType type;
   private Double lagDays;
   private Calendar startDate;
   private Calendar endDate;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(ProjectTaskPredecessor.class, true);

   public ProjectTaskPredecessor() {
      super();
   }

   public ProjectTaskPredecessor(RecordRef task, ProjectTaskPredecessorPredecessorType type, Double lagDays, Calendar startDate, Calendar endDate) {
      super();
      this.task = task;
      this.type = type;
      this.lagDays = lagDays;
      this.startDate = startDate;
      this.endDate = endDate;
   }

   public RecordRef getTask() {
      return this.task;
   }

   public void setTask(RecordRef task) {
      this.task = task;
   }

   public ProjectTaskPredecessorPredecessorType getType() {
      return this.type;
   }

   public void setType(ProjectTaskPredecessorPredecessorType type) {
      this.type = type;
   }

   public Double getLagDays() {
      return this.lagDays;
   }

   public void setLagDays(Double lagDays) {
      this.lagDays = lagDays;
   }

   public Calendar getStartDate() {
      return this.startDate;
   }

   public void setStartDate(Calendar startDate) {
      this.startDate = startDate;
   }

   public Calendar getEndDate() {
      return this.endDate;
   }

   public void setEndDate(Calendar endDate) {
      this.endDate = endDate;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof ProjectTaskPredecessor)) {
         return false;
      } else {
         ProjectTaskPredecessor other = (ProjectTaskPredecessor)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = (this.task == null && other.getTask() == null || this.task != null && this.task.equals(other.getTask())) && (this.type == null && other.getType() == null || this.type != null && this.type.equals(other.getType())) && (this.lagDays == null && other.getLagDays() == null || this.lagDays != null && this.lagDays.equals(other.getLagDays())) && (this.startDate == null && other.getStartDate() == null || this.startDate != null && this.startDate.equals(other.getStartDate())) && (this.endDate == null && other.getEndDate() == null || this.endDate != null && this.endDate.equals(other.getEndDate()));
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
         if (this.getTask() != null) {
            _hashCode += this.getTask().hashCode();
         }

         if (this.getType() != null) {
            _hashCode += this.getType().hashCode();
         }

         if (this.getLagDays() != null) {
            _hashCode += this.getLagDays().hashCode();
         }

         if (this.getStartDate() != null) {
            _hashCode += this.getStartDate().hashCode();
         }

         if (this.getEndDate() != null) {
            _hashCode += this.getEndDate().hashCode();
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
      typeDesc.setXmlType(new QName("urn:scheduling_2018_1.activities.webservices.netsuite.com", "ProjectTaskPredecessor"));
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("task");
      elemField.setXmlName(new QName("urn:scheduling_2018_1.activities.webservices.netsuite.com", "task"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("type");
      elemField.setXmlName(new QName("urn:scheduling_2018_1.activities.webservices.netsuite.com", "type"));
      elemField.setXmlType(new QName("urn:types.scheduling_2018_1.activities.webservices.netsuite.com", "ProjectTaskPredecessorPredecessorType"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("lagDays");
      elemField.setXmlName(new QName("urn:scheduling_2018_1.activities.webservices.netsuite.com", "lagDays"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("startDate");
      elemField.setXmlName(new QName("urn:scheduling_2018_1.activities.webservices.netsuite.com", "startDate"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("endDate");
      elemField.setXmlName(new QName("urn:scheduling_2018_1.activities.webservices.netsuite.com", "endDate"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
   }
}
