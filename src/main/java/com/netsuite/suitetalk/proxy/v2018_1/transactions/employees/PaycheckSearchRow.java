package com.netsuite.suitetalk.proxy.v2018_1.transactions.employees;

import com.netsuite.suitetalk.proxy.v2018_1.platform.common.EmployeeSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2018_1.platform.common.PaycheckSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2018_1.platform.common.PayrollItemSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2018_1.platform.core.SearchRow;
import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class PaycheckSearchRow extends SearchRow implements Serializable {
   private PaycheckSearchRowBasic basic;
   private EmployeeSearchRowBasic employeeJoin;
   private PayrollItemSearchRowBasic payrollItemJoin;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(PaycheckSearchRow.class, true);

   public PaycheckSearchRow() {
      super();
   }

   public PaycheckSearchRow(PaycheckSearchRowBasic basic, EmployeeSearchRowBasic employeeJoin, PayrollItemSearchRowBasic payrollItemJoin) {
      super();
      this.basic = basic;
      this.employeeJoin = employeeJoin;
      this.payrollItemJoin = payrollItemJoin;
   }

   public PaycheckSearchRowBasic getBasic() {
      return this.basic;
   }

   public void setBasic(PaycheckSearchRowBasic basic) {
      this.basic = basic;
   }

   public EmployeeSearchRowBasic getEmployeeJoin() {
      return this.employeeJoin;
   }

   public void setEmployeeJoin(EmployeeSearchRowBasic employeeJoin) {
      this.employeeJoin = employeeJoin;
   }

   public PayrollItemSearchRowBasic getPayrollItemJoin() {
      return this.payrollItemJoin;
   }

   public void setPayrollItemJoin(PayrollItemSearchRowBasic payrollItemJoin) {
      this.payrollItemJoin = payrollItemJoin;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof PaycheckSearchRow)) {
         return false;
      } else {
         PaycheckSearchRow other = (PaycheckSearchRow)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = super.equals(obj) && (this.basic == null && other.getBasic() == null || this.basic != null && this.basic.equals(other.getBasic())) && (this.employeeJoin == null && other.getEmployeeJoin() == null || this.employeeJoin != null && this.employeeJoin.equals(other.getEmployeeJoin())) && (this.payrollItemJoin == null && other.getPayrollItemJoin() == null || this.payrollItemJoin != null && this.payrollItemJoin.equals(other.getPayrollItemJoin()));
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

         if (this.getEmployeeJoin() != null) {
            _hashCode += this.getEmployeeJoin().hashCode();
         }

         if (this.getPayrollItemJoin() != null) {
            _hashCode += this.getPayrollItemJoin().hashCode();
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
      typeDesc.setXmlType(new QName("urn:employees_2018_1.transactions.webservices.netsuite.com", "PaycheckSearchRow"));
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("basic");
      elemField.setXmlName(new QName("urn:employees_2018_1.transactions.webservices.netsuite.com", "basic"));
      elemField.setXmlType(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "PaycheckSearchRowBasic"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("employeeJoin");
      elemField.setXmlName(new QName("urn:employees_2018_1.transactions.webservices.netsuite.com", "employeeJoin"));
      elemField.setXmlType(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "EmployeeSearchRowBasic"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("payrollItemJoin");
      elemField.setXmlName(new QName("urn:employees_2018_1.transactions.webservices.netsuite.com", "payrollItemJoin"));
      elemField.setXmlType(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "PayrollItemSearchRowBasic"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
   }
}
