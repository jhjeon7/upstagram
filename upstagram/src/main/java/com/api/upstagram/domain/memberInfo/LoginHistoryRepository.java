package com.api.upstagram.domain.memberInfo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginHistoryRepository extends JpaRepository<LoginHistoryEntity, String> {
    
}