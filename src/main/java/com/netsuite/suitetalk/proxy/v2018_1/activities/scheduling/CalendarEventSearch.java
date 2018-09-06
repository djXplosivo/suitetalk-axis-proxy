package com.netsuite.suitetalk.proxy.v2018_1.activities.scheduling;

import com.netsuite.suitetalk.proxy.v2018_1.platform.common.*;
import com.netsuite.suitetalk.proxy.v2018_1.platform.core.SearchRecord;
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

public class CalendarEventSearch extends SearchRecord implements Serializable {
   private CalendarEventSearchBasic basic;
   private EntitySearchBasic attendeeJoin;
   private ContactSearchBasic attendeeContactJoin;
   private CustomerSearchBasic attendeeCustomerJoin;
   private SupportCaseSearchBasic caseJoin;
   private FileSearchBasic fileJoin;
   private OpportunitySearchBasic opportunityJoin;
   private OriginatingLeadSearchBasic originatingLeadJoin;
   private TimeBillSearchBasic timeJoin;
   private TransactionSearchBasic transactionJoin;
   private EmployeeSearchBasic userJoin;
   private NoteSearchBasic userNotesJoin;
   private CustomSearchJoin[] customSearchJoin;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(CalendarEventSearch.class, true);

   public CalendarEventSearch() {
      super();
   }

   public CalendarEventSearch(CalendarEventSearchBasic basic, EntitySearchBasic attendeeJoin, ContactSearchBasic attendeeContactJoin, CustomerSearchBasic attendeeCustomerJoin, SupportCaseSearchBasic caseJoin, FileSearchBasic fileJoin, OpportunitySearchBasic opportunityJoin, OriginatingLeadSearchBasic originatingLeadJoin, TimeBillSearchBasic timeJoin, TransactionSearchBasic transactionJoin, EmployeeSearchBasic userJoin, NoteSearchBasic userNotesJoin, CustomSearchJoin[] customSearchJoin) {
      super();
      this.basic = basic;
      this.attendeeJoin = attendeeJoin;
      this.attendeeContactJoin = attendeeContactJoin;
      this.attendeeCustomerJoin = attendeeCustomerJoin;
      this.caseJoin = caseJoin;
      this.fileJoin = fileJoin;
      this.opportunityJoin = opportunityJoin;
      this.originatingLeadJoin = originatingLeadJoin;
      this.timeJoin = timeJoin;
      this.transactionJoin = transactionJoin;
      this.userJoin = userJoin;
      this.userNotesJoin = userNotesJoin;
      this.customSearchJoin = customSearchJoin;
   }

   public CalendarEventSearchBasic getBasic() {
      return this.basic;
   }

   public void setBasic(CalendarEventSearchBasic basic) {
      this.basic = basic;
   }

   public EntitySearchBasic getAttendeeJoin() {
      return this.attendeeJoin;
   }

   public void setAttendeeJoin(EntitySearchBasic attendeeJoin) {
      this.attendeeJoin = attendeeJoin;
   }

   public ContactSearchBasic getAttendeeContactJoin() {
      return this.attendeeContactJoin;
   }

   public void setAttendeeContactJoin(ContactSearchBasic attendeeContactJoin) {
      this.attendeeContactJoin = attendeeContactJoin;
   }

   public CustomerSearchBasic getAttendeeCustomerJoin() {
      return this.attendeeCustomerJoin;
   }

   public void setAttendeeCustomerJoin(CustomerSearchBasic attendeeCustomerJoin) {
      this.attendeeCustomerJoin = attendeeCustomerJoin;
   }

   public SupportCaseSearchBasic getCaseJoin() {
      return this.caseJoin;
   }

   public void setCaseJoin(SupportCaseSearchBasic caseJoin) {
      this.caseJoin = caseJoin;
   }

   public FileSearchBasic getFileJoin() {
      return this.fileJoin;
   }

   public void setFileJoin(FileSearchBasic fileJoin) {
      this.fileJoin = fileJoin;
   }

   public OpportunitySearchBasic getOpportunityJoin() {
      return this.opportunityJoin;
   }

   public void setOpportunityJoin(OpportunitySearchBasic opportunityJoin) {
      this.opportunityJoin = opportunityJoin;
   }

   public OriginatingLeadSearchBasic getOriginatingLeadJoin() {
      return this.originatingLeadJoin;
   }

   public void setOriginatingLeadJoin(OriginatingLeadSearchBasic originatingLeadJoin) {
      this.originatingLeadJoin = originatingLeadJoin;
   }

   public TimeBillSearchBasic getTimeJoin() {
      return this.timeJoin;
   }

   public void setTimeJoin(TimeBillSearchBasic timeJoin) {
      this.timeJoin = timeJoin;
   }

   public TransactionSearchBasic getTransactionJoin() {
      return this.transactionJoin;
   }

   public void setTransactionJoin(TransactionSearchBasic transactionJoin) {
      this.transactionJoin = transactionJoin;
   }

   public EmployeeSearchBasic getUserJoin() {
      return this.userJoin;
   }

   public void setUserJoin(EmployeeSearchBasic userJoin) {
      this.userJoin = userJoin;
   }

   public NoteSearchBasic getUserNotesJoin() {
      return this.userNotesJoin;
   }

   public void setUserNotesJoin(NoteSearchBasic userNotesJoin) {
      this.userNotesJoin = userNotesJoin;
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
      if (!(obj instanceof CalendarEventSearch)) {
         return false;
      } else {
         CalendarEventSearch other = (CalendarEventSearch)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = super.equals(obj) && (this.basic == null && other.getBasic() == null || this.basic != null && this.basic.equals(other.getBasic())) && (this.attendeeJoin == null && other.getAttendeeJoin() == null || this.attendeeJoin != null && this.attendeeJoin.equals(other.getAttendeeJoin())) && (this.attendeeContactJoin == null && other.getAttendeeContactJoin() == null || this.attendeeContactJoin != null && this.attendeeContactJoin.equals(other.getAttendeeContactJoin())) && (this.attendeeCustomerJoin == null && other.getAttendeeCustomerJoin() == null || this.attendeeCustomerJoin != null && this.attendeeCustomerJoin.equals(other.getAttendeeCustomerJoin())) && (this.caseJoin == null && other.getCaseJoin() == null || this.caseJoin != null && this.caseJoin.equals(other.getCaseJoin())) && (this.fileJoin == null && other.getFileJoin() == null || this.fileJoin != null && this.fileJoin.equals(other.getFileJoin())) && (this.opportunityJoin == null && other.getOpportunityJoin() == null || this.opportunityJoin != null && this.opportunityJoin.equals(other.getOpportunityJoin())) && (this.originatingLeadJoin == null && other.getOriginatingLeadJoin() == null || this.originatingLeadJoin != null && this.originatingLeadJoin.equals(other.getOriginatingLeadJoin())) && (this.timeJoin == null && other.getTimeJoin() == null || this.timeJoin != null && this.timeJoin.equals(other.getTimeJoin())) && (this.transactionJoin == null && other.getTransactionJoin() == null || this.transactionJoin != null && this.transactionJoin.equals(other.getTransactionJoin())) && (this.userJoin == null && other.getUserJoin() == null || this.userJoin != null && this.userJoin.equals(other.getUserJoin())) && (this.userNotesJoin == null && other.getUserNotesJoin() == null || this.userNotesJoin != null && this.userNotesJoin.equals(other.getUserNotesJoin())) && (this.customSearchJoin == null && other.getCustomSearchJoin() == null || this.customSearchJoin != null && Arrays.equals(this.customSearchJoin, other.getCustomSearchJoin()));
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

         if (this.getAttendeeJoin() != null) {
            _hashCode += this.getAttendeeJoin().hashCode();
         }

         if (this.getAttendeeContactJoin() != null) {
            _hashCode += this.getAttendeeContactJoin().hashCode();
         }

         if (this.getAttendeeCustomerJoin() != null) {
            _hashCode += this.getAttendeeCustomerJoin().hashCode();
         }

         if (this.getCaseJoin() != null) {
            _hashCode += this.getCaseJoin().hashCode();
         }

         if (this.getFileJoin() != null) {
            _hashCode += this.getFileJoin().hashCode();
         }

         if (this.getOpportunityJoin() != null) {
            _hashCode += this.getOpportunityJoin().hashCode();
         }

         if (this.getOriginatingLeadJoin() != null) {
            _hashCode += this.getOriginatingLeadJoin().hashCode();
         }

         if (this.getTimeJoin() != null) {
            _hashCode += this.getTimeJoin().hashCode();
         }

         if (this.getTransactionJoin() != null) {
            _hashCode += this.getTransactionJoin().hashCode();
         }

         if (this.getUserJoin() != null) {
            _hashCode += this.getUserJoin().hashCode();
         }

         if (this.getUserNotesJoin() != null) {
            _hashCode += this.getUserNotesJoin().hashCode();
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
      typeDesc.setXmlType(new QName("urn:scheduling_2018_1.activities.webservices.netsuite.com", "CalendarEventSearch"));
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("basic");
      elemField.setXmlName(new QName("urn:scheduling_2018_1.activities.webservices.netsuite.com", "basic"));
      elemField.setXmlType(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "CalendarEventSearchBasic"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("attendeeJoin");
      elemField.setXmlName(new QName("urn:scheduling_2018_1.activities.webservices.netsuite.com", "attendeeJoin"));
      elemField.setXmlType(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "EntitySearchBasic"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("attendeeContactJoin");
      elemField.setXmlName(new QName("urn:scheduling_2018_1.activities.webservices.netsuite.com", "attendeeContactJoin"));
      elemField.setXmlType(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "ContactSearchBasic"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("attendeeCustomerJoin");
      elemField.setXmlName(new QName("urn:scheduling_2018_1.activities.webservices.netsuite.com", "attendeeCustomerJoin"));
      elemField.setXmlType(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "CustomerSearchBasic"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("caseJoin");
      elemField.setXmlName(new QName("urn:scheduling_2018_1.activities.webservices.netsuite.com", "caseJoin"));
      elemField.setXmlType(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "SupportCaseSearchBasic"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("fileJoin");
      elemField.setXmlName(new QName("urn:scheduling_2018_1.activities.webservices.netsuite.com", "fileJoin"));
      elemField.setXmlType(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "FileSearchBasic"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("opportunityJoin");
      elemField.setXmlName(new QName("urn:scheduling_2018_1.activities.webservices.netsuite.com", "opportunityJoin"));
      elemField.setXmlType(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "OpportunitySearchBasic"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("originatingLeadJoin");
      elemField.setXmlName(new QName("urn:scheduling_2018_1.activities.webservices.netsuite.com", "originatingLeadJoin"));
      elemField.setXmlType(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "OriginatingLeadSearchBasic"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("timeJoin");
      elemField.setXmlName(new QName("urn:scheduling_2018_1.activities.webservices.netsuite.com", "timeJoin"));
      elemField.setXmlType(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "TimeBillSearchBasic"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("transactionJoin");
      elemField.setXmlName(new QName("urn:scheduling_2018_1.activities.webservices.netsuite.com", "transactionJoin"));
      elemField.setXmlType(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "TransactionSearchBasic"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("userJoin");
      elemField.setXmlName(new QName("urn:scheduling_2018_1.activities.webservices.netsuite.com", "userJoin"));
      elemField.setXmlType(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "EmployeeSearchBasic"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("userNotesJoin");
      elemField.setXmlName(new QName("urn:scheduling_2018_1.activities.webservices.netsuite.com", "userNotesJoin"));
      elemField.setXmlType(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "NoteSearchBasic"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("customSearchJoin");
      elemField.setXmlName(new QName("urn:scheduling_2018_1.activities.webservices.netsuite.com", "customSearchJoin"));
      elemField.setXmlType(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "CustomSearchJoin"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      elemField.setMaxOccursUnbounded(true);
      typeDesc.addFieldDesc(elemField);
   }
}
