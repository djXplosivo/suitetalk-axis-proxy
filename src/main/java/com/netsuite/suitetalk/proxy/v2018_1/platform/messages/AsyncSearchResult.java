package com.netsuite.suitetalk.proxy.v2018_1.platform.messages;

import com.netsuite.suitetalk.proxy.v2018_1.platform.core.SearchResult;
import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class AsyncSearchResult extends AsyncResult implements Serializable {
   private SearchResult searchResult;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(AsyncSearchResult.class, true);

   public AsyncSearchResult() {
      super();
   }

   public AsyncSearchResult(SearchResult searchResult) {
      super();
      this.searchResult = searchResult;
   }

   public SearchResult getSearchResult() {
      return this.searchResult;
   }

   public void setSearchResult(SearchResult searchResult) {
      this.searchResult = searchResult;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof AsyncSearchResult)) {
         return false;
      } else {
         AsyncSearchResult other = (AsyncSearchResult)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = super.equals(obj) && (this.searchResult == null && other.getSearchResult() == null || this.searchResult != null && this.searchResult.equals(other.getSearchResult()));
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
         if (this.getSearchResult() != null) {
            _hashCode += this.getSearchResult().hashCode();
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
      typeDesc.setXmlType(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "AsyncSearchResult"));
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("searchResult");
      elemField.setXmlName(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "searchResult"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchResult"));
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
   }
}
