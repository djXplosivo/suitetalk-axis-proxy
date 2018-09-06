package com.netsuite.suitetalk.proxy.v2018_1.platform.messages;

import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class Preferences implements Serializable {
   private Boolean warningAsError;
   private Boolean disableMandatoryCustomFieldValidation;
   private Boolean disableSystemNotesForCustomFields;
   private Boolean ignoreReadOnlyFields;
   private Boolean runServerSuiteScriptAndTriggerWorkflows;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(Preferences.class, true);

   public Preferences() {
      super();
   }

   public Preferences(Boolean warningAsError, Boolean disableMandatoryCustomFieldValidation, Boolean disableSystemNotesForCustomFields, Boolean ignoreReadOnlyFields, Boolean runServerSuiteScriptAndTriggerWorkflows) {
      super();
      this.warningAsError = warningAsError;
      this.disableMandatoryCustomFieldValidation = disableMandatoryCustomFieldValidation;
      this.disableSystemNotesForCustomFields = disableSystemNotesForCustomFields;
      this.ignoreReadOnlyFields = ignoreReadOnlyFields;
      this.runServerSuiteScriptAndTriggerWorkflows = runServerSuiteScriptAndTriggerWorkflows;
   }

   public Boolean getWarningAsError() {
      return this.warningAsError;
   }

   public void setWarningAsError(Boolean warningAsError) {
      this.warningAsError = warningAsError;
   }

   public Boolean getDisableMandatoryCustomFieldValidation() {
      return this.disableMandatoryCustomFieldValidation;
   }

   public void setDisableMandatoryCustomFieldValidation(Boolean disableMandatoryCustomFieldValidation) {
      this.disableMandatoryCustomFieldValidation = disableMandatoryCustomFieldValidation;
   }

   public Boolean getDisableSystemNotesForCustomFields() {
      return this.disableSystemNotesForCustomFields;
   }

   public void setDisableSystemNotesForCustomFields(Boolean disableSystemNotesForCustomFields) {
      this.disableSystemNotesForCustomFields = disableSystemNotesForCustomFields;
   }

   public Boolean getIgnoreReadOnlyFields() {
      return this.ignoreReadOnlyFields;
   }

   public void setIgnoreReadOnlyFields(Boolean ignoreReadOnlyFields) {
      this.ignoreReadOnlyFields = ignoreReadOnlyFields;
   }

   public Boolean getRunServerSuiteScriptAndTriggerWorkflows() {
      return this.runServerSuiteScriptAndTriggerWorkflows;
   }

   public void setRunServerSuiteScriptAndTriggerWorkflows(Boolean runServerSuiteScriptAndTriggerWorkflows) {
      this.runServerSuiteScriptAndTriggerWorkflows = runServerSuiteScriptAndTriggerWorkflows;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof Preferences)) {
         return false;
      } else {
         Preferences other = (Preferences)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = (this.warningAsError == null && other.getWarningAsError() == null || this.warningAsError != null && this.warningAsError.equals(other.getWarningAsError())) && (this.disableMandatoryCustomFieldValidation == null && other.getDisableMandatoryCustomFieldValidation() == null || this.disableMandatoryCustomFieldValidation != null && this.disableMandatoryCustomFieldValidation.equals(other.getDisableMandatoryCustomFieldValidation())) && (this.disableSystemNotesForCustomFields == null && other.getDisableSystemNotesForCustomFields() == null || this.disableSystemNotesForCustomFields != null && this.disableSystemNotesForCustomFields.equals(other.getDisableSystemNotesForCustomFields())) && (this.ignoreReadOnlyFields == null && other.getIgnoreReadOnlyFields() == null || this.ignoreReadOnlyFields != null && this.ignoreReadOnlyFields.equals(other.getIgnoreReadOnlyFields())) && (this.runServerSuiteScriptAndTriggerWorkflows == null && other.getRunServerSuiteScriptAndTriggerWorkflows() == null || this.runServerSuiteScriptAndTriggerWorkflows != null && this.runServerSuiteScriptAndTriggerWorkflows.equals(other.getRunServerSuiteScriptAndTriggerWorkflows()));
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
         if (this.getWarningAsError() != null) {
            _hashCode += this.getWarningAsError().hashCode();
         }

         if (this.getDisableMandatoryCustomFieldValidation() != null) {
            _hashCode += this.getDisableMandatoryCustomFieldValidation().hashCode();
         }

         if (this.getDisableSystemNotesForCustomFields() != null) {
            _hashCode += this.getDisableSystemNotesForCustomFields().hashCode();
         }

         if (this.getIgnoreReadOnlyFields() != null) {
            _hashCode += this.getIgnoreReadOnlyFields().hashCode();
         }

         if (this.getRunServerSuiteScriptAndTriggerWorkflows() != null) {
            _hashCode += this.getRunServerSuiteScriptAndTriggerWorkflows().hashCode();
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
      typeDesc.setXmlType(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "Preferences"));
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("warningAsError");
      elemField.setXmlName(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "warningAsError"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("disableMandatoryCustomFieldValidation");
      elemField.setXmlName(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "disableMandatoryCustomFieldValidation"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("disableSystemNotesForCustomFields");
      elemField.setXmlName(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "disableSystemNotesForCustomFields"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("ignoreReadOnlyFields");
      elemField.setXmlName(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "ignoreReadOnlyFields"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("runServerSuiteScriptAndTriggerWorkflows");
      elemField.setXmlName(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "runServerSuiteScriptAndTriggerWorkflows"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
   }
}
