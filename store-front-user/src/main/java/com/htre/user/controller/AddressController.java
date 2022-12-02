package com.htre.user.controller;

import com.htre.param.AddressListParam;
import com.htre.param.AddressParam;
import com.htre.param.AddressRemoveParam;
import com.htre.pojo.Address;
import com.htre.user.service.AddressService;
import com.htre.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * @Author panjinsheng
 * @Create 2022/11/26 21:46
 * Description: 地址的控制controller
 */

@RestController
@RequestMapping("user/address")
public class AddressController {

    @Autowired
    private AddressService addressService;

    @PostMapping("list")
    public R list(@RequestBody @Validated AddressListParam addressListParam, BindingResult result) {

        if (result.hasErrors()) {
            return R.fail("参数异常,查询失败!");
        }
        return addressService.list(addressListParam.getUserId());
    }

    @PostMapping("save")
    public R save(@RequestBody @Validated AddressParam addressParam, BindingResult result){

        if (result.hasErrors()){

            return R.fail("参数异常,保存失败!");
        }

        Address address = addressParam.getAdd();
        address.setUserId(addressParam.getUserId());

        return addressService.save(address);
    }

    @PostMapping("remove")
    public R remove(@RequestBody @Validated AddressRemoveParam addressRemoveParam, BindingResult result){
        if (result.hasErrors()) {
            return R.fail("参数异常,删除失败!");
        }

        return addressService.remove(addressRemoveParam.getId());
    }
}