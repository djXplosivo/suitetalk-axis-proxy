package com.netsuite.suitetalk.proxy.v2018_1.general.communication;

import com.netsuite.suitetalk.proxy.v2018_1.documents.filecabinet.File;
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

public class MessageMediaItemList implements Serializable {
   private File[] mediaItem;
   private boolean replaceAll;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(MessageMediaItemList.class, true);

   public MessageMediaItemList() {
      super();
   }

   public MessageMediaItemList(File[] mediaItem, boolean replaceAll) {
      super();
      this.mediaItem = mediaItem;
      this.replaceAll = replaceAll;
   }

   public File[] getMediaItem() {
      return this.mediaItem;
   }

   public void setMediaItem(File[] mediaItem) {
      this.mediaItem = mediaItem;
   }

   public File getMediaItem(int i) {
      return this.mediaItem[i];
   }

   public void setMediaItem(int i, File _value) {
      this.mediaItem[i] = _value;
   }

   public boolean isReplaceAll() {
      return this.replaceAll;
   }

   public void setReplaceAll(boolean replaceAll) {
      this.replaceAll = replaceAll;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof MessageMediaItemList)) {
         return false;
      } else {
         MessageMediaItemList other = (MessageMediaItemList)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = (this.mediaItem == null && other.getMediaItem() == null || this.mediaItem != null && Arrays.equals(this.mediaItem, other.getMediaItem())) && this.replaceAll == other.isReplaceAll();
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
         if (this.getMediaItem() != null) {
            for(int i = 0; i < Array.getLength(this.getMediaItem()); ++i) {
               Object obj = Array.get(this.getMediaItem(), i);
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
      typeDesc.setXmlType(new QName("urn:communication_2018_1.general.webservices.netsuite.com", "MessageMediaItemList"));
      AttributeDesc attrField = new AttributeDesc();
      attrField.setFieldName("replaceAll");
      attrField.setXmlName(new QName("", "replaceAll"));
      attrField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
      typeDesc.addFieldDesc(attrField);
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("mediaItem");
      elemField.setXmlName(new QName("urn:communication_2018_1.general.webservices.netsuite.com", "mediaItem"));
      elemField.setXmlType(new QName("urn:filecabinet_2018_1.documents.webservices.netsuite.com", "File"));
      elemField.setNillable(false);
      elemField.setMaxOccursUnbounded(true);
      typeDesc.addFieldDesc(elemField);
   }
}
