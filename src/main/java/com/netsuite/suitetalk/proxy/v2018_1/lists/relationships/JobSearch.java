package com.netsuite.suitetalk.proxy.v2018_1.lists.relationships;

import com.netsuite.suitetalk.proxy.v2018_1.platform.common.BillingAccountSearchBasic;
import com.netsuite.suitetalk.proxy.v2018_1.platform.common.BillingScheduleSearchBasic;
import com.netsuite.suitetalk.proxy.v2018_1.platform.common.ContactSearchBasic;
import com.netsuite.suitetalk.proxy.v2018_1.platform.common.CustomSearchJoin;
import com.netsuite.suitetalk.proxy.v2018_1.platform.common.CustomerSearchBasic;
import com.netsuite.suitetalk.proxy.v2018_1.platform.common.JobSearchBasic;
import com.netsuite.suitetalk.proxy.v2018_1.platform.common.ProjectTaskSearchBasic;
import com.netsuite.suitetalk.proxy.v2018_1.platform.common.ResourceAllocationSearchBasic;
import com.netsuite.suitetalk.proxy.v2018_1.platform.common.TaskSearchBasic;
import com.netsuite.suitetalk.proxy.v2018_1.platform.common.TimeBillSearchBasic;
import com.netsuite.suitetalk.proxy.v2018_1.platform.core.SearchRecord;
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

public class JobSearch extends SearchRecord implements Serializable {
   private JobSearchBasic basic;
   private BillingAccountSearchBasic billingAccountJoin;
   private BillingScheduleSearchBasic billingScheduleJoin;
   private ContactSearchBasic contactPrimaryJoin;
   private CustomerSearchBasic customerJoin;
   private ProjectTaskSearchBasic projectTaskJoin;
   private ResourceAllocationSearchBasic resourceAllocationJoin;
   private TaskSearchBasic taskJoin;
   private TimeBillSearchBasic timeJoin;
   private CustomSearchJoin[] customSearchJoin;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(JobSearch.class, true);

   public JobSearch() {
      super();
   }

   public JobSearch(JobSearchBasic basic, BillingAccountSearchBasic billingAccountJoin, BillingScheduleSearchBasic billingScheduleJoin, ContactSearchBasic contactPrimaryJoin, CustomerSearchBasic customerJoin, ProjectTaskSearchBasic projectTaskJoin, ResourceAllocationSearchBasic resourceAllocationJoin, TaskSearchBasic taskJoin, TimeBillSearchBasic timeJoin, CustomSearchJoin[] customSearchJoin) {
      super();
      this.basic = basic;
      this.billingAccountJoin = billingAccountJoin;
      this.billingScheduleJoin = billingScheduleJoin;
      this.contactPrimaryJoin = contactPrimaryJoin;
      this.customerJoin = customerJoin;
      this.projectTaskJoin = projectTaskJoin;
      this.resourceAllocationJoin = resourceAllocationJoin;
      this.taskJoin = taskJoin;
      this.timeJoin = timeJoin;
      this.customSearchJoin = customSearchJoin;
   }

   public JobSearchBasic getBasic() {
      return this.basic;
   }

   public void setBasic(JobSearchBasic basic) {
      this.basic = basic;
   }

   public BillingAccountSearchBasic getBillingAccountJoin() {
      return this.billingAccountJoin;
   }

   public void setBillingAccountJoin(BillingAccountSearchBasic billingAccountJoin) {
      this.billingAccountJoin = billingAccountJoin;
   }

   public BillingScheduleSearchBasic getBillingScheduleJoin() {
      return this.billingScheduleJoin;
   }

   public void setBillingScheduleJoin(BillingScheduleSearchBasic billingScheduleJoin) {
      this.billingScheduleJoin = billingScheduleJoin;
   }

   public ContactSearchBasic getContactPrimaryJoin() {
      return this.contactPrimaryJoin;
   }

   public void setContactPrimaryJoin(ContactSearchBasic contactPrimaryJoin) {
      this.contactPrimaryJoin = contactPrimaryJoin;
   }

   public CustomerSearchBasic getCustomerJoin() {
      return this.customerJoin;
   }

   public void setCustomerJoin(CustomerSearchBasic customerJoin) {
      this.customerJoin = customerJoin;
   }

   public ProjectTaskSearchBasic getProjectTaskJoin() {
      return this.projectTaskJoin;
   }

   public void setProjectTaskJoin(ProjectTaskSearchBasic projectTaskJoin) {
      this.projectTaskJoin = projectTaskJoin;
   }

   public ResourceAllocationSearchBasic getResourceAllocationJoin() {
      return this.resourceAllocationJoin;
   }

   public void setResourceAllocationJoin(ResourceAllocationSearchBasic resourceAllocationJoin) {
      this.resourceAllocationJoin = resourceAllocationJoin;
   }

   public TaskSearchBasic getTaskJoin() {
      return this.taskJoin;
   }

   public void setTaskJoin(TaskSearchBasic taskJoin) {
      this.taskJoin = taskJoin;
   }

   public TimeBillSearchBasic getTimeJoin() {
      return this.timeJoin;
   }

   public void setTimeJoin(TimeBillSearchBasic timeJoin) {
      this.timeJoin = timeJoin;
   }

   public CustomSearchJoin[] getCustomSearchJoin() {
      return this.customSearchJoin;
   }

   public void setCustomSearchJoin(CustomSearchJoin[] customSearchJoin) {
      this.customSearchJoin = customSearchJoin;
   }

   public CustomSearchJoin getCustomSearchJoin(int i) {
      return this.customSearchJoin[i];
   }

   public void setCustomSearchJoin(int i, CustomSearchJoin _value) {
      this.customSearchJoin[i] = _value;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof JobSearch)) {
         return false;
      } else {
         JobSearch other = (JobSearch)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = super.equals(obj) && (this.basic == null && other.getBasic() == null || this.basic != null && this.basic.equals(other.getBasic())) && (this.billingAccountJoin == null && other.getBillingAccountJoin() == null || this.billingAccountJoin != null && this.billingAccountJoin.equals(other.getBillingAccountJoin())) && (this.billingScheduleJoin == null && other.getBillingScheduleJoin() == null || this.billingScheduleJoin != null && this.billingScheduleJoin.equals(other.getBillingScheduleJoin())) && (this.contactPrimaryJoin == null && other.getContactPrimaryJoin() == null || this.contactPrimaryJoin != null && this.contactPrimaryJoin.equals(other.getContactPrimaryJoin())) && (this.customerJoin == null && other.getCustomerJoin() == null || this.customerJoin != null && this.customerJoin.equals(other.getCustomerJoin())) && (this.projectTaskJoin == null && other.getProjectTaskJoin() == null || this.projectTaskJoin != null && this.projectTaskJoin.equals(other.getProjectTaskJoin())) && (this.resourceAllocationJoin == null && other.getResourceAllocationJoin() == null || this.resourceAllocationJoin != null && this.resourceAllocationJoin.equals(other.getResourceAllocationJoin())) && (this.taskJoin == null && other.getTaskJoin() == null || this.taskJoin != null && this.taskJoin.equals(other.getTaskJoin())) && (this.timeJoin == null && other.getTimeJoin() == null || this.timeJoin != null && this.timeJoin.equals(other.getTimeJoin())) && (this.customSearchJoin == null && other.getCustomSearchJoin() == null || this.customSearchJoin != null && Arrays.equals(this.customSearchJoin, other.getCustomSearchJoin()));
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

         if (this.getBillingAccountJoin() != null) {
            _hashCode += this.getBillingAccountJoin().hashCode();
         }

         if (this.getBillingScheduleJoin() != null) {
            _hashCode += this.getBillingScheduleJoin().hashCode();
         }

         if (this.getContactPrimaryJoin() != null) {
            _hashCode += this.getContactPrimaryJoin().hashCode();
         }

         if (this.getCustomerJoin() != null) {
            _hashCode += this.getCustomerJoin().hashCode();
         }

         if (this.getProjectTaskJoin() != null) {
            _hashCode += this.getProjectTaskJoin().hashCode();
         }

         if (this.getResourceAllocationJoin() != null) {
            _hashCode += this.getResourceAllocationJoin().hashCode();
         }

         if (this.getTaskJoin() != null) {
            _hashCode += this.getTaskJoin().hashCode();
         }

         if (this.getTimeJoin() != null) {
            _hashCode += this.getTimeJoin().hashCode();
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
      typeDesc.setXmlType(new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "JobSearch"));
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("basic");
      elemField.setXmlName(new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "basic"));
      elemField.setXmlType(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "JobSearchBasic"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("billingAccountJoin");
      elemField.setXmlName(new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "billingAccountJoin"));
      elemField.setXmlType(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "BillingAccountSearchBasic"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("billingScheduleJoin");
      elemField.setXmlName(new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "billingScheduleJoin"));
      elemField.setXmlType(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "BillingScheduleSearchBasic"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("contactPrimaryJoin");
      elemField.setXmlName(new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "contactPrimaryJoin"));
      elemField.setXmlType(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "ContactSearchBasic"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("customerJoin");
      elemField.setXmlName(new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "customerJoin"));
      elemField.setXmlType(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "CustomerSearchBasic"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("projectTaskJoin");
      elemField.setXmlName(new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "projectTaskJoin"));
      elemField.setXmlType(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "ProjectTaskSearchBasic"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("resourceAllocationJoin");
      elemField.setXmlName(new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "resourceAllocationJoin"));
      elemField.setXmlType(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "ResourceAllocationSearchBasic"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("taskJoin");
      elemField.setXmlName(new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "taskJoin"));
      elemField.setXmlType(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "TaskSearchBasic"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("timeJoin");
      elemField.setXmlName(new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "timeJoin"));
      elemField.setXmlType(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "TimeBillSearchBasic"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("customSearchJoin");
      elemField.setXmlName(new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "customSearchJoin"));
      elemField.setXmlType(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "CustomSearchJoin"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      elemField.setMaxOccursUnbounded(true);
      typeDesc.addFieldDesc(elemField);
   }
}
