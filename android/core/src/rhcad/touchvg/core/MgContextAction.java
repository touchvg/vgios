/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package rhcad.touchvg.core;

public final class MgContextAction {
  public final static MgContextAction kMgActionInvalid = new MgContextAction("kMgActionInvalid", touchvgJNI.kMgActionInvalid_get());
  public final static MgContextAction kMgActionSelAll = new MgContextAction("kMgActionSelAll", touchvgJNI.kMgActionSelAll_get());
  public final static MgContextAction kMgActionSelReset = new MgContextAction("kMgActionSelReset", touchvgJNI.kMgActionSelReset_get());
  public final static MgContextAction kMgActionDraw = new MgContextAction("kMgActionDraw", touchvgJNI.kMgActionDraw_get());
  public final static MgContextAction kMgActionCancel = new MgContextAction("kMgActionCancel", touchvgJNI.kMgActionCancel_get());
  public final static MgContextAction kMgActionDelete = new MgContextAction("kMgActionDelete", touchvgJNI.kMgActionDelete_get());
  public final static MgContextAction kMgActionClone = new MgContextAction("kMgActionClone", touchvgJNI.kMgActionClone_get());
  public final static MgContextAction kMgActionFixedLength = new MgContextAction("kMgActionFixedLength", touchvgJNI.kMgActionFixedLength_get());
  public final static MgContextAction kMgActionFreeLength = new MgContextAction("kMgActionFreeLength", touchvgJNI.kMgActionFreeLength_get());
  public final static MgContextAction kMgActionLocked = new MgContextAction("kMgActionLocked", touchvgJNI.kMgActionLocked_get());
  public final static MgContextAction kMgActionUnlocked = new MgContextAction("kMgActionUnlocked", touchvgJNI.kMgActionUnlocked_get());
  public final static MgContextAction kMgActionEditVertex = new MgContextAction("kMgActionEditVertex", touchvgJNI.kMgActionEditVertex_get());
  public final static MgContextAction kMgActionHideVertex = new MgContextAction("kMgActionHideVertex", touchvgJNI.kMgActionHideVertex_get());
  public final static MgContextAction kMgActionClosed = new MgContextAction("kMgActionClosed", touchvgJNI.kMgActionClosed_get());
  public final static MgContextAction kMgActionOpened = new MgContextAction("kMgActionOpened", touchvgJNI.kMgActionOpened_get());
  public final static MgContextAction kMgActionAddVertex = new MgContextAction("kMgActionAddVertex", touchvgJNI.kMgActionAddVertex_get());
  public final static MgContextAction kMgActionDelVertex = new MgContextAction("kMgActionDelVertex", touchvgJNI.kMgActionDelVertex_get());
  public final static MgContextAction kMgActionGroup = new MgContextAction("kMgActionGroup", touchvgJNI.kMgActionGroup_get());
  public final static MgContextAction kMgActionUngroup = new MgContextAction("kMgActionUngroup", touchvgJNI.kMgActionUngroup_get());
  public final static MgContextAction kMgActionOverturn = new MgContextAction("kMgActionOverturn", touchvgJNI.kMgActionOverturn_get());
  public final static MgContextAction kMgActionCustomized = new MgContextAction("kMgActionCustomized", touchvgJNI.kMgActionCustomized_get());

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static MgContextAction swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + MgContextAction.class + " with value " + swigValue);
  }

  private MgContextAction(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private MgContextAction(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private MgContextAction(String swigName, MgContextAction swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static MgContextAction[] swigValues = { kMgActionInvalid, kMgActionSelAll, kMgActionSelReset, kMgActionDraw, kMgActionCancel, kMgActionDelete, kMgActionClone, kMgActionFixedLength, kMgActionFreeLength, kMgActionLocked, kMgActionUnlocked, kMgActionEditVertex, kMgActionHideVertex, kMgActionClosed, kMgActionOpened, kMgActionAddVertex, kMgActionDelVertex, kMgActionGroup, kMgActionUngroup, kMgActionOverturn, kMgActionCustomized };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

