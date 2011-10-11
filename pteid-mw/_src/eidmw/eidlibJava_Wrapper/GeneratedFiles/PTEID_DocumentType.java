/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.35
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package be.portugal.eid;

public final class PTEID_DocumentType {
  public final static PTEID_DocumentType PTEID_DOCTYPE_FULL = new PTEID_DocumentType("PTEID_DOCTYPE_FULL", pteidlibJava_WrapperJNI.PTEID_DOCTYPE_FULL_get());
  public final static PTEID_DocumentType PTEID_DOCTYPE_ID = new PTEID_DocumentType("PTEID_DOCTYPE_ID");
  public final static PTEID_DocumentType PTEID_DOCTYPE_PICTURE = new PTEID_DocumentType("PTEID_DOCTYPE_PICTURE");
  public final static PTEID_DocumentType PTEID_DOCTYPE_INFO = new PTEID_DocumentType("PTEID_DOCTYPE_INFO");
  public final static PTEID_DocumentType PTEID_DOCTYPE_PINS = new PTEID_DocumentType("PTEID_DOCTYPE_PINS");
  public final static PTEID_DocumentType PTEID_DOCTYPE_CERTIFICATES = new PTEID_DocumentType("PTEID_DOCTYPE_CERTIFICATES");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static PTEID_DocumentType swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + PTEID_DocumentType.class + " with value " + swigValue);
  }

  private PTEID_DocumentType(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private PTEID_DocumentType(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private PTEID_DocumentType(String swigName, PTEID_DocumentType swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static PTEID_DocumentType[] swigValues = { PTEID_DOCTYPE_FULL, PTEID_DOCTYPE_ID, PTEID_DOCTYPE_PICTURE, PTEID_DOCTYPE_INFO, PTEID_DOCTYPE_PINS, PTEID_DOCTYPE_CERTIFICATES };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

