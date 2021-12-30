package by.marchanka.springmvc.Dao;

import by.marchanka.springmvc.Models.Structure;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Artur Marchanka
 */

@Component
public class StructureDao {
    private List<Structure> structures;

    {
        structures =new ArrayList<>();
        structures.add(new Structure(1,"Arrays"));
        structures.add(new Structure(2,"Stack"));
        structures.add(new Structure(3,"Queue"));
        structures.add(new Structure(4,"Linked List"));
        structures.add(new Structure(5,"Tree"));
        structures.add(new Structure(6,"Graph"));
        structures.add(new Structure(6,"Trie"));
        structures.add(new Structure(6,"Hash Table"));
    }

    public List<Structure> findAll(){
        return structures;
    }

    public Structure findById(int id){
        return structures.stream().filter(stucture->stucture.getId()==id).findAny().orElse(null);
    }
}
