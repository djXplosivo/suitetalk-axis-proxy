package com.netsuite.suitetalk.proxy.v2018_1.platform;

import javax.xml.rpc.Service;
import javax.xml.rpc.ServiceException;
import java.net.URL;

public interface NetSuiteService extends Service {
   String getNetSuitePortAddress();

   NetSuitePortType getNetSuitePort() throws ServiceException;

   NetSuitePortType getNetSuitePort(URL var1) throws ServiceException;
}
