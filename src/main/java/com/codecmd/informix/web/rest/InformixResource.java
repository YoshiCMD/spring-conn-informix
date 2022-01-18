package com.codecmd.informix.web.rest;

import com.codecmd.informix.domain.TestTable;
import com.codecmd.informix.repository.TestTableRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class InformixResource {
    private final Logger log = LoggerFactory.getLogger(InformixResource.class);

    private final TestTableRepository testTableRepository;

    public InformixResource(TestTableRepository testTableRepository) {
        this.testTableRepository = testTableRepository;
    }

    @GetMapping("/test-table")
    public ResponseEntity<List<TestTable>> getAll() {
        log.debug("GET /api/kraken/invoice - get all test table items");
        return ResponseEntity.ok(testTableRepository.findAll());
    }

    @PostMapping("/test-table")
    public ResponseEntity<TestTable> add(@RequestBody TestTable request) {
        log.debug("POST /api/kraken/invoice - add test table item");
        return ResponseEntity.ok(testTableRepository.save(request));
    }

    @GetMapping("/test-table/{id}")
    public ResponseEntity<TestTable> getOne(@PathVariable Integer id) {
        log.debug("GET /api/kraken/invoice/{id} - get one test table by id");
        return ResponseEntity.ok(testTableRepository.findById(id).get());
    }

}
