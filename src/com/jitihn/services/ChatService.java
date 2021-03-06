package com.jitihn.services;

import java.util.List;

import com.jitihn.domains.Ads;
import com.jitihn.domains.Chat;
import com.jitihn.domains.User;

public interface ChatService {
	public void addAChat(Chat chat);

	public List<Chat> getChatList(int senderId, int receiverId, int adsId);
	
	public List<User> getUserChatWithMe(int currentUserId);
	
	public List<Ads> getAdsChatted(int userId, int loggedInUser);
}
