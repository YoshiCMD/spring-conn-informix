package com.codecmd.informix.repository;

import com.codecmd.informix.domain.TestTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestTableRepository extends JpaRepository<TestTable, Integer> {
}
