package com.netsuite.suitetalk.proxy.v2018_1.platform;

import org.apache.axis.AxisFault;
import org.apache.axis.EngineConfiguration;
import org.apache.axis.client.Service;
import org.apache.axis.client.Stub;

import javax.xml.namespace.QName;
import javax.xml.rpc.ServiceException;
import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.Remote;
import java.util.HashSet;
import java.util.Iterator;

public class NetSuiteServiceLocator extends Service implements NetSuiteService {
   private String NetSuitePort_address = "file://localhost/opt/teamcity-agents/agent-001/work/ea3b4aae0350e89c/NetLedger_WebServices/suitetalk-axis-proxy/v2018_1_0/build/htdocs/services/NetSuitePort_2018_1";
   private String NetSuitePortWSDDServiceName = "NetSuitePort";
   private HashSet ports = null;

   public NetSuiteServiceLocator() {
      super();
   }

   public NetSuiteServiceLocator(EngineConfiguration config) {
      super(config);
   }

   public NetSuiteServiceLocator(String wsdlLoc, QName sName) throws ServiceException {
      super(wsdlLoc, sName);
   }

   public String getNetSuitePortAddress() {
      return this.NetSuitePort_address;
   }

   public String getNetSuitePortWSDDServiceName() {
      return this.NetSuitePortWSDDServiceName;
   }

   public void setNetSuitePortWSDDServiceName(String name) {
      this.NetSuitePortWSDDServiceName = name;
   }

   public NetSuitePortType getNetSuitePort() throws ServiceException {
      URL endpoint;
      try {
         endpoint = new URL(this.NetSuitePort_address);
      } catch (MalformedURLException var3) {
         throw new ServiceException(var3);
      }

      return this.getNetSuitePort(endpoint);
   }

   public NetSuitePortType getNetSuitePort(URL portAddress) throws ServiceException {
      try {
         NetSuiteBindingStub _stub = new NetSuiteBindingStub(portAddress, this);
         _stub.setPortName(this.getNetSuitePortWSDDServiceName());
         return _stub;
      } catch (AxisFault var3) {
         return null;
      }
   }

   public void setNetSuitePortEndpointAddress(String address) {
      this.NetSuitePort_address = address;
   }

   public Remote getPort(Class serviceEndpointInterface) throws ServiceException {
      try {
         if (NetSuitePortType.class.isAssignableFrom(serviceEndpointInterface)) {
            NetSuiteBindingStub _stub = new NetSuiteBindingStub(new URL(this.NetSuitePort_address), this);
            _stub.setPortName(this.getNetSuitePortWSDDServiceName());
            return _stub;
         }
      } catch (Throwable var3) {
         throw new ServiceException(var3);
      }

      throw new ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
   }

   public Remote getPort(QName portName, Class serviceEndpointInterface) throws ServiceException {
      if (portName == null) {
         return this.getPort(serviceEndpointInterface);
      } else {
         String inputPortName = portName.getLocalPart();
         if ("NetSuitePort".equals(inputPortName)) {
            return this.getNetSuitePort();
         } else {
            Remote _stub = this.getPort(serviceEndpointInterface);
            ((Stub)_stub).setPortName(portName);
            return _stub;
         }
      }
   }

   public QName getServiceName() {
      return new QName("urn:platform_2018_1.webservices.netsuite.com", "NetSuiteService");
   }

   public Iterator getPorts() {
      if (this.ports == null) {
         this.ports = new HashSet();
         this.ports.add(new QName("urn:platform_2018_1.webservices.netsuite.com", "NetSuitePort"));
      }

      return this.ports.iterator();
   }

   public void setEndpointAddress(String portName, String address) throws ServiceException {
      if ("NetSuitePort".equals(portName)) {
         this.setNetSuitePortEndpointAddress(address);
      } else {
         throw new ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
      }
   }

   public void setEndpointAddress(QName portName, String address) throws ServiceException {
      this.setEndpointAddress(portName.getLocalPart(), address);
   }
}
