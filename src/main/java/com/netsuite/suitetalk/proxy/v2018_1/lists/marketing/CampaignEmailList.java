package com.netsuite.suitetalk.proxy.v2018_1.lists.marketing;

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

public class CampaignEmailList implements Serializable {
   private CampaignEmail[] campaignEmail;
   private boolean replaceAll;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(CampaignEmailList.class, true);

   public CampaignEmailList() {
      super();
   }

   public CampaignEmailList(CampaignEmail[] campaignEmail, boolean replaceAll) {
      super();
      this.campaignEmail = campaignEmail;
      this.replaceAll = replaceAll;
   }

   public CampaignEmail[] getCampaignEmail() {
      return this.campaignEmail;
   }

   public void setCampaignEmail(CampaignEmail[] campaignEmail) {
      this.campaignEmail = campaignEmail;
   }

   public CampaignEmail getCampaignEmail(int i) {
      return this.campaignEmail[i];
   }

   public void setCampaignEmail(int i, CampaignEmail _value) {
      this.campaignEmail[i] = _value;
   }

   public boolean isReplaceAll() {
      return this.replaceAll;
   }

   public void setReplaceAll(boolean replaceAll) {
      this.replaceAll = replaceAll;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof CampaignEmailList)) {
         return false;
      } else {
         CampaignEmailList other = (CampaignEmailList)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = (this.campaignEmail == null && other.getCampaignEmail() == null || this.campaignEmail != null && Arrays.equals(this.campaignEmail, other.getCampaignEmail())) && this.replaceAll == other.isReplaceAll();
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
         if (this.getCampaignEmail() != null) {
            for(int i = 0; i < Array.getLength(this.getCampaignEmail()); ++i) {
               Object obj = Array.get(this.getCampaignEmail(), i);
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
      typeDesc.setXmlType(new QName("urn:marketing_2018_1.lists.webservices.netsuite.com", "CampaignEmailList"));
      AttributeDesc attrField = new AttributeDesc();
      attrField.setFieldName("replaceAll");
      attrField.setXmlName(new QName("", "replaceAll"));
      attrField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
      typeDesc.addFieldDesc(attrField);
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("campaignEmail");
      elemField.setXmlName(new QName("urn:marketing_2018_1.lists.webservices.netsuite.com", "campaignEmail"));
      elemField.setXmlType(new QName("urn:marketing_2018_1.lists.webservices.netsuite.com", "CampaignEmail"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      elemField.setMaxOccursUnbounded(true);
      typeDesc.addFieldDesc(elemField);
   }
}
