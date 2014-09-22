/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: D:\\AndroidstudioProjects\\Letstalk\\openpgpapilib\\src\\main\\aidl\\org\\openintents\\openpgp\\IOpenPgpService.aidl
 */
package org.openintents.openpgp;
public interface IOpenPgpService extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements org.openintents.openpgp.IOpenPgpService
{
private static final java.lang.String DESCRIPTOR = "org.openintents.openpgp.IOpenPgpService";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an org.openintents.openpgp.IOpenPgpService interface,
 * generating a proxy if needed.
 */
public static org.openintents.openpgp.IOpenPgpService asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof org.openintents.openpgp.IOpenPgpService))) {
return ((org.openintents.openpgp.IOpenPgpService)iin);
}
return new org.openintents.openpgp.IOpenPgpService.Stub.Proxy(obj);
}
@Override public android.os.IBinder asBinder()
{
return this;
}
@Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
{
switch (code)
{
case INTERFACE_TRANSACTION:
{
reply.writeString(DESCRIPTOR);
return true;
}
case TRANSACTION_execute:
{
data.enforceInterface(DESCRIPTOR);
android.content.Intent _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.Intent.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
android.os.ParcelFileDescriptor _arg1;
if ((0!=data.readInt())) {
_arg1 = android.os.ParcelFileDescriptor.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
android.os.ParcelFileDescriptor _arg2;
if ((0!=data.readInt())) {
_arg2 = android.os.ParcelFileDescriptor.CREATOR.createFromParcel(data);
}
else {
_arg2 = null;
}
android.content.Intent _result = this.execute(_arg0, _arg1, _arg2);
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
_result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements org.openintents.openpgp.IOpenPgpService
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
// see OpenPgpApi for documentation

@Override public android.content.Intent execute(android.content.Intent data, android.os.ParcelFileDescriptor input, android.os.ParcelFileDescriptor output) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.content.Intent _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((data!=null)) {
_data.writeInt(1);
data.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((input!=null)) {
_data.writeInt(1);
input.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((output!=null)) {
_data.writeInt(1);
output.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_execute, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.content.Intent.CREATOR.createFromParcel(_reply);
}
else {
_result = null;
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
}
static final int TRANSACTION_execute = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
}
// see OpenPgpApi for documentation

public android.content.Intent execute(android.content.Intent data, android.os.ParcelFileDescriptor input, android.os.ParcelFileDescriptor output) throws android.os.RemoteException;
}
