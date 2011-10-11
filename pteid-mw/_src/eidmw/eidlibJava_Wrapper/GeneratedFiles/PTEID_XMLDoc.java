/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.35
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package be.portugal.eid;

public class PTEID_XMLDoc extends PTEID_Object {
  private long swigCPtr;

  protected PTEID_XMLDoc(long cPtr, boolean cMemoryOwn) {
    super(pteidlibJava_WrapperJNI.SWIGPTEID_XMLDocUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(PTEID_XMLDoc obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if(swigCPtr != 0 && swigCMemOwn) {
      swigCMemOwn = false;
      pteidlibJava_WrapperJNI.delete_PTEID_XMLDoc(swigCPtr);
    }
    swigCPtr = 0;
    super.delete();
  }

  public boolean isAllowed() {
    return pteidlibJava_WrapperJNI.PTEID_XMLDoc_isAllowed(swigCPtr, this);
  }

  public PTEID_ByteArray getXML() throws java.lang.Exception {
    return new PTEID_ByteArray(pteidlibJava_WrapperJNI.PTEID_XMLDoc_getXML(swigCPtr, this), true);
  }

  public PTEID_ByteArray getCSV() throws java.lang.Exception {
    return new PTEID_ByteArray(pteidlibJava_WrapperJNI.PTEID_XMLDoc_getCSV(swigCPtr, this), true);
  }

  public PTEID_ByteArray getTLV() throws java.lang.Exception {
    return new PTEID_ByteArray(pteidlibJava_WrapperJNI.PTEID_XMLDoc_getTLV(swigCPtr, this), true);
  }

  public boolean writeXmlToFile(String csFilePath) throws java.lang.Exception {
    return pteidlibJava_WrapperJNI.PTEID_XMLDoc_writeXmlToFile(swigCPtr, this, csFilePath);
  }

  public boolean writeCsvToFile(String csFilePath) throws java.lang.Exception {
    return pteidlibJava_WrapperJNI.PTEID_XMLDoc_writeCsvToFile(swigCPtr, this, csFilePath);
  }

  public boolean writeTlvToFile(String csFilePath) throws java.lang.Exception {
    return pteidlibJava_WrapperJNI.PTEID_XMLDoc_writeTlvToFile(swigCPtr, this, csFilePath);
  }

}
