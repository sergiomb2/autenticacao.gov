/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.35
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

namespace be.portugal.eid {

using System;
using System.Runtime.InteropServices;

public class PTEID_Picture : PTEID_Biometric {
  private HandleRef swigCPtr;

  internal PTEID_Picture(IntPtr cPtr, bool cMemoryOwn) : base(pteidlib_dotNetPINVOKE.PTEID_PictureUpcast(cPtr), cMemoryOwn) {
    swigCPtr = new HandleRef(this, cPtr);
  }

  internal static HandleRef getCPtr(PTEID_Picture obj) {
    return (obj == null) ? new HandleRef(null, IntPtr.Zero) : obj.swigCPtr;
  }

  ~PTEID_Picture() {
    Dispose();
  }

  public override void Dispose() {
    lock(this) {
      if(swigCPtr.Handle != IntPtr.Zero && swigCMemOwn) {
        swigCMemOwn = false;
        pteidlib_dotNetPINVOKE.delete_PTEID_Picture(swigCPtr);
      }
      swigCPtr = new HandleRef(null, IntPtr.Zero);
      GC.SuppressFinalize(this);
      base.Dispose();
    }
  }

  public PTEID_ByteArray getData() {
    PTEID_ByteArray ret = new PTEID_ByteArray(pteidlib_dotNetPINVOKE.PTEID_Picture_getData(swigCPtr), false);
    if (pteidlib_dotNetPINVOKE.SWIGPendingException.Pending) throw pteidlib_dotNetPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public PTEID_ByteArray getHash() {
    PTEID_ByteArray ret = new PTEID_ByteArray(pteidlib_dotNetPINVOKE.PTEID_Picture_getHash(swigCPtr), false);
    if (pteidlib_dotNetPINVOKE.SWIGPendingException.Pending) throw pteidlib_dotNetPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

}

}
