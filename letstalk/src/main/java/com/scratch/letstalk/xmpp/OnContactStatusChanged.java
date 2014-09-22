package com.scratch.letstalk.xmpp;

import com.scratch.letstalk.entities.Contact;

public interface OnContactStatusChanged {
	public void onContactStatusChanged(Contact contact, boolean online);
}
