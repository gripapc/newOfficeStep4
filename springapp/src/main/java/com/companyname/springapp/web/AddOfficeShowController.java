package com.companyname.springapp.web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.companyname.springapp.domain.Office;
import com.companyname.springapp.service.AddOffice;
import com.companyname.springapp.service.OfficeManager;


@Controller
@RequestMapping(value="/addoffice.htm")
public class AddOfficeShowController {

    /** Logger for this class and subclasses */
    protected final Log logger = LogFactory.getLog(getClass());

    @Autowired
    private OfficeManager officeManager;
    private Office newOffice;

    @RequestMapping(method = RequestMethod.POST)
    public String onSubmit(@Valid AddOffice addOffice, BindingResult result)
    {
        if (result.hasErrors()) {
            return "addoffice";
        }
        String newName = addOffice.getName();
        String newStreet = addOffice.getStreet();
        int newPhone = addOffice.getPhone();
        int newZip = addOffice.getZip();
        newOffice = new Office(newName, newStreet, newPhone, newZip);
        officeManager.addOffice(newOffice);
        return "redirect:/hello.htm";
    }
    @RequestMapping(method = RequestMethod.GET)
    protected AddOffice formBackingObject(HttpServletRequest request) throws ServletException {
        AddOffice addOffice = new AddOffice();
       addOffice.setName("");
        return addOffice;
    }

   

  
}