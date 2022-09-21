package com.example.homework_2_3.controller;

import com.example.homework_2_3.service.CalculateService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CalculateController {
    private final CalculateService calculateService;

    @GetMapping("/calculate")
    public String salute(){
        return "Ты решил воспользоваться мною, но ты делаешь это без уважения!..." +
                "Ну ладно, сегодня разрешаю.";
    }
    @GetMapping("/calculate/plus")
    public String addition (@RequestParam(name = "num1", required = false) Integer a,
                            @RequestParam(name = "num2", required = false) Integer b){
        if (a == null || b == null) return "Введите оба параметра.";
        int addition = calculateService.addition(a, b);
        return a + " + " + b + " = " + addition;
    }
    @GetMapping("/calculate/minus")
    public String subtraction(@RequestParam(name = "num1", required = false) Integer a,
                              @RequestParam(name = "num2", required = false) Integer b){
        if (a == null || b == null) return "Введите оба параметра.";
        int subtraction = calculateService.subtraction(a, b);
        return a + " - " + b + " = " + subtraction;
    }
    @GetMapping("/calculate/multiply")
    public String multiplication(@RequestParam(name = "num1", required = false) Integer a,
                                 @RequestParam(name = "num2", required = false) Integer b){
        if (a == null || b == null) return "Введите оба параметра.";
        int multiplication = calculateService.multiplication(a, b);
        return a + " * " + b + " = " + multiplication;
    }
    @GetMapping("/calculate/divide")
    public String division(@RequestParam(name = "num1", required = false) Integer a,
                           @RequestParam(name = "num2", required = false) Integer b){
        if (a == null || b == null) return "Введите оба параметра.";
        double division = calculateService.division(a, b);
        return a + " / " + b + " = " + division;
    }
}
