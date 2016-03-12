package com.khyzhun.sasha.server.repository;

import com.khyzhun.sasha.server.entity.Remind;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RemindRepository extends JpaRepository<Remind, Long> {
}
