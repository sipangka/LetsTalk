package com.scratch.letstalk.xmpp;

import com.scratch.letstalk.entities.Account;
import com.scratch.letstalk.xmpp.stanzas.MessagePacket;

public interface OnMessagePacketReceived extends PacketReceived {
	public void onMessagePacketReceived(Account account, MessagePacket packet);
}
