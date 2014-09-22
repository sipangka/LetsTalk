package com.scratch.letstalk.xmpp.jingle.stanzas;

import com.scratch.letstalk.xml.Element;

public class Reason extends Element {
	private Reason(String name) {
		super(name);
	}

	public Reason() {
		super("reason");
	}
}
