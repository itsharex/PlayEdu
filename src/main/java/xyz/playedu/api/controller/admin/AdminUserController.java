package xyz.playedu.api.controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import xyz.playedu.api.domain.AdminUser;
import xyz.playedu.api.service.impl.AdminUserServiceImpl;
import xyz.playedu.api.types.PageResult;

@RestController
public class AdminUserController {

    @Autowired
    private AdminUserServiceImpl adminUserService;

    @GetMapping("/admin/user/index")
    public PageResult<AdminUser> List(@RequestParam("page") Integer page, @RequestParam("size") Integer size) {
        PageResult<AdminUser> result = adminUserService.paginate(page, size, null);
        return result;
    }

}