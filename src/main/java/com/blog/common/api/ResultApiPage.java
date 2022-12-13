package com.blog.common.api;

import cn.hutool.core.convert.Convert;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.Data;

import java.util.List;

/*
 * @Author Echo
 * @Description 分页数据封装类
 * @Date 20:08 2022/12/13
 **/

@Data
public class ResultApiPage<T> {
    private Integer pageNum;
    private Integer pageSize;
    private Integer totalPage;
    private Long total;
    private List<T> list;

    /**
     * 将MyBatis Plus 分页结果转化为通用结果
     */
    public static <T> ResultApiPage<T> restPage(Page<T> pageResult) {
        ResultApiPage<T> result = new ResultApiPage<>();
        result.setPageNum(Convert.toInt(pageResult.getCurrent()));
        result.setPageSize(Convert.toInt(pageResult.getSize()));
        result.setTotal(pageResult.getTotal());
        result.setTotalPage(Convert.toInt(pageResult.getTotal()/pageResult.getSize()+1));
        result.setList(pageResult.getRecords());
        return result;
    }
}
