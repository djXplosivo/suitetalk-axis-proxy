package com.netsuite.suitetalk.proxy.v2018_1.setup.customization;

import com.netsuite.suitetalk.proxy.v2018_1.platform.core.RecordRef;
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

public class FldFilterSelList implements Serializable {
   private RecordRef[] fldFilterSel;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(FldFilterSelList.class, true);

   public FldFilterSelList() {
      super();
   }

   public FldFilterSelList(RecordRef[] fldFilterSel) {
      super();
      this.fldFilterSel = fldFilterSel;
   }

   public RecordRef[] getFldFilterSel() {
      return this.fldFilterSel;
   }

   public void setFldFilterSel(RecordRef[] fldFilterSel) {
      this.fldFilterSel = fldFilterSel;
   }

   public RecordRef getFldFilterSel(int i) {
      return this.fldFilterSel[i];
   }

   public void setFldFilterSel(int i, RecordRef _value) {
      this.fldFilterSel[i] = _value;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof FldFilterSelList)) {
         return false;
      } else {
         FldFilterSelList other = (FldFilterSelList)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = this.fldFilterSel == null && other.getFldFilterSel() == null || this.fldFilterSel != null && Arrays.equals(this.fldFilterSel, other.getFldFilterSel());
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
         if (this.getFldFilterSel() != null) {
            for(int i = 0; i < Array.getLength(this.getFldFilterSel()); ++i) {
               Object obj = Array.get(this.getFldFilterSel(), i);
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
      typeDesc.setXmlType(new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "FldFilterSelList"));
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("fldFilterSel");
      elemField.setXmlName(new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "fldFilterSel"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setNillable(false);
      elemField.setMaxOccursUnbounded(true);
      typeDesc.addFieldDesc(elemField);
   }
}
