package com.hkzhao.springboot_tool.dto;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * <h3>springboot_tool</h3>
 * <p></p>
 *
 * @author : hkzhao
 * @date : 2021-05-15 10:53
 **/
@Data
@Accessors(chain = true)
public class ExampleDTO {
    private Integer id;
    private String name;
}
