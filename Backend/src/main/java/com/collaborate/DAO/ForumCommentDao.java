package com.collaborate.DAO;

import java.util.List;

import com.collaborate.Model.ForumComment;

public interface ForumCommentDao {
	

	public boolean createForum(ForumComment forumcomment);
	public ForumComment getForumcommentdetails(int id);
	public List<ForumComment> getForumComment();
    public boolean editForumComment(int id);
	public boolean deleteForumComment(int id);
}


