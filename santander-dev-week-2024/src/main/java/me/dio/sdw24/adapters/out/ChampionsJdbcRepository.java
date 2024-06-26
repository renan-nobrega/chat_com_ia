package me.dio.sdw24.adapters.out;

import java.util.List;
import java.util.Optional;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import me.dio.sdw24.domain.model.Champions;
import me.dio.sdw24.domain.ports.ChampionsRepository;

@Repository
public class ChampionsJdbcRepository implements ChampionsRepository {

    private final JdbcTemplate jdbcTemplate;
    private final RowMapper<Champions> rowMapper;

    public ChampionsJdbcRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
        this.rowMapper = ((rs, rowNum) -> new Champions(
            rs.getLong("id"),
            rs.getString("name"),
            rs.getString("role"),
            rs.getString("lore"),
            rs.getString("imageUrl")

        ))
    }

    @Override
    public List<Champions> findAll() {
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    @Override
    public Optional<Champions> findById(Long id) {
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }
}
