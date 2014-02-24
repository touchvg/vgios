/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package rhcad.touchvg.core;

public class ConstShapes {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected ConstShapes(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ConstShapes obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        touchvgJNI.delete_ConstShapes(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public ConstShapes(int n) {
    this(touchvgJNI.new_ConstShapes__SWIG_0(n), true);
  }

  public ConstShapes() {
    this(touchvgJNI.new_ConstShapes__SWIG_1(), true);
  }

  public void setSize(int n) {
    touchvgJNI.ConstShapes_setSize(swigCPtr, this, n);
  }

  public int count() {
    return touchvgJNI.ConstShapes_count(swigCPtr, this);
  }

  public MgShape get(int index) {
    long cPtr = touchvgJNI.ConstShapes_get(swigCPtr, this, index);
    return (cPtr == 0) ? null : new MgShape(cPtr, false);
  }

  public void set(int index, MgShape value) {
    touchvgJNI.ConstShapes_set__SWIG_0(swigCPtr, this, index, MgShape.getCPtr(value), value);
  }

  public void set(int index, MgShape v1, MgShape v2) {
    touchvgJNI.ConstShapes_set__SWIG_1(swigCPtr, this, index, MgShape.getCPtr(v1), v1, MgShape.getCPtr(v2), v2);
  }

}
