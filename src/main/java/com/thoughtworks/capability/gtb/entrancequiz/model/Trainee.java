package com.thoughtworks.capability.gtb.entrancequiz.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// TODO GTB-知识点: * 能够使用Lombok减少代码量
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Trainee {
    // TODO GTB-完成度: - 没有处理参数校验
    private Integer id;
    private String name;
    private Boolean grouped;
}
