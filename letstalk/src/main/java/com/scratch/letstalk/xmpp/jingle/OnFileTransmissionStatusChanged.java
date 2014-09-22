package com.scratch.letstalk.xmpp.jingle;

public interface OnFileTransmissionStatusChanged {
	public void onFileTransmitted(JingleFile file);

	public void onFileTransferAborted();
}
