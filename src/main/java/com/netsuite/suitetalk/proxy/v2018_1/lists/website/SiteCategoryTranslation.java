package com.netsuite.suitetalk.proxy.v2018_1.lists.website;

import com.netsuite.suitetalk.proxy.v2018_1.platform.common.types.Language;
import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class SiteCategoryTranslation implements Serializable {
   private Language locale;
   private String language;
   private String displayName;
   private String description;
   private String storeDetailedDescription;
   private String pageTitle;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(SiteCategoryTranslation.class, true);

   public SiteCategoryTranslation() {
      super();
   }

   public SiteCategoryTranslation(Language locale, String language, String displayName, String description, String storeDetailedDescription, String pageTitle) {
      super();
      this.locale = locale;
      this.language = language;
      this.displayName = displayName;
      this.description = description;
      this.storeDetailedDescription = storeDetailedDescription;
      this.pageTitle = pageTitle;
   }

   public Language getLocale() {
      return this.locale;
   }

   public void setLocale(Language locale) {
      this.locale = locale;
   }

   public String getLanguage() {
      return this.language;
   }

   public void setLanguage(String language) {
      this.language = language;
   }

   public String getDisplayName() {
      return this.displayName;
   }

   public void setDisplayName(String displayName) {
      this.displayName = displayName;
   }

   public String getDescription() {
      return this.description;
   }

   public void setDescription(String description) {
      this.description = description;
   }

   public String getStoreDetailedDescription() {
      return this.storeDetailedDescription;
   }

   public void setStoreDetailedDescription(String storeDetailedDescription) {
      this.storeDetailedDescription = storeDetailedDescription;
   }

   public String getPageTitle() {
      return this.pageTitle;
   }

   public void setPageTitle(String pageTitle) {
      this.pageTitle = pageTitle;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof SiteCategoryTranslation)) {
         return false;
      } else {
         SiteCategoryTranslation other = (SiteCategoryTranslation)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = (this.locale == null && other.getLocale() == null || this.locale != null && this.locale.equals(other.getLocale())) && (this.language == null && other.getLanguage() == null || this.language != null && this.language.equals(other.getLanguage())) && (this.displayName == null && other.getDisplayName() == null || this.displayName != null && this.displayName.equals(other.getDisplayName())) && (this.description == null && other.getDescription() == null || this.description != null && this.description.equals(other.getDescription())) && (this.storeDetailedDescription == null && other.getStoreDetailedDescription() == null || this.storeDetailedDescription != null && this.storeDetailedDescription.equals(other.getStoreDetailedDescription())) && (this.pageTitle == null && other.getPageTitle() == null || this.pageTitle != null && this.pageTitle.equals(other.getPageTitle()));
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
         if (this.getLocale() != null) {
            _hashCode += this.getLocale().hashCode();
         }

         if (this.getLanguage() != null) {
            _hashCode += this.getLanguage().hashCode();
         }

         if (this.getDisplayName() != null) {
            _hashCode += this.getDisplayName().hashCode();
         }

         if (this.getDescription() != null) {
            _hashCode += this.getDescription().hashCode();
         }

         if (this.getStoreDetailedDescription() != null) {
            _hashCode += this.getStoreDetailedDescription().hashCode();
         }

         if (this.getPageTitle() != null) {
            _hashCode += this.getPageTitle().hashCode();
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
      typeDesc.setXmlType(new QName("urn:website_2018_1.lists.webservices.netsuite.com", "SiteCategoryTranslation"));
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("locale");
      elemField.setXmlName(new QName("urn:website_2018_1.lists.webservices.netsuite.com", "locale"));
      elemField.setXmlType(new QName("urn:types.common_2018_1.platform.webservices.netsuite.com", "Language"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("language");
      elemField.setXmlName(new QName("urn:website_2018_1.lists.webservices.netsuite.com", "language"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("displayName");
      elemField.setXmlName(new QName("urn:website_2018_1.lists.webservices.netsuite.com", "displayName"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("description");
      elemField.setXmlName(new QName("urn:website_2018_1.lists.webservices.netsuite.com", "description"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("storeDetailedDescription");
      elemField.setXmlName(new QName("urn:website_2018_1.lists.webservices.netsuite.com", "storeDetailedDescription"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("pageTitle");
      elemField.setXmlName(new QName("urn:website_2018_1.lists.webservices.netsuite.com", "pageTitle"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
   }
}
