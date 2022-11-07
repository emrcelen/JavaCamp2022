package io.kodlama.devs.bussiness.abstracts;

import io.kodlama.devs.bussiness.request.language.CreateLanguageRequest;
import io.kodlama.devs.bussiness.request.language.DeleteLanguageRequest;
import io.kodlama.devs.bussiness.request.language.UpdateLanguageRequest;
import io.kodlama.devs.bussiness.responses.language.GetAllLanguageResponse;
import io.kodlama.devs.bussiness.responses.language.GetLanguageByIdResponse;

import java.util.List;

public interface ProgrammingLanguageService {
    void add(CreateLanguageRequest createLanguageRequest);
    void delete(DeleteLanguageRequest deleteLanguageRequest);
    void update(int id, UpdateLanguageRequest updateLanguageRequest);
    List<GetAllLanguageResponse> getAll();
    GetLanguageByIdResponse getById (int languageId);
}
