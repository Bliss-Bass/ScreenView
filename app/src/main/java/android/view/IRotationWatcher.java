/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package android.view;
public interface IRotationWatcher extends android.os.IInterface
{
  /** Default implementation for IRotationWatcher. */
  public static class Default implements android.view.IRotationWatcher
  {
    @Override public void onRotationChanged(int rotation) throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements android.view.IRotationWatcher
  {
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an android.view.IRotationWatcher interface,
     * generating a proxy if needed.
     */
    public static android.view.IRotationWatcher asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof android.view.IRotationWatcher))) {
        return ((android.view.IRotationWatcher)iin);
      }
      return new android.view.IRotationWatcher.Stub.Proxy(obj);
    }
    @Override public android.os.IBinder asBinder()
    {
      return this;
    }
    @Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
    {
      java.lang.String descriptor = DESCRIPTOR;
      if (code >= android.os.IBinder.FIRST_CALL_TRANSACTION && code <= android.os.IBinder.LAST_CALL_TRANSACTION) {
        data.enforceInterface(descriptor);
      }
      switch (code)
      {
        case INTERFACE_TRANSACTION:
        {
          reply.writeString(descriptor);
          return true;
        }
      }
      switch (code)
      {
        case TRANSACTION_onRotationChanged:
        {
          int _arg0;
          _arg0 = data.readInt();
          this.onRotationChanged(_arg0);
          break;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
      return true;
    }
    private static class Proxy implements android.view.IRotationWatcher
    {
      private android.os.IBinder mRemote;
      Proxy(android.os.IBinder remote)
      {
        mRemote = remote;
      }
      @Override public android.os.IBinder asBinder()
      {
        return mRemote;
      }
      public java.lang.String getInterfaceDescriptor()
      {
        return DESCRIPTOR;
      }
      @Override public void onRotationChanged(int rotation) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(rotation);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onRotationChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
        }
        finally {
          _data.recycle();
        }
      }
    }
    public static final java.lang.String DESCRIPTOR = "android.view.IRotationWatcher";
    static final int TRANSACTION_onRotationChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
  }
  public void onRotationChanged(int rotation) throws android.os.RemoteException;
}
