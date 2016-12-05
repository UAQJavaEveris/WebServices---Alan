package com.mx.everis.ser;

public class SumasProxy implements com.mx.everis.ser.Sumas {
  private String _endpoint = null;
  private com.mx.everis.ser.Sumas sumas = null;
  
  public SumasProxy() {
    _initSumasProxy();
  }
  
  public SumasProxy(String endpoint) {
    _endpoint = endpoint;
    _initSumasProxy();
  }
  
  private void _initSumasProxy() {
    try {
      sumas = (new com.mx.everis.ser.SumasServiceLocator()).getSumasPort();
      if (sumas != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)sumas)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)sumas)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (sumas != null)
      ((javax.xml.rpc.Stub)sumas)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.mx.everis.ser.Sumas getSumas() {
    if (sumas == null)
      _initSumasProxy();
    return sumas;
  }
  
  public int getSuma(int arg0, int arg1) throws java.rmi.RemoteException{
    if (sumas == null)
      _initSumasProxy();
    return sumas.getSuma(arg0, arg1);
  }
  
  public int getSumaArrayNum(java.lang.Integer[] arg0) throws java.rmi.RemoteException{
    if (sumas == null)
      _initSumasProxy();
    return sumas.getSumaArrayNum(arg0);
  }
  
  public int getSumaT(int arg0, int arg1, int arg2) throws java.rmi.RemoteException{
    if (sumas == null)
      _initSumasProxy();
    return sumas.getSumaT(arg0, arg1, arg2);
  }
  
  
}