package cn.edu.nciae.ustudy.dto;

import cn.edu.nciae.ustudy.po.CourseCategory;
import cn.edu.nciae.ustudy.po.CourseDescription;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

/**
 * @author tang
 * @author zhang
 */
public class CourseDTO {

    /**
     * 课程名称
     */
    private String name;

    /**
     * 预览图
     */
    private String previewPicture;

    /**
     * 免费
     */
    private Boolean free;

    /**
     * 原价
     */
    private BigDecimal originalPrice;

    /**
     * 现价
     */
    private BigDecimal presentPrice;

    /**
     * 分类
     */
    private List<CourseCategory> courseCategories;

    /**
     * 授课方式（用+间隔）
     */
    private String teachingMethods;

    /**
     * 推出时间
     */
    private LocalDate publishedTime;

    /**
     * 学习人数
     */
    private Integer studentsNumber;

    /**
     * 有效期
     */
    private Integer validDays;

    /**
     * 联系方式
     */
    private String phone;

    /**
     * 课时
     */
    private Integer classHour;

    /**
     * 课程介绍
     */
    private List<CourseDescription> courseDescriptions;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPreviewPicture() {
        return previewPicture;
    }

    public void setPreviewPicture(String previewPicture) {
        this.previewPicture = previewPicture;
    }

    public Boolean getFree() {
        return free;
    }

    public void setFree(Boolean free) {
        this.free = free;
    }

    public BigDecimal getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(BigDecimal originalPrice) {
        this.originalPrice = originalPrice;
    }

    public BigDecimal getPresentPrice() {
        return presentPrice;
    }

    public void setPresentPrice(BigDecimal presentPrice) {
        this.presentPrice = presentPrice;
    }

    public List<CourseCategory> getCourseCategories() {
        return courseCategories;
    }

    public void setCourseCategories(List<CourseCategory> courseCategories) {
        this.courseCategories = courseCategories;
    }

    public String getTeachingMethods() {
        return teachingMethods;
    }

    public void setTeachingMethods(String teachingMethods) {
        this.teachingMethods = teachingMethods;
    }

    public LocalDate getPublishedTime() {
        return publishedTime;
    }

    public void setPublishedTime(LocalDate publishedTime) {
        this.publishedTime = publishedTime;
    }

    public Integer getStudentsNumber() {
        return studentsNumber;
    }

    public void setStudentsNumber(Integer studentsNumber) {
        this.studentsNumber = studentsNumber;
    }

    public Integer getValidDays() {
        return validDays;
    }

    public void setValidDays(Integer validDays) {
        this.validDays = validDays;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getClassHour() {
        return classHour;
    }

    public void setClassHour(Integer classHour) {
        this.classHour = classHour;
    }

    public List<CourseDescription> getCourseDescriptions() {
        return courseDescriptions;
    }

    public void setCourseDescriptions(List<CourseDescription> courseDescriptions) {
        this.courseDescriptions = courseDescriptions;
    }

    @Override
    public String toString() {
        return "CourseDTO{" +
                "name='" + name + '\'' +
                ", previewPicture='" + previewPicture + '\'' +
                ", free=" + free +
                ", originalPrice=" + originalPrice +
                ", presentPrice=" + presentPrice +
                ", courseCategories=" + courseCategories +
                ", teachingMethods='" + teachingMethods + '\'' +
                ", publishedTime=" + publishedTime +
                ", studentsNumber=" + studentsNumber +
                ", validDays=" + validDays +
                ", phone='" + phone + '\'' +
                ", classHour=" + classHour +
                ", courseDescriptions=" + courseDescriptions +
                '}';
    }
}
