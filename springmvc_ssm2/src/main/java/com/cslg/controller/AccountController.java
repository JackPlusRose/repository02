package com.cslg.controller;

import com.cslg.domain.Account;
import com.cslg.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.util.List;
import java.util.UUID;

@Controller("accountController")
@RequestMapping(path = "/account")
public class AccountController {
    @Autowired
    private IAccountService iAccountService=null;
    @RequestMapping("/testFindAll")
    public String testFindAll(Model model){
        System.out.println("表现层查询所有");
        List<Account> all = iAccountService.findAll();
        model.addAttribute("list",all);
        return "list";
    }
    @RequestMapping("/testSaveAccount")
    public void testSaveAccount(HttpServletRequest request, HttpServletResponse response, Account account)throws Exception{
        System.out.println("表现层保存");
        iAccountService.saveAccount(account);
        response.sendRedirect(request.getContextPath()+"/account/testFindAll");
    }
    @RequestMapping("/testUpload")
    public void testUpload(MultipartFile upload,HttpServletRequest request, HttpServletResponse response) throws Exception{
//        建立保存的文件夹
        String path = request.getSession().getServletContext().getRealPath("/imgs");
        File file = new File(path);
        if (!file.exists()){
            file.mkdirs();
        }
//        获取文件名
        String name = upload.getOriginalFilename();
        String str = UUID.randomUUID().toString().replace("-", "");
        name=str+"_"+name;
//        上传文件
        upload.transferTo(new File(path,name));
    }
}
