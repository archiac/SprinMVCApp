package by.marchanka.springmvc.Controllers;

import by.marchanka.springmvc.Dao.StructureDao;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Artur Marchanka
 */
@Controller
@RequestMapping("/structures")
public class AppController {

    @Autowired
    private StructureDao structureDao;

   @GetMapping
    public String findAll(Model model){
       model.addAttribute("structures",structureDao.findAll());
       return "structures/findall";
   }
    @GetMapping("/{id}")
    public String findById(@PathVariable("id") int id, Model model){
        model.addAttribute("structure",structureDao.findById(id));
    return "structures/findbyid";
    }
}
