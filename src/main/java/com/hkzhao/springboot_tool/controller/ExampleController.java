package com.hkzhao.springboot_tool.controller;

import com.hkzhao.springboot_tool.dto.ExampleDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

/**
 * <h3>springboot_tool</h3>
 * <p></p>
 *
 * @author : hkzhao
 * @date : 2021-05-15 10:50
 **/
@RestController
@RequestMapping("/example")
@Api(tags = "example restful api ")
public class ExampleController {

    @GetMapping("/get")
    @ApiOperation(value = "get example",notes = "get example for my builder")
    public String get(@RequestParam("id") Integer id){
        return "example: "+id;
    }

    @PostMapping("/post")
    @ApiOperation(value = "post example",notes = "post example for mu builder")
    public String post(@RequestBody ExampleDTO exampleDTO){
        return exampleDTO.getName();
    }
}
