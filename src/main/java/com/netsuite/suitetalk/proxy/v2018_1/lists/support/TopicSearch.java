package com.netsuite.suitetalk.proxy.v2018_1.lists.support;

import com.netsuite.suitetalk.proxy.v2018_1.platform.common.EmployeeSearchBasic;
import com.netsuite.suitetalk.proxy.v2018_1.platform.common.SolutionSearchBasic;
import com.netsuite.suitetalk.proxy.v2018_1.platform.common.TopicSearchBasic;
import com.netsuite.suitetalk.proxy.v2018_1.platform.core.SearchRecord;
import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class TopicSearch extends SearchRecord implements Serializable {
   private TopicSearchBasic basic;
   private SolutionSearchBasic solutionJoin;
   private EmployeeSearchBasic userJoin;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(TopicSearch.class, true);

   public TopicSearch() {
      super();
   }

   public TopicSearch(TopicSearchBasic basic, SolutionSearchBasic solutionJoin, EmployeeSearchBasic userJoin) {
      super();
      this.basic = basic;
      this.solutionJoin = solutionJoin;
      this.userJoin = userJoin;
   }

   public TopicSearchBasic getBasic() {
      return this.basic;
   }

   public void setBasic(TopicSearchBasic basic) {
      this.basic = basic;
   }

   public SolutionSearchBasic getSolutionJoin() {
      return this.solutionJoin;
   }

   public void setSolutionJoin(SolutionSearchBasic solutionJoin) {
      this.solutionJoin = solutionJoin;
   }

   public EmployeeSearchBasic getUserJoin() {
      return this.userJoin;
   }

   public void setUserJoin(EmployeeSearchBasic userJoin) {
      this.userJoin = userJoin;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof TopicSearch)) {
         return false;
      } else {
         TopicSearch other = (TopicSearch)obj;
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
      typeDesc.setXmlType(new QName("urn:support_2018_1.lists.webservices.netsuite.com", "TopicSearch"));
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("basic");
      elemField.setXmlName(new QName("urn:support_2018_1.lists.webservices.netsuite.com", "basic"));
      elemField.setXmlType(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "TopicSearchBasic"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("solutionJoin");
      elemField.setXmlName(new QName("urn:support_2018_1.lists.webservices.netsuite.com", "solutionJoin"));
      elemField.setXmlType(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "SolutionSearchBasic"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("userJoin");
      elemField.setXmlName(new QName("urn:support_2018_1.lists.webservices.netsuite.com", "userJoin"));
      elemField.setXmlType(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "EmployeeSearchBasic"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
   }
}
