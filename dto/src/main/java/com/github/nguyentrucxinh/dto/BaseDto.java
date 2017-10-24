package com.github.nguyentrucxinh.dto;

import com.github.nguyentrucxinh.helper.constant.MySQLConstant;

import javax.validation.constraints.Max;
import java.io.Serializable;

public abstract class BaseDto implements Serializable {

    @Max(MySQLConstant.BIGINT_MAX)
    private Long id;

    public interface validateOnCreate {
    }

    public interface validateOnUpdate {
    }

}
