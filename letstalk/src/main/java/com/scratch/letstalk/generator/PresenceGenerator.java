package com.scratch.letstalk.generator;

import com.scratch.letstalk.entities.Account;
import com.scratch.letstalk.entities.Contact;
import com.scratch.letstalk.services.XmppConnectionService;
import com.scratch.letstalk.xml.Element;
import com.scratch.letstalk.xmpp.stanzas.PresencePacket;

public class PresenceGenerator extends AbstractGenerator {

	public PresenceGenerator(XmppConnectionService service) {
		super(service);
	}

	private PresencePacket subscription(String type, Contact contact) {
		PresencePacket packet = new PresencePacket();
		packet.setAttribute("type", type);
		packet.setAttribute("to", contact.getJid());
		packet.setAttribute("from", contact.getAccount().getJid());
		return packet;
	}

	public PresencePacket requestPresenceUpdatesFrom(Contact contact) {
		return subscription("subscribe", contact);
	}

	public PresencePacket stopPresenceUpdatesFrom(Contact contact) {
		return subscription("unsubscribe", contact);
	}

	public PresencePacket stopPresenceUpdatesTo(Contact contact) {
		return subscription("unsubscribed", contact);
	}

	public PresencePacket sendPresenceUpdatesTo(Contact contact) {
		return subscription("subscribed", contact);
	}

	public PresencePacket sendPresence(Account account) {
		PresencePacket packet = new PresencePacket();
		packet.setAttribute("from", account.getFullJid());
		String sig = account.getPgpSignature();
		if (sig != null) {
			packet.addChild("status").setContent("online");
			packet.addChild("x", "jabber:x:signed").setContent(sig);
		}
		String capHash = getCapHash();
		if (capHash != null) {
			Element cap = packet.addChild("c",
					"http://jabber.org/protocol/caps");
			cap.setAttribute("hash", "sha-1");
			cap.setAttribute("node", "http://conversions.siacs.eu");
			cap.setAttribute("ver", capHash);
		}
		return packet;
	}
}