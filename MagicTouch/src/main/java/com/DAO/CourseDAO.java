package com.DAO;

import java.util.List;


import com.entity.Courses;




public interface CourseDAO {
   public boolean addcourse(Courses c);
   public List<Courses> getAllcourse();
   public Courses getcourseById(int id);
   public boolean Delcourse(int id);
   public boolean Updatecourse(Courses c);
   public List<Courses>displaycourse();
}
