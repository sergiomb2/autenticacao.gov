/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.35
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package be.portugal.eid;

/******************************************************************************//**
  * Exception class Command Not Allowed (error code = EIDMW_ERR_CMD_NOT_ALLOWED)
  *
  *	Thrown when the command asked is not allowed
  * Used in : - PTEID_SmartCard.writeFile()
  *********************************************************************************/
public class PTEID_ExCmdNotAllowed extends PTEID_Exception {
  private long swigCPtr;

  protected PTEID_ExCmdNotAllowed(long cPtr, boolean cMemoryOwn) {
    super(pteidlibJava_WrapperJNI.SWIGPTEID_ExCmdNotAllowedUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(PTEID_ExCmdNotAllowed obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if(swigCPtr != 0 && swigCMemOwn) {
      swigCMemOwn = false;
      pteidlibJava_WrapperJNI.delete_PTEID_ExCmdNotAllowed(swigCPtr);
    }
    swigCPtr = 0;
    super.delete();
  }

	/** Constructor */
  public PTEID_ExCmdNotAllowed() {
    this(pteidlibJava_WrapperJNI.new_PTEID_ExCmdNotAllowed(), true);
  }

}
