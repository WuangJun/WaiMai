package com.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.reggie.dto.SetmealDto;
import com.reggie.entity.SetmealDish;
import com.reggie.mapper.SetmealDishMapper;
import com.reggie.service.SetmealDishService;
import com.reggie.service.SetmealService;
import org.springframework.stereotype.Service;

/**
 * Author:WJ
 * Date:2022/11/16 11:46
 * Description:<>
 */
@Service
public class SetmealDishServiceIml extends ServiceImpl<SetmealDishMapper, SetmealDish> implements SetmealDishService {
}
