package com.scratch.letstalk.xmpp;

import com.scratch.letstalk.entities.Account;
import com.scratch.letstalk.xmpp.stanzas.IqPacket;

public interface OnIqPacketReceived extends PacketReceived {
	public void onIqPacketReceived(Account account, IqPacket packet);
}
