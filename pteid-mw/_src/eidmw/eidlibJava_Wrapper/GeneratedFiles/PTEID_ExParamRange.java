/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.35
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package be.portugal.eid;

public class PTEID_ExParamRange extends PTEID_Exception {
  private long swigCPtr;

  protected PTEID_ExParamRange(long cPtr, boolean cMemoryOwn) {
    super(pteidlibJava_WrapperJNI.SWIGPTEID_ExParamRangeUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(PTEID_ExParamRange obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if(swigCPtr != 0 && swigCMemOwn) {
      swigCMemOwn = false;
      pteidlibJava_WrapperJNI.delete_PTEID_ExParamRange(swigCPtr);
    }
    swigCPtr = 0;
    super.delete();
  }

  public PTEID_ExParamRange() {
    this(pteidlibJava_WrapperJNI.new_PTEID_ExParamRange(), true);
  }

}
