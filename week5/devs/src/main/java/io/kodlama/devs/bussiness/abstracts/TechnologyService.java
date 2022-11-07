package io.kodlama.devs.bussiness.abstracts;

import io.kodlama.devs.bussiness.request.technology.CreateTechnologyRequest;
import io.kodlama.devs.bussiness.request.technology.DeleteTechnologyRequest;
import io.kodlama.devs.bussiness.request.technology.UpdateTechnologyRequest;
import io.kodlama.devs.bussiness.responses.technology.GetAllTechnologyResponse;
import io.kodlama.devs.bussiness.responses.technology.GetTechnologyByIdResponse;

import java.util.List;

public interface TechnologyService {
    void add(CreateTechnologyRequest createTechnologyRequest);
    void delete(DeleteTechnologyRequest deleteTechnologyRequest);
    void update(int id,UpdateTechnologyRequest updateTechnologyRequest);
    List<GetAllTechnologyResponse> getAll();
    GetTechnologyByIdResponse getById (int technologyId);
}
