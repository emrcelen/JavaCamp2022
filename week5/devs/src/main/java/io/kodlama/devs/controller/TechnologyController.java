package io.kodlama.devs.controller;

import io.kodlama.devs.bussiness.abstracts.TechnologyService;
import io.kodlama.devs.bussiness.concretes.TechnologyManager;
import io.kodlama.devs.bussiness.request.technology.CreateTechnologyRequest;
import io.kodlama.devs.bussiness.request.technology.DeleteTechnologyRequest;
import io.kodlama.devs.bussiness.request.technology.UpdateTechnologyRequest;
import io.kodlama.devs.bussiness.responses.technology.GetAllTechnologyResponse;
import io.kodlama.devs.bussiness.responses.technology.GetTechnologyByIdResponse;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/technology")
public class TechnologyController {
    private TechnologyService technologyService;

    public TechnologyController(TechnologyService technologyService){
        this.technologyService = technologyService;
    }
    @PutMapping("/add")
    public void add(CreateTechnologyRequest createTechnologyRequest){
        this.technologyService.add(createTechnologyRequest);
    }
    @DeleteMapping("/delete")
    public void delete (DeleteTechnologyRequest deleteTechnologyRequest){
        this.technologyService.delete(deleteTechnologyRequest);
    }
    @PutMapping("/update")
    public void update(int id,UpdateTechnologyRequest updateTechnologyRequest){
        this.technologyService.update(id,updateTechnologyRequest);
    }
    @GetMapping("/getAll")
    public List<GetAllTechnologyResponse> getAll(){
        return this.technologyService.getAll();
    }
    @GetMapping("/getById")
    public GetTechnologyByIdResponse getById(int technologyId){
        return this.technologyService.getById(technologyId);
    }
}
