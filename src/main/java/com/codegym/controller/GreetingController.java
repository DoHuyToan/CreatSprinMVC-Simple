package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {
    @GetMapping("/toandaica")

    //    @Controller: là annotation để đánh dấu lớp GreetingController là một controller (đối tượng sẽ xử lý các request)
//    @GetMapping: là annotation để đánh dấu phương thức greeting()
//    là một phương thức dùng để xử lý request khi có một request GET được gửi đến đường dẫn "/toandaica".

//    Sau khi một action trong controller hoàn thành nhiệm vụ,
//    thì nó phải chỉ ra view nào cần được sử dụng để hiển thị giao diện kết quả cho người dùng.
//    Chỉ có tên view được chỉ định trong action,
//    còn vị trí đặt view, hoặc phần mở rộng của view thì giao lại cho ViewResolver giải quyết.
//


    public String greeting(@RequestParam String name, Model model) {
        model.addAttribute("name", name);
        return "index";
    }
    // Điền tên trên thanh URL

//    @RequestParam: là annotation để đánh dấu rằng name là tham số được truyền vào
//    model: là đối tượng để truyền dữ liệu từ controller sang view
//    model.addAttribute(): là phương thức để truyền một dữ liệu từ controller sang view
}
