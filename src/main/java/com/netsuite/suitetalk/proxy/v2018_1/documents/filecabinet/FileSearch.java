package com.netsuite.suitetalk.proxy.v2018_1.documents.filecabinet;

import com.netsuite.suitetalk.proxy.v2018_1.platform.common.CustomerSearchBasic;
import com.netsuite.suitetalk.proxy.v2018_1.platform.common.EmployeeSearchBasic;
import com.netsuite.suitetalk.proxy.v2018_1.platform.common.FileSearchBasic;
import com.netsuite.suitetalk.proxy.v2018_1.platform.core.SearchRecord;
import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class FileSearch extends SearchRecord implements Serializable {
   private FileSearchBasic basic;
   private CustomerSearchBasic shopperJoin;
   private EmployeeSearchBasic userJoin;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(FileSearch.class, true);

   public FileSearch() {
      super();
   }

   public FileSearch(FileSearchBasic basic, CustomerSearchBasic shopperJoin, EmployeeSearchBasic userJoin) {
      super();
      this.basic = basic;
      this.shopperJoin = shopperJoin;
      this.userJoin = userJoin;
   }

   public FileSearchBasic getBasic() {
      return this.basic;
   }

   public void setBasic(FileSearchBasic basic) {
      this.basic = basic;
   }

   public CustomerSearchBasic getShopperJoin() {
      return this.shopperJoin;
   }

   public void setShopperJoin(CustomerSearchBasic shopperJoin) {
      this.shopperJoin = shopperJoin;
   }

   public EmployeeSearchBasic getUserJoin() {
      return this.userJoin;
   }

   public void setUserJoin(EmployeeSearchBasic userJoin) {
      this.userJoin = userJoin;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof FileSearch)) {
         return false;
      } else {
         FileSearch other = (FileSearch)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = super.equals(obj) && (this.basic == null && other.getBasic() == null || this.basic != null && this.basic.equals(other.getBasic())) && (this.shopperJoin == null && other.getShopperJoin() == null || this.shopperJoin != null && this.shopperJoin.equals(other.getShopperJoin())) && (this.userJoin == null && other.getUserJoin() == null || this.userJoin != null && this.userJoin.equals(other.getUserJoin()));
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

         if (this.getShopperJoin() != null) {
            _hashCode += this.getShopperJoin().hashCode();
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
      typeDesc.setXmlType(new QName("urn:filecabinet_2018_1.documents.webservices.netsuite.com", "FileSearch"));
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("basic");
      elemField.setXmlName(new QName("urn:filecabinet_2018_1.documents.webservices.netsuite.com", "basic"));
      elemField.setXmlType(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "FileSearchBasic"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("shopperJoin");
      elemField.setXmlName(new QName("urn:filecabinet_2018_1.documents.webservices.netsuite.com", "shopperJoin"));
      elemField.setXmlType(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "CustomerSearchBasic"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("userJoin");
      elemField.setXmlName(new QName("urn:filecabinet_2018_1.documents.webservices.netsuite.com", "userJoin"));
      elemField.setXmlType(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "EmployeeSearchBasic"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
   }
}
