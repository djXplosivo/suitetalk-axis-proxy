package com.netsuite.suitetalk.proxy.v2018_1.setup.customization;

import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class CustomRecordTypeForms implements Serializable {
   private String formEdit;
   private String formName;
   private Boolean formPref;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(CustomRecordTypeForms.class, true);

   public CustomRecordTypeForms() {
      super();
   }

   public CustomRecordTypeForms(String formEdit, String formName, Boolean formPref) {
      super();
      this.formEdit = formEdit;
      this.formName = formName;
      this.formPref = formPref;
   }

   public String getFormEdit() {
      return this.formEdit;
   }

   public void setFormEdit(String formEdit) {
      this.formEdit = formEdit;
   }

   public String getFormName() {
      return this.formName;
   }

   public void setFormName(String formName) {
      this.formName = formName;
   }

   public Boolean getFormPref() {
      return this.formPref;
   }

   public void setFormPref(Boolean formPref) {
      this.formPref = formPref;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof CustomRecordTypeForms)) {
         return false;
      } else {
         CustomRecordTypeForms other = (CustomRecordTypeForms)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = (this.formEdit == null && other.getFormEdit() == null || this.formEdit != null && this.formEdit.equals(other.getFormEdit())) && (this.formName == null && other.getFormName() == null || this.formName != null && this.formName.equals(other.getFormName())) && (this.formPref == null && other.getFormPref() == null || this.formPref != null && this.formPref.equals(other.getFormPref()));
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
         if (this.getFormEdit() != null) {
            _hashCode += this.getFormEdit().hashCode();
         }

         if (this.getFormName() != null) {
            _hashCode += this.getFormName().hashCode();
         }

         if (this.getFormPref() != null) {
            _hashCode += this.getFormPref().hashCode();
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
      typeDesc.setXmlType(new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "CustomRecordTypeForms"));
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("formEdit");
      elemField.setXmlName(new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "formEdit"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("formName");
      elemField.setXmlName(new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "formName"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("formPref");
      elemField.setXmlName(new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "formPref"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
   }
}
