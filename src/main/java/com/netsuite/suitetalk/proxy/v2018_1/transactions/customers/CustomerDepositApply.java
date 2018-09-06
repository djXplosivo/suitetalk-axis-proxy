package com.netsuite.suitetalk.proxy.v2018_1.transactions.customers;

import java.io.Serializable;
import java.util.Calendar;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class CustomerDepositApply implements Serializable {
   private Long doc;
   private Long line;
   private Boolean apply;
   private Calendar applyDate;
   private String type;
   private String refNum;
   private Double total;
   private Double amount;
   private String job;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(CustomerDepositApply.class, true);

   public CustomerDepositApply() {
      super();
   }

   public CustomerDepositApply(Long doc, Long line, Boolean apply, Calendar applyDate, String type, String refNum, Double total, Double amount, String job) {
      super();
      this.doc = doc;
      this.line = line;
      this.apply = apply;
      this.applyDate = applyDate;
      this.type = type;
      this.refNum = refNum;
      this.total = total;
      this.amount = amount;
      this.job = job;
   }

   public Long getDoc() {
      return this.doc;
   }

   public void setDoc(Long doc) {
      this.doc = doc;
   }

   public Long getLine() {
      return this.line;
   }

   public void setLine(Long line) {
      this.line = line;
   }

   public Boolean getApply() {
      return this.apply;
   }

   public void setApply(Boolean apply) {
      this.apply = apply;
   }

   public Calendar getApplyDate() {
      return this.applyDate;
   }

   public void setApplyDate(Calendar applyDate) {
      this.applyDate = applyDate;
   }

   public String getType() {
      return this.type;
   }

   public void setType(String type) {
      this.type = type;
   }

   public String getRefNum() {
      return this.refNum;
   }

   public void setRefNum(String refNum) {
      this.refNum = refNum;
   }

   public Double getTotal() {
      return this.total;
   }

   public void setTotal(Double total) {
      this.total = total;
   }

   public Double getAmount() {
      return this.amount;
   }

   public void setAmount(Double amount) {
      this.amount = amount;
   }

   public String getJob() {
      return this.job;
   }

   public void setJob(String job) {
      this.job = job;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof CustomerDepositApply)) {
         return false;
      } else {
         CustomerDepositApply other = (CustomerDepositApply)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = (this.doc == null && other.getDoc() == null || this.doc != null && this.doc.equals(other.getDoc())) && (this.line == null && other.getLine() == null || this.line != null && this.line.equals(other.getLine())) && (this.apply == null && other.getApply() == null || this.apply != null && this.apply.equals(other.getApply())) && (this.applyDate == null && other.getApplyDate() == null || this.applyDate != null && this.applyDate.equals(other.getApplyDate())) && (this.type == null && other.getType() == null || this.type != null && this.type.equals(other.getType())) && (this.refNum == null && other.getRefNum() == null || this.refNum != null && this.refNum.equals(other.getRefNum())) && (this.total == null && other.getTotal() == null || this.total != null && this.total.equals(other.getTotal())) && (this.amount == null && other.getAmount() == null || this.amount != null && this.amount.equals(other.getAmount())) && (this.job == null && other.getJob() == null || this.job != null && this.job.equals(other.getJob()));
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
         if (this.getDoc() != null) {
            _hashCode += this.getDoc().hashCode();
         }

         if (this.getLine() != null) {
            _hashCode += this.getLine().hashCode();
         }

         if (this.getApply() != null) {
            _hashCode += this.getApply().hashCode();
         }

         if (this.getApplyDate() != null) {
            _hashCode += this.getApplyDate().hashCode();
         }

         if (this.getType() != null) {
            _hashCode += this.getType().hashCode();
         }

         if (this.getRefNum() != null) {
            _hashCode += this.getRefNum().hashCode();
         }

         if (this.getTotal() != null) {
            _hashCode += this.getTotal().hashCode();
         }

         if (this.getAmount() != null) {
            _hashCode += this.getAmount().hashCode();
         }

         if (this.getJob() != null) {
            _hashCode += this.getJob().hashCode();
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
      typeDesc.setXmlType(new QName("urn:customers_2018_1.transactions.webservices.netsuite.com", "CustomerDepositApply"));
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("doc");
      elemField.setXmlName(new QName("urn:customers_2018_1.transactions.webservices.netsuite.com", "doc"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "long"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("line");
      elemField.setXmlName(new QName("urn:customers_2018_1.transactions.webservices.netsuite.com", "line"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "long"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("apply");
      elemField.setXmlName(new QName("urn:customers_2018_1.transactions.webservices.netsuite.com", "apply"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("applyDate");
      elemField.setXmlName(new QName("urn:customers_2018_1.transactions.webservices.netsuite.com", "applyDate"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("type");
      elemField.setXmlName(new QName("urn:customers_2018_1.transactions.webservices.netsuite.com", "type"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("refNum");
      elemField.setXmlName(new QName("urn:customers_2018_1.transactions.webservices.netsuite.com", "refNum"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("total");
      elemField.setXmlName(new QName("urn:customers_2018_1.transactions.webservices.netsuite.com", "total"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("amount");
      elemField.setXmlName(new QName("urn:customers_2018_1.transactions.webservices.netsuite.com", "amount"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("job");
      elemField.setXmlName(new QName("urn:customers_2018_1.transactions.webservices.netsuite.com", "job"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
   }
}
