package io.javabrains.course;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepository courseRepository;
	
	public Optional<Course> getCourse(String id) {
		 return courseRepository.findById(id);
	}

	public void addCourse(Course topic) {
		courseRepository.save(topic);
	}
	
	public void updateCourse(Course topic) {
		courseRepository.save(topic);
	}
	
	public void deleteCourse(String id) {
		courseRepository.deleteById(id);
	}

	public List<Course> getAllCourses(String topicId) {
		List<Course> courses = new ArrayList<>();
		courseRepository.findByTopicId(topicId).forEach(courses::add);
		return courses;
	}
}
