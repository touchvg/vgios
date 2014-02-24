/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package rhcad.touchvg.core;

public class GiSaveClipBox {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected GiSaveClipBox(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(GiSaveClipBox obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        touchvgJNI.delete_GiSaveClipBox(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public GiSaveClipBox(GiGraphics gs, Box2d rectWorld) {
    this(touchvgJNI.new_GiSaveClipBox(GiGraphics.getCPtr(gs), gs, Box2d.getCPtr(rectWorld), rectWorld), true);
  }

  public boolean succeed() {
    return touchvgJNI.GiSaveClipBox_succeed(swigCPtr, this);
  }

}
