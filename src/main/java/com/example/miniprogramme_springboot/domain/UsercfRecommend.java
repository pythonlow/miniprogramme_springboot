package com.example.miniprogramme_springboot.domain;

import java.util.Date;

public class UsercfRecommend {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column usercfrecommend.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column usercfrecommend.score
     *
     * @mbggenerated
     */
    private Float score;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column usercfrecommend.time
     *
     * @mbggenerated
     */
    private Date time;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column usercfrecommend.id
     *
     * @return the value of usercfrecommend.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column usercfrecommend.id
     *
     * @param id the value for usercfrecommend.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column usercfrecommend.score
     *
     * @return the value of usercfrecommend.score
     *
     * @mbggenerated
     */
    public Float getScore() {
        return score;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column usercfrecommend.score
     *
     * @param score the value for usercfrecommend.score
     *
     * @mbggenerated
     */
    public void setScore(Float score) {
        this.score = score;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column usercfrecommend.time
     *
     * @return the value of usercfrecommend.time
     *
     * @mbggenerated
     */
    public Date getTime() {
        return time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column usercfrecommend.time
     *
     * @param time the value for usercfrecommend.time
     *
     * @mbggenerated
     */
    public void setTime(Date time) {
        this.time = time;
    }
}