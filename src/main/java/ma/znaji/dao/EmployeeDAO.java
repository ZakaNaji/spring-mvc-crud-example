package ma.znaji.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import ma.znaji.model.Employee;

public class EmployeeDAO {
    JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public int save(Employee employee) {
        String sql = "INSER INT emp(name, salary, resume) VALUES ('" + employee.getName() + "', " + employee.getSalary() + ", '" + employee.getResume() + "')";
        System.out.println(sql);
        return jdbcTemplate.update(sql);
    }
}
