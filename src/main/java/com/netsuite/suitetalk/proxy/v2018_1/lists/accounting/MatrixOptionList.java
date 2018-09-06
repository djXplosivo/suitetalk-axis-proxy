package com.netsuite.suitetalk.proxy.v2018_1.lists.accounting;

import com.netsuite.suitetalk.proxy.v2018_1.platform.core.SelectCustomFieldRef;
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

public class MatrixOptionList implements Serializable {
   private SelectCustomFieldRef[] matrixOption;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(MatrixOptionList.class, true);

   public MatrixOptionList() {
      super();
   }

   public MatrixOptionList(SelectCustomFieldRef[] matrixOption) {
      super();
      this.matrixOption = matrixOption;
   }

   public SelectCustomFieldRef[] getMatrixOption() {
      return this.matrixOption;
   }

   public void setMatrixOption(SelectCustomFieldRef[] matrixOption) {
      this.matrixOption = matrixOption;
   }

   public SelectCustomFieldRef getMatrixOption(int i) {
      return this.matrixOption[i];
   }

   public void setMatrixOption(int i, SelectCustomFieldRef _value) {
      this.matrixOption[i] = _value;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof MatrixOptionList)) {
         return false;
      } else {
         MatrixOptionList other = (MatrixOptionList)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = this.matrixOption == null && other.getMatrixOption() == null || this.matrixOption != null && Arrays.equals(this.matrixOption, other.getMatrixOption());
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
         if (this.getMatrixOption() != null) {
            for(int i = 0; i < Array.getLength(this.getMatrixOption()); ++i) {
               Object obj = Array.get(this.getMatrixOption(), i);
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
      typeDesc.setXmlType(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "MatrixOptionList"));
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("matrixOption");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "matrixOption"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SelectCustomFieldRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      elemField.setMaxOccursUnbounded(true);
      typeDesc.addFieldDesc(elemField);
   }
}
