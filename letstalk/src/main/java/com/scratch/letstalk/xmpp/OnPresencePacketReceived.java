package com.scratch.letstalk.xmpp;

import com.scratch.letstalk.entities.Account;
import com.scratch.letstalk.xmpp.stanzas.PresencePacket;

public interface OnPresencePacketReceived extends PacketReceived {
	public void onPresencePacketReceived(Account account, PresencePacket packet);
}
