package com.netsuite.suitetalk.proxy.v2018_1.lists.employees;

import java.io.Serializable;
import java.util.Calendar;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class EmployeeSubscriptions implements Serializable {
   private String subscribed;
   private String subscription;
   private Calendar lastModifiedDate;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(EmployeeSubscriptions.class, true);

   public EmployeeSubscriptions() {
      super();
   }

   public EmployeeSubscriptions(String subscribed, String subscription, Calendar lastModifiedDate) {
      super();
      this.subscribed = subscribed;
      this.subscription = subscription;
      this.lastModifiedDate = lastModifiedDate;
   }

   public String getSubscribed() {
      return this.subscribed;
   }

   public void setSubscribed(String subscribed) {
      this.subscribed = subscribed;
   }

   public String getSubscription() {
      return this.subscription;
   }

   public void setSubscription(String subscription) {
      this.subscription = subscription;
   }

   public Calendar getLastModifiedDate() {
      return this.lastModifiedDate;
   }

   public void setLastModifiedDate(Calendar lastModifiedDate) {
      this.lastModifiedDate = lastModifiedDate;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof EmployeeSubscriptions)) {
         return false;
      } else {
         EmployeeSubscriptions other = (EmployeeSubscriptions)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = (this.subscribed == null && other.getSubscribed() == null || this.subscribed != null && this.subscribed.equals(other.getSubscribed())) && (this.subscription == null && other.getSubscription() == null || this.subscription != null && this.subscription.equals(other.getSubscription())) && (this.lastModifiedDate == null && other.getLastModifiedDate() == null || this.lastModifiedDate != null && this.lastModifiedDate.equals(other.getLastModifiedDate()));
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
         if (this.getSubscribed() != null) {
            _hashCode += this.getSubscribed().hashCode();
         }

         if (this.getSubscription() != null) {
            _hashCode += this.getSubscription().hashCode();
         }

         if (this.getLastModifiedDate() != null) {
            _hashCode += this.getLastModifiedDate().hashCode();
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
      typeDesc.setXmlType(new QName("urn:employees_2018_1.lists.webservices.netsuite.com", "EmployeeSubscriptions"));
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("subscribed");
      elemField.setXmlName(new QName("urn:employees_2018_1.lists.webservices.netsuite.com", "subscribed"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("subscription");
      elemField.setXmlName(new QName("urn:employees_2018_1.lists.webservices.netsuite.com", "subscription"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("lastModifiedDate");
      elemField.setXmlName(new QName("urn:employees_2018_1.lists.webservices.netsuite.com", "lastModifiedDate"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
   }
}
