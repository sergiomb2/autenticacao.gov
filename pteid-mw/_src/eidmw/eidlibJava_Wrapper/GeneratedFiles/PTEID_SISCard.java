/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.35
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package be.portugal.eid;

public class PTEID_SISCard extends PTEID_MemoryCard {
  private long swigCPtr;

  protected PTEID_SISCard(long cPtr, boolean cMemoryOwn) {
    super(pteidlibJava_WrapperJNI.SWIGPTEID_SISCardUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(PTEID_SISCard obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if(swigCPtr != 0 && swigCMemOwn) {
      swigCMemOwn = false;
      pteidlibJava_WrapperJNI.delete_PTEID_SISCard(swigCPtr);
    }
    swigCPtr = 0;
    super.delete();
  }

  public PTEID_XMLDoc getDocument(PTEID_DocumentType type) throws java.lang.Exception {
    return new PTEID_XMLDoc(pteidlibJava_WrapperJNI.PTEID_SISCard_getDocument(swigCPtr, this, type.swigValue()), false);
  }

  public PTEID_SisFullDoc getFullDoc() throws java.lang.Exception {
    return new PTEID_SisFullDoc(pteidlibJava_WrapperJNI.PTEID_SISCard_getFullDoc(swigCPtr, this), false);
  }

  public PTEID_SisId getID() throws java.lang.Exception {
    return new PTEID_SisId(pteidlibJava_WrapperJNI.PTEID_SISCard_getID(swigCPtr, this), false);
  }

  public PTEID_ByteArray getRawData(PTEID_RawDataType type) throws java.lang.Exception {
    return new PTEID_ByteArray(pteidlibJava_WrapperJNI.PTEID_SISCard_getRawData(swigCPtr, this, type.swigValue()), false);
  }

  public PTEID_ByteArray getRawData_Id() throws java.lang.Exception {
    return new PTEID_ByteArray(pteidlibJava_WrapperJNI.PTEID_SISCard_getRawData_Id(swigCPtr, this), false);
  }

}
