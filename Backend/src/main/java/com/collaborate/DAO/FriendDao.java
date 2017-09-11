package com.collaborate.DAO;

import java.util.List;


import com.collaborate.Model.Friend;

public interface FriendDao {
	
	public boolean createFriend(Friend friend);
	public Friend getForumdetails(int friendId);
	public List<Friend> getFriend();
	public boolean approveFriend(Friend friend);
	public boolean editFriend(int friendId);
	public boolean deleteFriend(int friendId);
}



