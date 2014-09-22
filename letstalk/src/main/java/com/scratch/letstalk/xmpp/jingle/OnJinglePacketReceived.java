package com.scratch.letstalk.xmpp.jingle;

import com.scratch.letstalk.entities.Account;
import com.scratch.letstalk.xmpp.PacketReceived;
import com.scratch.letstalk.xmpp.jingle.stanzas.JinglePacket;

public interface OnJinglePacketReceived extends PacketReceived {
	public void onJinglePacketReceived(Account account, JinglePacket packet);
}
