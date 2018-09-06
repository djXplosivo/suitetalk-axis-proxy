package com.netsuite.suitetalk.proxy.v2018_1.lists.website;

import com.netsuite.suitetalk.proxy.v2018_1.platform.common.PresentationItem;
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

public class SiteCategoryPresentationItemList implements Serializable {
   private PresentationItem[] presentationItem;
   private boolean replaceAll;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(SiteCategoryPresentationItemList.class, true);

   public SiteCategoryPresentationItemList() {
      super();
   }

   public SiteCategoryPresentationItemList(PresentationItem[] presentationItem, boolean replaceAll) {
      super();
      this.presentationItem = presentationItem;
      this.replaceAll = replaceAll;
   }

   public PresentationItem[] getPresentationItem() {
      return this.presentationItem;
   }

   public void setPresentationItem(PresentationItem[] presentationItem) {
      this.presentationItem = presentationItem;
   }

   public PresentationItem getPresentationItem(int i) {
      return this.presentationItem[i];
   }

   public void setPresentationItem(int i, PresentationItem _value) {
      this.presentationItem[i] = _value;
   }

   public boolean isReplaceAll() {
      return this.replaceAll;
   }

   public void setReplaceAll(boolean replaceAll) {
      this.replaceAll = replaceAll;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof SiteCategoryPresentationItemList)) {
         return false;
      } else {
         SiteCategoryPresentationItemList other = (SiteCategoryPresentationItemList)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = (this.presentationItem == null && other.getPresentationItem() == null || this.presentationItem != null && Arrays.equals(this.presentationItem, other.getPresentationItem())) && this.replaceAll == other.isReplaceAll();
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
         if (this.getPresentationItem() != null) {
            for(int i = 0; i < Array.getLength(this.getPresentationItem()); ++i) {
               Object obj = Array.get(this.getPresentationItem(), i);
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
      typeDesc.setXmlType(new QName("urn:website_2018_1.lists.webservices.netsuite.com", "SiteCategoryPresentationItemList"));
      AttributeDesc attrField = new AttributeDesc();
      attrField.setFieldName("replaceAll");
      attrField.setXmlName(new QName("", "replaceAll"));
      attrField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
      typeDesc.addFieldDesc(attrField);
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("presentationItem");
      elemField.setXmlName(new QName("urn:website_2018_1.lists.webservices.netsuite.com", "presentationItem"));
      elemField.setXmlType(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "PresentationItem"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      elemField.setMaxOccursUnbounded(true);
      typeDesc.addFieldDesc(elemField);
   }
}
