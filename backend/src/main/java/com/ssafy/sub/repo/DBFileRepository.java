package com.ssafy.sub.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ssafy.sub.dto.DBFile;

@Repository
public interface DBFileRepository extends JpaRepository<DBFile, String> {
	public Optional<List<DBFile>> findAllByFid(int fid);
}
