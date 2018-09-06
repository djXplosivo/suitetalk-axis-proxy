package com.netsuite.suitetalk.proxy.v2018_1.lists.support;

import com.netsuite.suitetalk.proxy.v2018_1.platform.common.EmployeeSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2018_1.platform.common.SolutionSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2018_1.platform.common.TopicSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2018_1.platform.core.SearchRow;
import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class TopicSearchRow extends SearchRow implements Serializable {
   private TopicSearchRowBasic basic;
   private SolutionSearchRowBasic solutionJoin;
   private EmployeeSearchRowBasic userJoin;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(TopicSearchRow.class, true);

   public TopicSearchRow() {
      super();
   }

   public TopicSearchRow(TopicSearchRowBasic basic, SolutionSearchRowBasic solutionJoin, EmployeeSearchRowBasic userJoin) {
      super();
      this.basic = basic;
      this.solutionJoin = solutionJoin;
      this.userJoin = userJoin;
   }

   public TopicSearchRowBasic getBasic() {
      return this.basic;
   }

   public void setBasic(TopicSearchRowBasic basic) {
      this.basic = basic;
   }

   public SolutionSearchRowBasic getSolutionJoin() {
      return this.solutionJoin;
   }

   public void setSolutionJoin(SolutionSearchRowBasic solutionJoin) {
      this.solutionJoin = solutionJoin;
   }

   public EmployeeSearchRowBasic getUserJoin() {
      return this.userJoin;
   }

   public void setUserJoin(EmployeeSearchRowBasic userJoin) {
      this.userJoin = userJoin;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof TopicSearchRow)) {
         return false;
      } else {
         TopicSearchRow other = (TopicSearchRow)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = super.equals(obj) && (this.basic == null && other.getBasic() == null || this.basic != null && this.basic.equals(other.getBasic())) && (this.solutionJoin == null && other.getSolutionJoin() == null || this.solutionJoin != null && this.solutionJoin.equals(other.getSolutionJoin())) && (this.userJoin == null && other.getUserJoin() == null || this.userJoin != null && this.userJoin.equals(other.getUserJoin()));
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

         if (this.getSolutionJoin() != null) {
            _hashCode += this.getSolutionJoin().hashCode();
         }

         if (this.getUserJoin() != null) {
            _hashCode += this.getUserJoin().hashCode();
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
      typeDesc.setXmlType(new QName("urn:support_2018_1.lists.webservices.netsuite.com", "TopicSearchRow"));
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("basic");
      elemField.setXmlName(new QName("urn:support_2018_1.lists.webservices.netsuite.com", "basic"));
      elemField.setXmlType(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "TopicSearchRowBasic"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("solutionJoin");
      elemField.setXmlName(new QName("urn:support_2018_1.lists.webservices.netsuite.com", "solutionJoin"));
      elemField.setXmlType(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "SolutionSearchRowBasic"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("userJoin");
      elemField.setXmlName(new QName("urn:support_2018_1.lists.webservices.netsuite.com", "userJoin"));
      elemField.setXmlType(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "EmployeeSearchRowBasic"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
   }
}
