package com.netsuite.suitetalk.proxy.v2018_1.lists.relationships;

import com.netsuite.suitetalk.proxy.v2018_1.platform.common.BillingAccountSearchBasic;
import com.netsuite.suitetalk.proxy.v2018_1.platform.common.CustomSearchJoin;
import com.netsuite.suitetalk.proxy.v2018_1.platform.common.JobSearchBasic;
import com.netsuite.suitetalk.proxy.v2018_1.platform.core.SearchRecord;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Arrays;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class BillingAccountSearch extends SearchRecord implements Serializable {
   private BillingAccountSearchBasic basic;
   private JobSearchBasic jobJoin;
   private CustomSearchJoin[] customSearchJoin;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(BillingAccountSearch.class, true);

   public BillingAccountSearch() {
      super();
   }

   public BillingAccountSearch(BillingAccountSearchBasic basic, JobSearchBasic jobJoin, CustomSearchJoin[] customSearchJoin) {
      super();
      this.basic = basic;
      this.jobJoin = jobJoin;
      this.customSearchJoin = customSearchJoin;
   }

   public BillingAccountSearchBasic getBasic() {
      return this.basic;
   }

   public void setBasic(BillingAccountSearchBasic basic) {
      this.basic = basic;
   }

   public JobSearchBasic getJobJoin() {
      return this.jobJoin;
   }

   public void setJobJoin(JobSearchBasic jobJoin) {
      this.jobJoin = jobJoin;
   }

   public CustomSearchJoin[] getCustomSearchJoin() {
      return this.customSearchJoin;
   }

   public void setCustomSearchJoin(CustomSearchJoin[] customSearchJoin) {
      this.customSearchJoin = customSearchJoin;
   }

   public CustomSearchJoin getCustomSearchJoin(int i) {
      return this.customSearchJoin[i];
   }

   public void setCustomSearchJoin(int i, CustomSearchJoin _value) {
      this.customSearchJoin[i] = _value;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof BillingAccountSearch)) {
         return false;
      } else {
         BillingAccountSearch other = (BillingAccountSearch)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = super.equals(obj) && (this.basic == null && other.getBasic() == null || this.basic != null && this.basic.equals(other.getBasic())) && (this.jobJoin == null && other.getJobJoin() == null || this.jobJoin != null && this.jobJoin.equals(other.getJobJoin())) && (this.customSearchJoin == null && other.getCustomSearchJoin() == null || this.customSearchJoin != null && Arrays.equals(this.customSearchJoin, other.getCustomSearchJoin()));
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

         if (this.getJobJoin() != null) {
            _hashCode += this.getJobJoin().hashCode();
         }

         if (this.getCustomSearchJoin() != null) {
            for(int i = 0; i < Array.getLength(this.getCustomSearchJoin()); ++i) {
               Object obj = Array.get(this.getCustomSearchJoin(), i);
               if (obj != null && !obj.getClass().isArray()) {
                  _hashCode += obj.hashCode();
               }
            }
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
      typeDesc.setXmlType(new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "BillingAccountSearch"));
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("basic");
      elemField.setXmlName(new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "basic"));
      elemField.setXmlType(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "BillingAccountSearchBasic"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("jobJoin");
      elemField.setXmlName(new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "jobJoin"));
      elemField.setXmlType(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "JobSearchBasic"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("customSearchJoin");
      elemField.setXmlName(new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "customSearchJoin"));
      elemField.setXmlType(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "CustomSearchJoin"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      elemField.setMaxOccursUnbounded(true);
      typeDesc.addFieldDesc(elemField);
   }
}
