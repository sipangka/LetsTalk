package com.scratch.letstalk.xmpp;

import com.scratch.letstalk.entities.Account;

public interface OnMessageAcknowledged {
	public void onMessageAcknowledged(Account account, String id);
}
