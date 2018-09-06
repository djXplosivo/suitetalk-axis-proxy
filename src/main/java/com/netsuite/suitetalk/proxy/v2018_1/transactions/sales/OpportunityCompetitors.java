package com.netsuite.suitetalk.proxy.v2018_1.transactions.sales;

import com.netsuite.suitetalk.proxy.v2018_1.platform.core.RecordRef;
import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class OpportunityCompetitors implements Serializable {
   private RecordRef competitor;
   private String url;
   private String notes;
   private String strategy;
   private Boolean winner;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(OpportunityCompetitors.class, true);

   public OpportunityCompetitors() {
      super();
   }

   public OpportunityCompetitors(RecordRef competitor, String url, String notes, String strategy, Boolean winner) {
      super();
      this.competitor = competitor;
      this.url = url;
      this.notes = notes;
      this.strategy = strategy;
      this.winner = winner;
   }

   public RecordRef getCompetitor() {
      return this.competitor;
   }

   public void setCompetitor(RecordRef competitor) {
      this.competitor = competitor;
   }

   public String getUrl() {
      return this.url;
   }

   public void setUrl(String url) {
      this.url = url;
   }

   public String getNotes() {
      return this.notes;
   }

   public void setNotes(String notes) {
      this.notes = notes;
   }

   public String getStrategy() {
      return this.strategy;
   }

   public void setStrategy(String strategy) {
      this.strategy = strategy;
   }

   public Boolean getWinner() {
      return this.winner;
   }

   public void setWinner(Boolean winner) {
      this.winner = winner;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof OpportunityCompetitors)) {
         return false;
      } else {
         OpportunityCompetitors other = (OpportunityCompetitors)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = (this.competitor == null && other.getCompetitor() == null || this.competitor != null && this.competitor.equals(other.getCompetitor())) && (this.url == null && other.getUrl() == null || this.url != null && this.url.equals(other.getUrl())) && (this.notes == null && other.getNotes() == null || this.notes != null && this.notes.equals(other.getNotes())) && (this.strategy == null && other.getStrategy() == null || this.strategy != null && this.strategy.equals(other.getStrategy())) && (this.winner == null && other.getWinner() == null || this.winner != null && this.winner.equals(other.getWinner()));
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
         if (this.getCompetitor() != null) {
            _hashCode += this.getCompetitor().hashCode();
         }

         if (this.getUrl() != null) {
            _hashCode += this.getUrl().hashCode();
         }

         if (this.getNotes() != null) {
            _hashCode += this.getNotes().hashCode();
         }

         if (this.getStrategy() != null) {
            _hashCode += this.getStrategy().hashCode();
         }

         if (this.getWinner() != null) {
            _hashCode += this.getWinner().hashCode();
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
      typeDesc.setXmlType(new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "OpportunityCompetitors"));
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("competitor");
      elemField.setXmlName(new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "competitor"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("url");
      elemField.setXmlName(new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "url"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("notes");
      elemField.setXmlName(new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "notes"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("strategy");
      elemField.setXmlName(new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "strategy"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("winner");
      elemField.setXmlName(new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "winner"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
   }
}
