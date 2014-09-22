package com.scratch.letstalk.xmpp.stanzas.csi;

import com.scratch.letstalk.xmpp.stanzas.AbstractStanza;

public class ActivePacket extends AbstractStanza {
	public ActivePacket() {
		super("active");
		setAttribute("xmlns", "urn:xmpp:csi:0");
	}
}
