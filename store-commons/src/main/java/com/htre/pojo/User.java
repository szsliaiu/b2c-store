package com.htre.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

/**
 * Package: com.htre.pojo
 * Description: 用户的实体类
 *
 * @Author panjinsheng
 * @Create 2022/11/26 19:57
 * @Version 1.0
 */

@Data
@TableName("user")
public class User implements Serializable {

    public static final Long serialVersionUID = 1L;

    @JsonProperty("user_id") //jackson的注解,用于进行属性格式化!
    @TableId(type =  IdType.AUTO)
    private Integer userId;

    @Length(min = 6)
    private String userName;
        //忽略属性 不生成json 不接受json数据  @JsonIgnore
        // @JsonInclude(JsonInclude.Include.NON_NULL)  + null 当这个值不为null的时候生成json,为null不生成
        // 不影响接收json
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @NotBlank
    private String password;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @NotBlank
    private String userPhonenumber;
}