package com.netsuite.suitetalk.proxy.v2018_1.core.types;

import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.EnumDeserializer;
import org.apache.axis.encoding.ser.EnumSerializer;

import javax.xml.namespace.QName;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.HashMap;

public class CalendarEventAttendeeResponse implements Serializable {
    private String _value_;
    private static HashMap _table_ = new HashMap();
    public static final String __accepted = "_accepted";
    public static final String __declined = "_declined";
    public static final String __noResponse = "_noResponse";
    public static final String __tentative = "_tentative";
    public static final CalendarEventAttendeeResponse _accepted = new CalendarEventAttendeeResponse("_accepted");
    public static final CalendarEventAttendeeResponse _declined = new CalendarEventAttendeeResponse("_declined");
    public static final CalendarEventAttendeeResponse _noResponse = new CalendarEventAttendeeResponse("_noResponse");
    public static final CalendarEventAttendeeResponse _tentative = new CalendarEventAttendeeResponse("_tentative");
    private static TypeDesc typeDesc = new TypeDesc(CalendarEventAttendeeResponse.class);

    protected CalendarEventAttendeeResponse(String value) {
        this._value_ = value;
        _table_.put(this._value_, this);
    }

    public String getValue() {
        return this._value_;
    }

    public static CalendarEventAttendeeResponse fromValue(String value) throws IllegalArgumentException {
        CalendarEventAttendeeResponse enumeration = (CalendarEventAttendeeResponse)_table_.get(value);
        if(enumeration == null) {
            throw new IllegalArgumentException();
        } else {
            return enumeration;
        }
    }

    public static CalendarEventAttendeeResponse fromString(String value) throws IllegalArgumentException {
        return fromValue(value);
    }

    public boolean equals(Object obj) {
        return obj == this;
    }

    public int hashCode() {
        return this.toString().hashCode();
    }

    public String toString() {
        return this._value_;
    }

    public Object readResolve() throws ObjectStreamException {
        return fromValue(this._value_);
    }

    public static Serializer getSerializer(String mechType, Class _javaType, QName _xmlType) {
        return new EnumSerializer(_javaType, _xmlType);
    }

    public static Deserializer getDeserializer(String mechType, Class _javaType, QName _xmlType) {
        return new EnumDeserializer(_javaType, _xmlType);
    }

    public static TypeDesc getTypeDesc() {
        return typeDesc;
    }

    static {
        typeDesc.setXmlType(new QName("urn:types.core_2018_1.platform.webservices.netsuite.com", "CalendarEventAttendeeResponse"));
    }
}