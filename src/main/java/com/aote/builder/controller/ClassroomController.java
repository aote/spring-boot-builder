package com.aote.builder.controller;

import com.aote.builder.core.Result;
import com.aote.builder.core.ResultGenerator;
import com.aote.builder.model.Classroom;
import com.aote.builder.service.ClassroomService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by CodeGenerator on 2020/04/17.
 */
@RestController
@RequestMapping("/classroom")
public class ClassroomController {
    @Resource
    private ClassroomService classroomService;

    @PostMapping("/add")
    public Result add(Classroom classroom) {
        classroomService.save(classroom);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        classroomService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(Classroom classroom) {
        classroomService.update(classroom);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        Classroom classroom = classroomService.findById(id);
        return ResultGenerator.genSuccessResult(classroom);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<Classroom> list = classroomService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
