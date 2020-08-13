package com.mycompany.rest;

import java.util.List;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author korth
 */
@RestController
public class ResultController {

    @PostMapping("/res")
    public Result result(@RequestBody Data values) {
        List<Integer> val = values.getAddress().getValues();
        int sum = calcSum(val);
        int res = calcDigitSum(sum);
        return new Result(res);
    }

    public int calcSum(List<Integer> values) {
        List<Integer> val = values;
        int res = 0;
        for (int sum : val) {
            res = res + sum;
        }
        return res;
    }

    public int calcDigitSum(int n) {
        int sum = 0;
        while (n != 0) {
            sum = sum + n % 10;
            n = n / 10;
        }
        return sum;
    }
}
