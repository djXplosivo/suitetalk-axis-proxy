package com.netsuite.suitetalk.proxy.v2018_1.transactions.sales;

import com.netsuite.suitetalk.proxy.v2018_1.platform.core.NullField;
import com.netsuite.suitetalk.proxy.v2018_1.platform.core.Record;
import com.netsuite.suitetalk.proxy.v2018_1.platform.core.RecordRef;
import java.io.Serializable;
import java.util.Calendar;
import javax.xml.namespace.QName;
import org.apache.axis.description.AttributeDesc;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class Usage extends Record implements Serializable {
   private RecordRef customForm;
   private String memo;
   private RecordRef item;
   private RecordRef subscriptionPlan;
   private RecordRef customer;
   private RecordRef usageSubscription;
   private RecordRef usageSubscriptionLine;
   private Double usageQuantity;
   private Calendar usageDate;
   private String internalId;
   private String externalId;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(Usage.class, true);

   public Usage() {
      super();
   }

   public Usage(NullField nullFieldList, String internalId, String externalId, RecordRef customForm, String memo, RecordRef item, RecordRef subscriptionPlan, RecordRef customer, RecordRef usageSubscription, RecordRef usageSubscriptionLine, Double usageQuantity, Calendar usageDate) {
      super(nullFieldList);
      this.internalId = internalId;
      this.externalId = externalId;
      this.customForm = customForm;
      this.memo = memo;
      this.item = item;
      this.subscriptionPlan = subscriptionPlan;
      this.customer = customer;
      this.usageSubscription = usageSubscription;
      this.usageSubscriptionLine = usageSubscriptionLine;
      this.usageQuantity = usageQuantity;
      this.usageDate = usageDate;
   }

   public RecordRef getCustomForm() {
      return this.customForm;
   }

   public void setCustomForm(RecordRef customForm) {
      this.customForm = customForm;
   }

   public String getMemo() {
      return this.memo;
   }

   public void setMemo(String memo) {
      this.memo = memo;
   }

   public RecordRef getItem() {
      return this.item;
   }

   public void setItem(RecordRef item) {
      this.item = item;
   }

   public RecordRef getSubscriptionPlan() {
      return this.subscriptionPlan;
   }

   public void setSubscriptionPlan(RecordRef subscriptionPlan) {
      this.subscriptionPlan = subscriptionPlan;
   }

   public RecordRef getCustomer() {
      return this.customer;
   }

   public void setCustomer(RecordRef customer) {
      this.customer = customer;
   }

   public RecordRef getUsageSubscription() {
      return this.usageSubscription;
   }

   public void setUsageSubscription(RecordRef usageSubscription) {
      this.usageSubscription = usageSubscription;
   }

   public RecordRef getUsageSubscriptionLine() {
      return this.usageSubscriptionLine;
   }

   public void setUsageSubscriptionLine(RecordRef usageSubscriptionLine) {
      this.usageSubscriptionLine = usageSubscriptionLine;
   }

   public Double getUsageQuantity() {
      return this.usageQuantity;
   }

   public void setUsageQuantity(Double usageQuantity) {
      this.usageQuantity = usageQuantity;
   }

   public Calendar getUsageDate() {
      return this.usageDate;
   }

   public void setUsageDate(Calendar usageDate) {
      this.usageDate = usageDate;
   }

   public String getInternalId() {
      return this.internalId;
   }

   public void setInternalId(String internalId) {
      this.internalId = internalId;
   }

   public String getExternalId() {
      return this.externalId;
   }

   public void setExternalId(String externalId) {
      this.externalId = externalId;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof Usage)) {
         return false;
      } else {
         Usage other = (Usage)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = super.equals(obj) && (this.customForm == null && other.getCustomForm() == null || this.customForm != null && this.customForm.equals(other.getCustomForm())) && (this.memo == null && other.getMemo() == null || this.memo != null && this.memo.equals(other.getMemo())) && (this.item == null && other.getItem() == null || this.item != null && this.item.equals(other.getItem())) && (this.subscriptionPlan == null && other.getSubscriptionPlan() == null || this.subscriptionPlan != null && this.subscriptionPlan.equals(other.getSubscriptionPlan())) && (this.customer == null && other.getCustomer() == null || this.customer != null && this.customer.equals(other.getCustomer())) && (this.usageSubscription == null && other.getUsageSubscription() == null || this.usageSubscription != null && this.usageSubscription.equals(other.getUsageSubscription())) && (this.usageSubscriptionLine == null && other.getUsageSubscriptionLine() == null || this.usageSubscriptionLine != null && this.usageSubscriptionLine.equals(other.getUsageSubscriptionLine())) && (this.usageQuantity == null && other.getUsageQuantity() == null || this.usageQuantity != null && this.usageQuantity.equals(other.getUsageQuantity())) && (this.usageDate == null && other.getUsageDate() == null || this.usageDate != null && this.usageDate.equals(other.getUsageDate())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && this.internalId.equals(other.getInternalId())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && this.externalId.equals(other.getExternalId()));
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
         if (this.getCustomForm() != null) {
            _hashCode += this.getCustomForm().hashCode();
         }

         if (this.getMemo() != null) {
            _hashCode += this.getMemo().hashCode();
         }

         if (this.getItem() != null) {
            _hashCode += this.getItem().hashCode();
         }

         if (this.getSubscriptionPlan() != null) {
            _hashCode += this.getSubscriptionPlan().hashCode();
         }

         if (this.getCustomer() != null) {
            _hashCode += this.getCustomer().hashCode();
         }

         if (this.getUsageSubscription() != null) {
            _hashCode += this.getUsageSubscription().hashCode();
         }

         if (this.getUsageSubscriptionLine() != null) {
            _hashCode += this.getUsageSubscriptionLine().hashCode();
         }

         if (this.getUsageQuantity() != null) {
            _hashCode += this.getUsageQuantity().hashCode();
         }

         if (this.getUsageDate() != null) {
            _hashCode += this.getUsageDate().hashCode();
         }

         if (this.getInternalId() != null) {
            _hashCode += this.getInternalId().hashCode();
         }

         if (this.getExternalId() != null) {
            _hashCode += this.getExternalId().hashCode();
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
      typeDesc.setXmlType(new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "Usage"));
      AttributeDesc attrField = new AttributeDesc();
      attrField.setFieldName("internalId");
      attrField.setXmlName(new QName("", "internalId"));
      attrField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
      typeDesc.addFieldDesc(attrField);
      attrField = new AttributeDesc();
      attrField.setFieldName("externalId");
      attrField.setXmlName(new QName("", "externalId"));
      attrField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
      typeDesc.addFieldDesc(attrField);
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("customForm");
      elemField.setXmlName(new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "customForm"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("memo");
      elemField.setXmlName(new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "memo"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("item");
      elemField.setXmlName(new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "item"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("subscriptionPlan");
      elemField.setXmlName(new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "subscriptionPlan"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("customer");
      elemField.setXmlName(new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "customer"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("usageSubscription");
      elemField.setXmlName(new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "usageSubscription"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("usageSubscriptionLine");
      elemField.setXmlName(new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "usageSubscriptionLine"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("usageQuantity");
      elemField.setXmlName(new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "usageQuantity"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("usageDate");
      elemField.setXmlName(new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "usageDate"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
   }
}
