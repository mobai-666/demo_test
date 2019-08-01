//package com.lalala.repository;
//
//import java.util.List;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
//import com.lalala.entity.Student;
//
//public interface StudentRepository extends JpaRepository<Student, Integer> {
//	
//	//条件查询
//	@Query(value = "select * from Student where sex=:sex", nativeQuery = true)
//	List<Student> findSex(@Param("sex") String string);
//
//}
