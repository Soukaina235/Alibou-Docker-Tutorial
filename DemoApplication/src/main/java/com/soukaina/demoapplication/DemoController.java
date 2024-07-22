package com.soukaina.demoapplication;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/demo")
public class DemoController {
    private final DemoRepository repository;

    public DemoController(DemoRepository demoRepository) {
        this.repository = demoRepository;
    }

    @GetMapping
    public List<DemoEntity> findAll() {
        return repository.findAll();
    }

    @PostMapping
    public DemoEntity save(@RequestBody DemoEntity demo) {
        return repository.save(demo);
    }

    @GetMapping("/{id}")
    public DemoEntity findById(@PathVariable Integer id) {
        return repository.findById(id).orElse(new DemoEntity());
    }
}
