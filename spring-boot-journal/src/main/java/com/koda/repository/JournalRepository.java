package com.koda.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.koda.domain.Journal;

public interface JournalRepository extends JpaRepository<Journal, Long>{ }
