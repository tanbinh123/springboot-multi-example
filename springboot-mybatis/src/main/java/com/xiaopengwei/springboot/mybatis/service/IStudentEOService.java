package com.xiaopengwei.springboot.mybatis.service;import com.xiaopengwei.springboot.mybatis.entity.StudentEO;import java.util.List;/** * <p> * 业务逻辑接口 * </p> * * @author github.com/xpwi * @since 2019-04-12 */public interface IStudentEOService {    StudentEO getStudentByStudentId(int studentId);    int createStudent(StudentEO studentEO);    List<StudentEO> selectAll();}