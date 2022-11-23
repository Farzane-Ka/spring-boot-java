package com.project.farzane.sus.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import javax.validation.constraints.Min;
import javax.validation.constraints.Max;


@Table("SUSTABLE")
public class Sus {
    @Id
    private Integer id;
    @Min(1)
    @Max(5)
    private Integer question1;

    @Min(1)
    @Max(5)
    private Integer question2;
    @Min(1)
    @Max(5)
    private Integer question3;
    @Min(1)
    @Max(5)
    private Integer question4;
    @Min(1)
    @Max(5)
    private Integer question5;
    @Min(1)
    @Max(5)
    private Integer question6;
    @Min(1)
    @Max(5)
    private Integer question7;
    @Min(1)
    @Max(5)
    private Integer question8;
    @Min(1)
    @Max(5)
    private Integer question9;
    @Min(1)
    @Max(5)
    private Integer question10;
    public Sus() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getQuestion1() {
        return question1;
    }

    public void setQuestion1(Integer question1) {
        this.question1 = question1;
    }

    public Integer getQuestion2() {
        return question2;
    }

    public void setQuestion2(Integer question2) {
        this.question2 = question2;
    }

    public Integer getQuestion3() {
        return question3;
    }

    public void setQuestion3(Integer question3) {
        this.question3 = question3;
    }

    public Integer getQuestion4() {
        return question4;
    }

    public void setQuestion4(Integer question4) {
        this.question4 = question4;
    }

    public Integer getQuestion5() {
        return question5;
    }

    public void setQuestion5(Integer question5) {
        this.question5 = question5;
    }

    public Integer getQuestion6() {
        return question6;
    }

    public void setQuestion6(Integer question6) {
        this.question6 = question6;
    }

    public Integer getQuestion7() {
        return question7;
    }

    public void setQuestion7(Integer question7) {
        this.question7 = question7;
    }

    public Integer getQuestion8() {
        return question8;
    }

    public void setQuestion8(Integer question8) {
        this.question8 = question8;
    }

    public Integer getQuestion9() {
        return question9;
    }

    public void setQuestion9(Integer question9) {
        this.question9 = question9;
    }

    public Integer getQuestion10() {
        return question10;
    }

    public void setQuestion10(Integer question10) {
        this.question10 = question10;
    }
}
