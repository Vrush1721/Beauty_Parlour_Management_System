package com.DAO;

import java.util.List;

import com.entity.Feedback;


public interface FeedDAO {
   public boolean addfeedback(Feedback f);
   public List<Feedback> getAllFeedback();
   public boolean Deletefeed(int id);
}
