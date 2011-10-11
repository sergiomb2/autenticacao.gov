/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.35
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package be.portugal.eid;

/******************************************************************************//**
  * Class that holds the different PIN uasage definitions
  *********************************************************************************/
public final class PTEID_PinUsage {
	/** Pin usage unknown */
  public final static PTEID_PinUsage PTEID_PIN_USG_UNKNOWN = new PTEID_PinUsage("PTEID_PIN_USG_UNKNOWN");
	/** Pin usage authentication */
  public final static PTEID_PinUsage PTEID_PIN_USG_AUTH = new PTEID_PinUsage("PTEID_PIN_USG_AUTH");
	/** Pin usage signature */
  public final static PTEID_PinUsage PTEID_PIN_USG_SIGN = new PTEID_PinUsage("PTEID_PIN_USG_SIGN");
	/** Pin usage address */
  public final static PTEID_PinUsage PTEID_PIN_USG_ADDRESS = new PTEID_PinUsage("PTEID_PIN_USG_ADDRESS");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static PTEID_PinUsage swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + PTEID_PinUsage.class + " with value " + swigValue);
  }

  private PTEID_PinUsage(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private PTEID_PinUsage(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private PTEID_PinUsage(String swigName, PTEID_PinUsage swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static PTEID_PinUsage[] swigValues = { PTEID_PIN_USG_UNKNOWN, PTEID_PIN_USG_AUTH, PTEID_PIN_USG_SIGN, PTEID_PIN_USG_ADDRESS };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

