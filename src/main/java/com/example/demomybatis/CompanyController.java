package com.example.demomybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/company")
public class CompanyController {

    @Autowired
    private CompanyMapper companyMapper;

    @Autowired
    private CompanyService companyService;

    @PostMapping("")
    public Company post(@RequestBody Company company) throws Exception{
//        companyMapper.insert(company);
        companyService.add(company);
        return company;
    }

    @GetMapping("")
    public List<Company> getAll(){
        return companyMapper.getAll();
    }

    @GetMapping("/{id}")
    public Company getById(@PathVariable("id") int id){
        return companyMapper.getById(id);
    }
}
