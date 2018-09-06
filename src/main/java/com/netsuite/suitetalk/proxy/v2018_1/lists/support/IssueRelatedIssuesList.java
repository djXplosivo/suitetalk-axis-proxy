package com.netsuite.suitetalk.proxy.v2018_1.lists.support;

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

public class IssueRelatedIssuesList implements Serializable {
   private IssueRelatedIssues[] issueRelatedIssues;
   private boolean replaceAll;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(IssueRelatedIssuesList.class, true);

   public IssueRelatedIssuesList() {
      super();
   }

   public IssueRelatedIssuesList(IssueRelatedIssues[] issueRelatedIssues, boolean replaceAll) {
      super();
      this.issueRelatedIssues = issueRelatedIssues;
      this.replaceAll = replaceAll;
   }

   public IssueRelatedIssues[] getIssueRelatedIssues() {
      return this.issueRelatedIssues;
   }

   public void setIssueRelatedIssues(IssueRelatedIssues[] issueRelatedIssues) {
      this.issueRelatedIssues = issueRelatedIssues;
   }

   public IssueRelatedIssues getIssueRelatedIssues(int i) {
      return this.issueRelatedIssues[i];
   }

   public void setIssueRelatedIssues(int i, IssueRelatedIssues _value) {
      this.issueRelatedIssues[i] = _value;
   }

   public boolean isReplaceAll() {
      return this.replaceAll;
   }

   public void setReplaceAll(boolean replaceAll) {
      this.replaceAll = replaceAll;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof IssueRelatedIssuesList)) {
         return false;
      } else {
         IssueRelatedIssuesList other = (IssueRelatedIssuesList)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = (this.issueRelatedIssues == null && other.getIssueRelatedIssues() == null || this.issueRelatedIssues != null && Arrays.equals(this.issueRelatedIssues, other.getIssueRelatedIssues())) && this.replaceAll == other.isReplaceAll();
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
         if (this.getIssueRelatedIssues() != null) {
            for(int i = 0; i < Array.getLength(this.getIssueRelatedIssues()); ++i) {
               Object obj = Array.get(this.getIssueRelatedIssues(), i);
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
      typeDesc.setXmlType(new QName("urn:support_2018_1.lists.webservices.netsuite.com", "IssueRelatedIssuesList"));
      AttributeDesc attrField = new AttributeDesc();
      attrField.setFieldName("replaceAll");
      attrField.setXmlName(new QName("", "replaceAll"));
      attrField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
      typeDesc.addFieldDesc(attrField);
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("issueRelatedIssues");
      elemField.setXmlName(new QName("urn:support_2018_1.lists.webservices.netsuite.com", "issueRelatedIssues"));
      elemField.setXmlType(new QName("urn:support_2018_1.lists.webservices.netsuite.com", "IssueRelatedIssues"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      elemField.setMaxOccursUnbounded(true);
      typeDesc.addFieldDesc(elemField);
   }
}
